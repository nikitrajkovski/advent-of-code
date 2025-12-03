package dayTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        long counter = 0;
        Scanner input = new Scanner(System.in);
        String ourInput = input.nextLine();
        if (ourInput.isEmpty()) {
            return;
        }
        String[] array = ourInput.split(",");
        List<String[]> numbers = new ArrayList<>();
        for (String number : array) {
            numbers.add(number.split("-"));
        }
        for (String[] range : numbers) {
            long first = Long.parseLong(range[0]);
            long second = Long.parseLong(range[1]);
            for (long i = first; i <= second; i++) {
                int size = String.valueOf(i).length();
                if (size % 2 == 0) {
                    int delimiter = size / 2;
                    int delimiterPow = (int) Math.pow(10, delimiter);
                    long firstHalf = i/delimiterPow;
                    long secondHalf = i%delimiterPow;
                    if (firstHalf == secondHalf) {
                        counter += i;
                    }
                    System.out.println(firstHalf + " " + secondHalf + "with delimiterPow:" + delimiterPow);
                }
            }
        }
        System.out.println(counter);
    }
}
