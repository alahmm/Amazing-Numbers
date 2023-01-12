package buzznumbers;

import java.util.Scanner;

public class Main {
    public static void BuzzNumberVerifier(String number) {
        if (Integer.parseInt(number) < 1) {
            System.out.println("This number is not natural!");
            return;
        } else {
            System.out.printf("Properties of %s%n", number);
            if (Integer.parseInt(number) % 2 == 0) {
                String str = """
                                even: true
                                 odd: false
                        """;
                System.out.print(str);
            } else {
                String str = """
                                even: false
                                 odd: true
                        """;
                System.out.print(str);
            }
            char character1 = number.charAt(number.length() - 1);
            int character = character1 - 48;
            if (Integer.parseInt(number) % 7 == 0 || character == 7) {

                System.out.println("        buzz: true");
            } else {
                System.out.println("        buzz: false");
            }
/*            char character2 = number.charAt(0);
            int characterNew = character2 - 48;*/
            int counter =0;
            for (int i = 1; i < number.length(); i++) {
                char character3 = number.charAt(i);
                int character4= character3 - 48;
                if ((character4 == 0))  {
                    counter ++;
                }
            }
            if (counter != 0) {
                System.out.println("        duck: true");
            } else {
                System.out.println("        duck: false");

            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter a natural number:");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        BuzzNumberVerifier(number);
    }
}
