package buzznumbers;

import java.util.Scanner;

public class Main {
    public static void BuzzNumberVerifier(String number) {
        if (Integer.parseInt(number) < 1) {
            System.out.println("This number is not natural!");
            return;
        }
        if (Integer.parseInt(number) % 2 == 0) {
            System.out.println("This number is Even.");
        } else {
            System.out.println("This number is Odd.");
        }
        char character1 = number.charAt(number.length() - 1);
        int character = character1 - 48;
        if (Integer.parseInt(number) % 7 == 0 && character != 7 ) {

            String str = """
                    It is a Buzz number.
                    Explanation:""";
            System.out.println(str);
            System.out.printf("%n%s is divisible by 7.", number);
        } else if (character == 7 && Integer.parseInt(number) % 7 != 0) {
            String str = """
                    It is a Buzz number.
                    Explanation:""";
            System.out.println(str);
            System.out.printf("%s ends with 7..", number);

        } else if (Integer.parseInt(number) % 7 == 0 && character == 7 ) {
            String str = """
                    It is a Buzz number.
                    Explanation:""";
            System.out.println(str);
            System.out.printf("%s is divisible by 7 and ends with 7.", number);

        } else {
            String str = """
                    It is not a Buzz number.
                    Explanation:""";
            System.out.println(str);
            System.out.printf("%s  is neither divisible by 7 nor does it end with 7.", number);

        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a natural number:");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        BuzzNumberVerifier(number);
    }
}
