import java.util.Scanner;

public class dayOne {
    public static void main(String[] args) {
        int initial = 50;
        int counter = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            String ourInput = input.nextLine();
            if (ourInput.isEmpty()) {
                break;
            }
            String side = ourInput.substring(0, 1);
            String number =  ourInput.substring(1);
            int numberInt = Integer.parseInt(number);
            if (side.equalsIgnoreCase("L")) {
                initial = (initial - numberInt + 100) % 100;
            }  else if (side.equalsIgnoreCase("R")) {
                initial = (initial + numberInt) % 100;
            }
            if (initial == 0) {
                counter++;
            }
            System.out.println(initial);
        }
        System.out.println("final " + initial);
        System.out.println(counter);
    }
}