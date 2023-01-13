package buzznumbers;

import java.util.Scanner;

public class Main {

    public static boolean IsSpy (String number) {
        int sum =0;
        int product = 1;
        for (int i = 0; i < number.length(); i++) {
            char variable = number.charAt(i);
            int integer = variable - 48;
            sum += integer;
            product *= integer;
        }
        return sum == product;
    }
    public static boolean IsEven (String number) {
        return Long.parseLong(number) % 2 == 0;
    }
    public static boolean IsBuzz (String number) {
        char character1 = number.charAt(number.length() - 1);
        int character = character1 - 48;
        return Long.parseLong(number) % 7 == 0 || character == 7;
    }
    public static boolean IsDuck (String number) {
        int counter =0;
        for (int i = 1; i < number.length(); i++) {
            char character3 = number.charAt(i);
            int character4= character3 - 48;
            if ((character4 == 0))  {
                counter ++;
            }
        }
        return counter != 0;
    }
    public static boolean IsPalindromic (String number) {
        StringBuilder builder = new StringBuilder();
        builder.append(number);
        StringBuilder builder2 =  new StringBuilder();
        for (int i = 0; i < builder.length(); i++) {
            builder2.append(builder.charAt(builder.length() - 1 - i));
        }
        boolean isSymetric = true;
        for (int i = 0; i < builder.length(); i++) {
            if(builder.charAt(i) != builder2.charAt(i)) {
                isSymetric = false;
                break;
            }
        }
        return isSymetric;
    }
    public static boolean IsGapful (String number) {
            char[] element = new char[] {number.charAt(0) , number.charAt(number.length() - 1)};
            String string = String.valueOf(element);
            return number.length() > 2 && (Long.parseLong(number) % Long.parseLong(string) == 0);
    }
    public static void PropertiesProvider(String number) {
        if (Long.parseLong(number) < 0) {
            System.out.println("The first parameter should be a natural number or zero.");
        } else {
            if (IsEven(number)) {
                System.out.printf("           %n%s is even", number);
            } else {
                System.out.printf("           %n%s is odd", number);
            }
            if (IsBuzz(number)) {
                System.out.print(", buzz");
            }
            if (IsDuck(number)) {
                System.out.print(", duck");
            }
            if (IsPalindromic(number)) {
                System.out.print(", palindromic");
            }
                if (IsGapful(number)) {
                    System.out.print(", gapful");
                }
            if (IsSpy(number)) {
                System.out.println(", spy");
            }
        }

    }
    public static void BuzzNumberVerifier(String number) {
        if (Long.parseLong(number) < 0) {
            System.out.println("The first parameter should be a natural number or zero.");
        } else {
            System.out.printf("Properties of %s%n", number);
            if (IsEven(number)) {
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
            if (IsBuzz(number)) {

                System.out.println("        buzz: true");
            } else {
                System.out.println("        buzz: false");
            }
            if (IsDuck(number)) {
                System.out.println("        duck: true");
            } else {
                System.out.println("        duck: false");

            }

            if (IsPalindromic(number)) {
                System.out.println(" palindromic: true");
            } else {
                System.out.println(" palindromic: false");
            }
                if (IsGapful(number)) {
                    System.out.println("      gapful: true");
                } else {
                    System.out.println("      gapful: false");
                }
            if (IsSpy(number)) {
                System.out.println("         spy: true");
            } else {
                System.out.println("         spy: false");
            }
        }

    }

    public static void duckProvider (String[] list) {
            String variable = list[0];
            Long variable2 = Long.parseLong(variable);
            int counter = 0;
            long number2 = Long.parseLong(list[1]);
            while (counter < number2) {
                if (IsDuck(variable)) {
                    PropertiesProvider(variable);
                    counter++;
                    variable2++;
                    variable = Long.toString(variable2);
                } else {
                    variable2++;
                    variable = Long.toString(variable2);
                }
            }
    }
    public static void EvenProvider (String[] list) {
        String variable = list[0];
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (IsEven(variable)) {
                PropertiesProvider(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void OddProvider (String[] list) {
        String variable = list[0];
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (!IsEven(variable)) {
                PropertiesProvider(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void GapfelProvider (String[] list) {
        String variable = list[0];
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (IsGapful(variable)) {
                PropertiesProvider(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void PalindromicProvider (String[] list) {
        String variable = list[0];
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (IsPalindromic(variable)) {
                PropertiesProvider(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void BuzzProvider (String[] list) {
        String variable = list[0];
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (IsBuzz(variable)) {
                PropertiesProvider(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void SpyProvider (String[] list) {
        String variable = list[0];
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (IsSpy(variable)) {
                PropertiesProvider(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Amazing Numbers!");
        String str = """
                
Supported requests:
- enter a natural number to know its properties;
- enter two natural numbers to obtain the properties of the list:
  * the first parameter represents a starting number;
  * the second parameter shows how many consecutive numbers are to be printed;
- two natural numbers and a property to search for;
- separate the parameters with one space;
- enter 0 to exit.""";
        System.out.println(str);
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println();
            System.out.print("Enter a request:");
            String number = scanner.nextLine();
            if(number.equals("")) {
                System.out.println(str);
            }else if (!number.contains(" ")) {
                try {
                    if (Long.parseLong(number) == 0) {
                        System.out.println();
                        System.out.println("Goodbye!");
                        return;
                    }
                    BuzzNumberVerifier(number);
                } catch (NumberFormatException exception) {
                    System.out.println("The first parameter should be a natural number or zero.");
                }
            } else {
                String[] list = number.split(" ");
                try {
                    if (list[1].startsWith("-")) {
                        System.out.println("The second parameter should be a natural number.");
                    } else {
                        if (list.length == 2) {
                            Long[] listOfIntegers = new Long[Integer.parseInt(list[1])];
                            for (int i = 0; i < listOfIntegers.length; i++) {
                                listOfIntegers[i] = Long.parseLong(list[0]) + i;
                            }
                            for (int i = 0; i < listOfIntegers.length; i++) {
                                if (listOfIntegers[0] == 0) {
                                    System.out.println();
                                    System.out.println("Goodbye!");
                                    return;
                                }
                                PropertiesProvider(Long.toString(listOfIntegers[i]));
                            }
                        } else {
                            if (list[2].equalsIgnoreCase("duck")) {
                                duckProvider(list);
                            } else if (list[2].equalsIgnoreCase("even")) {
                                EvenProvider(list);
                            } else if (list[2].equalsIgnoreCase("gapful")) {
                                GapfelProvider(list);
                            } else if (list[2].equalsIgnoreCase("odd")) {
                                OddProvider(list);
                            } else if (list[2].equalsIgnoreCase("palindromic")) {
                                PalindromicProvider(list);
                            } else if (list[2].equalsIgnoreCase("buzz")) {
                                BuzzProvider(list);
                            } else if (list[2].equalsIgnoreCase("spy")) {
                                SpyProvider(list);
                            } else {
                                System.out.printf("The property [%s] is wrong.%n", list[2].toUpperCase());
                                System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, EVEN, ODD]");
                            }
                        }

                    }
                } catch (NumberFormatException e) {
                    System.out.println("The first parameter should be a natural number or zero.");
                }

            }
            }
        }
    }

