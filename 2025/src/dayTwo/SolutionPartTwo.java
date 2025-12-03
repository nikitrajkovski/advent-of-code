package dayTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionPartTwo {

    public static boolean isSequenceRepeated(long number) {
        int sizeOfNum = String.valueOf(number).length();
        String numberString = String.valueOf(number);
        for (int i = 1; i <= sizeOfNum / 2; i++) {
            if (sizeOfNum % i != 0) continue;

            String pattern = numberString.substring(0, i);
            StringBuilder sb = new StringBuilder();
            int count = sizeOfNum / i;

            for (int j=0; j<count; j++) sb.append(pattern);
            if (sb.toString().equals(numberString)) return true;
        }
        return false;
    }

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
                boolean hasSequence = isSequenceRepeated(i);
                if (hasSequence) {
                    counter+=i;
                }
            }
        }
        System.out.println(counter);
    }
}