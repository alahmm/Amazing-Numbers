package buzznumbers;

import java.util.Scanner;

public class Main {
    public static void PropertiesProvider(String number) {
        if (Long.parseLong(number) < 0) {
            System.out.println("The first parameter should be a natural number or zero.");
        } else {
            if (Long.parseLong(number) % 2 == 0) {
                System.out.printf("           %n%s is even", number);
            } else {
                System.out.printf("           %n%s is odd", number);
            }
            char character1 = number.charAt(number.length() - 1);
            int character = character1 - 48;
            if (Long.parseLong(number) % 7 == 0 || character == 7) {
                System.out.print(", buzz");
            }
            int counter =0;
            for (int i = 1; i < number.length(); i++) {
                char character3 = number.charAt(i);
                int character4= character3 - 48;
                if ((character4 == 0))  {
                    counter ++;
                }
            }
            if (counter != 0) {
                System.out.print(", duck");
            }
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
            if (isSymetric) {
                System.out.print(", palindromic");
            }
            if (number.length() > 2) {
                char[] element = new char[] {number.charAt(0) , number.charAt(number.length() - 1)};
                String string = String.valueOf(element);
                if (Long.parseLong(number) % Long.parseLong(string) == 0) {
                    System.out.print(", gapful");
                }
            }
        }

    }
    public static void BuzzNumberVerifier(String number) {
        if (Long.parseLong(number) < 0) {
            System.out.println("The first parameter should be a natural number or zero.");
        } else {
            System.out.printf("Properties of %s%n", number);
            if (Long.parseLong(number) % 2 == 0) {
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
            if (Long.parseLong(number) % 7 == 0 || character == 7) {

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
            if (isSymetric) {
                System.out.println(" palindromic: true");
            } else {
                System.out.println(" palindromic: false");
            }
            if (number.length() > 2) {
                char[] element = new char[] {number.charAt(0) , number.charAt(number.length() - 1)};
                String string = String.valueOf(element);
                if (Long.parseLong(number) % Long.parseLong(string) == 0) {
                    System.out.println(" gapful: true");
                } else {
                    System.out.println(" gapful: false");
                }
            } else {
                System.out.println(" gapful: false");
            }
        }

    }

    public static void main(String[] args) {
        String str = """
                Welcome to Amazing Numbers!
                                
                Supported requests:
                - enter a natural number to know its properties;
                - enter two natural numbers to obtain the properties of the list:
                  * the first parameter represents a starting number;
                  * the second parameter shows how many consecutive numbers are to be processed;
                - separate the parameters with one space;
                - enter 0 to exit.""";
        System.out.println(str);
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println();
            System.out.print("Enter a request:");
            String number = scanner.nextLine();
            if(number.equals("")) {
                String str2 = """
                                
                                Supported requests:
                                - enter a natural number to know its properties;
                                - enter two natural numbers to obtain the properties of the list:
                                  * the first parameter represents a starting number;
                                  * the second parameter shows how many consecutive numbers are to be processed;
                                - separate the parameters with one space;
                                - enter 0 to exit.""";
                System.out.println(str2);
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
                    }
                } catch (NumberFormatException e) {
                    System.out.println("The first parameter should be a natural number or zero.");
                }

            }
            }
        }
    }

