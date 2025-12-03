package dayThree;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        long totalJoltage = 0;
        int max;
        int maxIndex;
        int secondMax;
        Scanner input = new Scanner(System.in);
        while (true) {
            max = 0;
            maxIndex = 0;
            secondMax = 0;
            String ourInput = input.nextLine();
            if (ourInput.isEmpty()) {
                break;
            }
            int numberSize = ourInput.length();
            char[] number = ourInput.toCharArray();
            for (int i = 0; i < numberSize - 1; i++) {
                int currentNumber = Integer.parseInt(String.valueOf(number[i]));
                if (currentNumber > max) {
                    max = currentNumber;
                    maxIndex = i;
                }
            }
            for (int i = maxIndex+1; i< numberSize; i++) {
                int currentNumber = Integer.parseInt(String.valueOf(number[i]));
                if (currentNumber > secondMax) {
                    secondMax = currentNumber;
                }
            }
            int sum = max * 10 + secondMax;
            System.out.println(sum);
            totalJoltage += sum;
        }
        System.out.println(totalJoltage);
    }
}
