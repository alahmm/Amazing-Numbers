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
    public static boolean IsSunny (String number) {
        Long numberLong = Long.parseLong(number) + 1;
        boolean isSanny = false;
            double variable = Math.sqrt(numberLong);
            long variableNew = (long) variable;
        if (Math.pow(variableNew, 2) == numberLong) {
            isSanny = true;
        }
        return isSanny;
    }
    public static boolean IsSquare (String number) {
        Long numberLong = Long.parseLong(number);
        boolean isSquare = false;
        double variable = Math.sqrt(numberLong);
        long variableNew = (long) variable;
        if (Math.pow(variableNew, 2) == numberLong) {
            isSquare = true;
        }
        return isSquare;
    }
    public static boolean IsJumping (String number) {
        boolean isJumping = false;
        int counter = 0;
        if (number.length() == 1) {
            isJumping = true;
        }
        else {
            char[] chars = number.toCharArray();
            if (chars[chars.length - 2] == chars[chars.length - 1] + 1 || chars[chars.length - 2] == chars[chars.length - 1] - 1) {
                for (int i = 0; i < chars.length - 1; i++) {
                    if (chars[i] == chars[i + 1] + 1 || chars[i] == chars[i + 1] - 1) {
                        counter++;
                    } /*else {
                        isJumping = false;
                        break;
                    }*/
                }
/*            char c = number.charAt(number.length() - 2);
            if (number.charAt(number.length() - 1) == c - 1 ||
                    number.charAt(number.length() - 1) == c + 1) {
                for (int i = 0; i < number.length() - 1; i++) {
                    if ((number.charAt(i) == number.charAt(i + 1) + 1) || (number.charAt(i) == number.charAt(i + 1) - 1)) {
                        //counter ++;
                        isJumping = true;
                    } *//*else {
                        isJumping = false;
                        break;
                    }*//*
                }*/
/*                if (c == c2 - 1 || c == c2 + 1) {
                    for (int i = 0; i < number.length() - 1; i++) {
                        if ((number.charAt(i) == number.charAt(i + 1) + 1) || (number.charAt(i) == number.charAt(i + 1) - 1)) {
                            //counter ++;
                            isJumping = true;
                        } *//*else {
                        isJumping = false;
                        break;
                    }*//*
                    }
                }*/

            }
/*            if (counter == number.length() - 1) {
                isJumping = true;
            }*/
        }
        if (counter == number.length() - 1) {
            isJumping =true;
        }
        return isJumping;
    }
    public static void PropertiesProviderForMoreNumbers(String number) {
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
                System.out.print(", spy");
            }
            if (IsSunny(number)) {
                System.out.print(", sunny");
            }
            if (IsSquare(number)) {
                System.out.print(", square");
            }
            if (IsJumping(number)) {
                System.out.print(", jumping");
            }
        }

    }
    public static void PropertiesProviderForOneNumber(String number) {
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
            if (IsSunny(number)) {
                System.out.println("         sunny: true");
            } else {
                System.out.println("         sunny: false");
            }
            if (IsSquare(number)) {
                System.out.println("         square: true");
            } else {
                System.out.println("         square: false");
            }
            if (IsJumping(number)) {
                System.out.println("         jumping: true");
            } else {
                System.out.println("         jumping: false");
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
                    PropertiesProviderForMoreNumbers(variable);
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
                PropertiesProviderForMoreNumbers(variable);
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
                PropertiesProviderForMoreNumbers(variable);
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
                PropertiesProviderForMoreNumbers(variable);
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
                PropertiesProviderForMoreNumbers(variable);
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
                PropertiesProviderForMoreNumbers(variable);
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
                PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void SunnyProvider (String[] list) {
        String variable = list[0];
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (IsSunny(variable)) {
                PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void SquareProvider (String[] list) {
        String variable = list[0];
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (IsSquare(variable)) {
                PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void JumpingProvider (String[] list) {
        String variable = list[0];
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (IsJumping(variable)) {
                PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void JumpingBuzzProvider (String[] list, String variable) {
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (IsJumping(variable) && IsBuzz(variable)) {
                PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void JumpingDuckProvider (String[] list, String variable) {
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (IsJumping(variable) && IsDuck(variable)) {
                PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void JumpingOddProvider (String[] list, String variable) {
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (IsJumping(variable) && !IsEven(variable)) {
                PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void JumpingEvenProvider (String[] list, String variable) {
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (IsJumping(variable) && IsEven(variable)) {
                PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void JumpingGapfulProvider (String[] list, String variable) {
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (IsJumping(variable) && IsGapful(variable)) {
                PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void JumpingPalindromicProvider (String[] list, String variable) {
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (IsJumping(variable) && IsPalindromic(variable)) {
                PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void JumpingSquareProvider (String[] list, String variable) {
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (IsJumping(variable) && IsSquare(variable)) {
                PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void JumpingSunnyProvider (String[] list, String variable) {
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (IsJumping(variable) && IsSunny(variable)) {
                PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void JumpingSpyProvider (String[] list, String variable) {
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (IsJumping(variable) && IsSpy(variable)) {
                PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void Providerthree (String[] list, String variable) {
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (!IsEven(variable) && IsSpy(variable) && IsPalindromic(variable)) {
                PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void Providerthree2 (String[] list, String variable) {
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (!IsEven(variable) && IsSpy(variable) && IsGapful(variable)) {
                PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void Providerthree3 (String[] list, String variable) {
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (IsEven(variable) && IsDuck(variable) && IsPalindromic(variable)) {
                PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void Providerfor2 (String[] list, String variable) {
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (IsEven(variable) && IsGapful(variable) && IsSpy(variable) && IsBuzz(variable)) {
                PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void Providerfor (String[] list, String variable) {
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (IsEven(variable) && IsDuck(variable) && IsPalindromic(variable) && IsBuzz(variable)) {
                PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void Providerfive (String[] list, String variable) {
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (IsEven(variable) && IsDuck(variable) && IsPalindromic(variable) && IsBuzz(variable) && IsGapful(variable)) {
                PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void Providerfive2 (String[] list, String variable) {
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (IsEven(variable) && IsDuck(variable) && IsGapful(variable) && IsSunny(variable) && IsBuzz(variable)) {
                PropertiesProviderForMoreNumbers(variable);
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
- two natural numbers and properties to search for;
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
                    PropertiesProviderForOneNumber(number);
                } catch (NumberFormatException exception) {
                    System.out.println("The first parameter should be a natural number or zero.");
                }
            } else {
                String[] list = number.split(" ");
                String variable = list[0];
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
                                PropertiesProviderForMoreNumbers(Long.toString(listOfIntegers[i]));
                            }
                        } else if (list.length == 3) {
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
                            } else if (list[2].equalsIgnoreCase("sunny")) {
                                SunnyProvider(list);
                            } else if (list[2].equalsIgnoreCase("square")) {
                                SquareProvider(list);
                            } else if (list[2].equalsIgnoreCase("jumping")) {
                                JumpingProvider(list);
                            } else {
                                System.out.printf("The property [%s] is wrong.%n", list[2].toUpperCase());
                                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]");
                            }
                        } else if (list.length == 4){
                            if (list[2].equalsIgnoreCase("buzz")) {
                                if (list[3].equalsIgnoreCase("buzz")) {
                                    BuzzProvider(list);
                                } else if (list[3].equalsIgnoreCase("duck")) {
                                    buzznumbers.ProviderBuzz.BuzzDuckProvider(list);
                                } else if (list[3].equalsIgnoreCase("palindromic")) {
                                    buzznumbers.ProviderBuzz.BuzzPalindromicProvider(list);
                                } else if (list[3].equalsIgnoreCase("gapful")) {
                                    buzznumbers.ProviderBuzz.BuzzGapfulProvider(list);
                                } else if (list[3].equalsIgnoreCase("spy")) {
                                    buzznumbers.ProviderBuzz.BuzzSpyProvider(list);
                                } else if (list[3].equalsIgnoreCase("square")) {
                                    buzznumbers.ProviderBuzz.BuzzSquareProvider(list);
                                } else if (list[3].equalsIgnoreCase("sunny")) {
                                    buzznumbers.ProviderBuzz.BuzzSnnyProvider(list);
                                } else if (list[3].equalsIgnoreCase("even")) {
                                    buzznumbers.ProviderBuzz.BuzzEvenProvider(list);
                                } else if (list[3].equalsIgnoreCase("odd")) {
                                    buzznumbers.ProviderBuzz.BuzzOddProvider(list);
                                } else if (list[3].equalsIgnoreCase("jumping")) {
                                    JumpingBuzzProvider(list, variable);
                                } else {
                                    System.out.printf("The property [%s] is wrong.%n", list[3].toUpperCase());
                                    System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]");
                                }
                            } else if ((list[2].equalsIgnoreCase("duck"))) {
                                if (list[3].equalsIgnoreCase("duck")) {
                                    duckProvider(list);
                                } else if (list[3].equalsIgnoreCase("buzz")) {
                                    buzznumbers.ProviderDuck.DuckBuzzProvider(list);
                                } else if (list[3].equalsIgnoreCase("palindromic")) {
                                    buzznumbers.ProviderDuck.DuckPalindromicProvider(list);
                                } else if (list[3].equalsIgnoreCase("gapful")) {
                                    buzznumbers.ProviderDuck.DuckGapfulProvider(list);
                                } else if (list[3].equalsIgnoreCase("square")) {
                                    buzznumbers.ProviderDuck.DuckSquareProvider(list);
                                } else if (list[3].equalsIgnoreCase("sunny")) {
                                    buzznumbers.ProviderDuck.DuckSunnyProvider(list);
                                } else if (list[3].equalsIgnoreCase("even")) {
                                    buzznumbers.ProviderDuck.DuckEvenProvider(list);
                                } else if (list[3].equalsIgnoreCase("odd")) {
                                    buzznumbers.ProviderDuck.DuckOddProvider(list);
                                } else if (list[3].equalsIgnoreCase("jumping")) {
                                    JumpingDuckProvider(list, variable);
                                } else if (list[3].equalsIgnoreCase("spy")) {
                                    System.out.printf("The request contains mutually exclusive properties: [%s, %s]%n", list[2].toUpperCase(), list[3].toUpperCase());
                                    System.out.println("There are no numbers with these properties.");
                                } else {
                                    System.out.printf("The property [%s] is wrong.%n", list[3].toUpperCase());
                                    System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]");
                                }
                            }else if ((list[2].equalsIgnoreCase("palindromic"))){
                                if (list[3].equalsIgnoreCase("palindromic")) {
                                    PalindromicProvider(list);
                                } else if (list[3].equalsIgnoreCase("buzz")) {
                                    buzznumbers.ProviderPalindromic.PalindromicBuzzProvider(list);
                                } else if (list[3].equalsIgnoreCase("duck")) {
                                    buzznumbers.ProviderPalindromic.PalindromicDuckProvider(list);
                                } else if (list[3].equalsIgnoreCase("gapful")) {
                                    buzznumbers.ProviderPalindromic.PalindromicGapfulProvider(list);
                                } else if (list[3].equalsIgnoreCase("square")) {
                                    buzznumbers.ProviderPalindromic.PalindromicSquareProvider(list);
                                } else if (list[3].equalsIgnoreCase("sunny")) {
                                    buzznumbers.ProviderPalindromic.PalindromicSunnyProvider(list);
                                } else if (list[3].equalsIgnoreCase("even")) {
                                    buzznumbers.ProviderPalindromic.PalindromicEvenProvider(list);
                                } else if (list[3].equalsIgnoreCase("odd")) {
                                    buzznumbers.ProviderPalindromic.PalindromicOddProvider(list);
                                } else if (list[3].equalsIgnoreCase("spy")) {
                                    buzznumbers.ProviderPalindromic.PalindromicSpyProvider(list);
                                } else if (list[3].equalsIgnoreCase("jumping")) {
                                    JumpingPalindromicProvider(list, variable);
                                } else {
                                    System.out.printf("The property [%s] is wrong.%n", list[3].toUpperCase());
                                    System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]");
                                }
                            } else if ((list[2].equalsIgnoreCase("gapful"))) {
                                if (list[3].equalsIgnoreCase("gapful")) {
                                    GapfelProvider(list);
                                } else if (list[3].equalsIgnoreCase("buzz")) {
                                    buzznumbers.ProviderGapful.GapfulBuzzProvider(list);
                                } else if (list[3].equalsIgnoreCase("duck")) {
                                    buzznumbers.ProviderGapful.GapfulDuckProvider(list);
                                } else if (list[3].equalsIgnoreCase("palindromic")) {
                                    buzznumbers.ProviderGapful.GapfulPalindromicProvider(list);
                                } else if (list[3].equalsIgnoreCase("square")) {
                                    buzznumbers.ProviderGapful.GapfulSquareProvider(list);
                                } else if (list[3].equalsIgnoreCase("sunny")) {
                                    buzznumbers.ProviderGapful.GapfulSunnyProvider(list);
                                } else if (list[3].equalsIgnoreCase("even")) {
                                    buzznumbers.ProviderGapful.GapfulEvenProvider(list);
                                } else if (list[3].equalsIgnoreCase("odd")) {
                                    buzznumbers.ProviderGapful.GapfulOddProvider(list);
                                } else if (list[3].equalsIgnoreCase("spy")) {
                                    buzznumbers.ProviderGapful.GapfulSpyProvider(list);
                                } else if (list[3].equalsIgnoreCase("jumping")) {
                                    JumpingGapfulProvider(list, variable);
                                } else {
                                    System.out.printf("The property [%s] is wrong.%n", list[3].toUpperCase());
                                    System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]");
                                }
                            } else if ((list[2].equalsIgnoreCase("sunny"))) {
                                if (list[3].equalsIgnoreCase("sunny")) {
                                    SunnyProvider(list);
                                } else if (list[3].equalsIgnoreCase("buzz")) {
                                    buzznumbers.ProviderSunny.SunnyBuzzProvider(list);
                                } else if (list[3].equalsIgnoreCase("duck")) {
                                    buzznumbers.ProviderSunny.SunnyDuckProvider(list);
                                } else if (list[3].equalsIgnoreCase("palindromic")) {
                                    buzznumbers.ProviderSunny.SunnyPalindromicProvider(list);
                                } else if (list[3].equalsIgnoreCase("gapful")) {
                                    buzznumbers.ProviderSunny.SunnyGapfulProvider(list);
                                } else if (list[3].equalsIgnoreCase("even")) {
                                    buzznumbers.ProviderSunny.SunnyEvenProvider(list);
                                } else if (list[3].equalsIgnoreCase("odd")) {
                                    buzznumbers.ProviderSunny.SunnyOddProvider(list);
                                } else if (list[3].equalsIgnoreCase("spy")) {
                                    buzznumbers.ProviderSunny.SunnySpyProvider(list);
                                } else if (list[3].equalsIgnoreCase("jumping")) {
                                    JumpingSunnyProvider(list, variable);
                                } else if (list[3].equalsIgnoreCase("square")) {
                                    System.out.printf("The request contains mutually exclusive properties: [%s, %s]%n", list[2].toUpperCase(), list[3].toUpperCase());
                                    System.out.println("There are no numbers with these properties.");
                                } else {
                                    System.out.printf("The property [%s] is wrong.%n", list[3].toUpperCase());
                                    System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]");
                                }
                            }else if ((list[2].equalsIgnoreCase("spy"))) {
                                    if (list[3].equalsIgnoreCase("spy")) {
                                        SpyProvider(list);
                                    } else if (list[3].equalsIgnoreCase("buzz")) {
                                        buzznumbers.ProviderSpy.SpyBuzzProvider(list);
                                    } else if (list[3].equalsIgnoreCase("palindromic")) {
                                        buzznumbers.ProviderSpy.SpyPalindromicProvider(list);
                                    } else if (list[3].equalsIgnoreCase("square")) {
                                        buzznumbers.ProviderSpy.SpySquareProvider(list);
                                    } else if (list[3].equalsIgnoreCase("sunny")) {
                                        buzznumbers.ProviderSpy.SpySunnyProvider(list);
                                    } else if (list[3].equalsIgnoreCase("even")) {
                                        buzznumbers.ProviderSpy.SpyEvenProvider(list);
                                    } else if (list[3].equalsIgnoreCase("odd")) {
                                        buzznumbers.ProviderSpy.SpyOddProvider(list);
                                    } else if (list[3].equalsIgnoreCase("gapful")) {
                                        buzznumbers.ProviderSpy.SpyGapfulProvider(list);
                                    } else if (list[3].equalsIgnoreCase("jumping")) {
                                        JumpingSpyProvider(list, variable);
                                    } else if (list[3].equalsIgnoreCase("duck")) {
                                        System.out.printf("The request contains mutually exclusive properties: [%s, %s]%n", list[2].toUpperCase(), list[3].toUpperCase());
                                        System.out.println("There are no numbers with these properties.");
                                    } else {
                                        System.out.printf("The property [%s] is wrong.%n", list[3].toUpperCase());
                                        System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]");
                                    }
                                }else if ((list[2].equalsIgnoreCase("square"))) {
                                        if (list[3].equalsIgnoreCase("square")) {
                                            SquareProvider(list);
                                        } else if (list[3].equalsIgnoreCase("buzz")) {
                                            buzznumbers.ProviderSquare.SquareBuzzProvider(list);
                                        } else if (list[3].equalsIgnoreCase("duck")) {
                                            buzznumbers.ProviderSquare.SquareDuckProvider(list);
                                        } else if (list[3].equalsIgnoreCase("palindromic")) {
                                            buzznumbers.ProviderSquare.SquarePalindromicProvider(list);
                                        } else if (list[3].equalsIgnoreCase("gapful")) {
                                            buzznumbers.ProviderSquare.SquareGapfulProvider(list);
                                        } else if (list[3].equalsIgnoreCase("even")) {
                                            buzznumbers.ProviderSquare.SquareEvenProvider(list);
                                        } else if (list[3].equalsIgnoreCase("odd")) {
                                            buzznumbers.ProviderSquare.SquareOddProvider(list);
                                        } else if (list[3].equalsIgnoreCase("spy")) {
                                            buzznumbers.ProviderSquare.SquareSpyProvider(list);
                                        } else if (list[3].equalsIgnoreCase("jumping")) {
                                            JumpingSquareProvider(list, variable);
                                        } else if (list[3].equalsIgnoreCase("sunny")) {
                                            System.out.printf("The request contains mutually exclusive properties: [%s, %s]%n", list[2].toUpperCase(), list[3].toUpperCase());
                                            System.out.println("There are no numbers with these properties.");
                                        } else {
                                            System.out.printf("The property [%s] is wrong.%n", list[3].toUpperCase());
                                            System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]");
                                        }
                                    }else if ((list[2].equalsIgnoreCase("even"))) {
                                            if (list[3].equalsIgnoreCase("even")) {
                                                EvenProvider(list);
                                            } else if (list[3].equalsIgnoreCase("buzz")) {
                                                buzznumbers.ProviderEven.EvenBuzzProvider(list);
                                            } else if (list[3].equalsIgnoreCase("duck")) {
                                                buzznumbers.ProviderEven.EvenDuckProvider(list);
                                            } else if (list[3].equalsIgnoreCase("palindromic")) {
                                                buzznumbers.ProviderEven.EvenPalindromicProvider(list);
                                            } else if (list[3].equalsIgnoreCase("square")) {
                                                buzznumbers.ProviderEven.EvenSquareProvider(list);
                                            } else if (list[3].equalsIgnoreCase("sunny")) {
                                                buzznumbers.ProviderEven.EvenSunnyProvider(list);
                                            } else if (list[3].equalsIgnoreCase("gapful")) {
                                                buzznumbers.ProviderEven.EvenGapfulProvider(list);
                                            } else if (list[3].equalsIgnoreCase("spy")) {
                                                buzznumbers.ProviderEven.EvenSpyProvider(list);
                                            } else if (list[3].equalsIgnoreCase("jumping")) {
                                                JumpingEvenProvider(list, variable);
                                            } else if (list[3].equalsIgnoreCase("odd")) {
                                                System.out.printf("The request contains mutually exclusive properties: [%s, %s]%n", list[2].toUpperCase(), list[3].toUpperCase());
                                                System.out.println("There are no numbers with these properties.");
                                            } else {
                                                System.out.printf("The property [%s] is wrong.%n", list[3].toUpperCase());
                                                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]");
                                            }
                                        }else if ((list[2].equalsIgnoreCase("odd"))) {
                                                if (list[3].equalsIgnoreCase("odd")) {
                                                    OddProvider(list);
                                                } else if (list[3].equalsIgnoreCase("buzz")) {
                                                    buzznumbers.ProviderOdd.OddBuzzProvider(list);
                                                } else if (list[3].equalsIgnoreCase("duck")) {
                                                    buzznumbers.ProviderOdd.OddDuckProvider(list);
                                                } else if (list[3].equalsIgnoreCase("palindromic")) {
                                                    buzznumbers.ProviderOdd.OddPalindromicProvider(list);
                                                } else if (list[3].equalsIgnoreCase("square")) {
                                                    buzznumbers.ProviderOdd.OddSquareProvider(list);
                                                } else if (list[3].equalsIgnoreCase("sunny")) {
                                                    buzznumbers.ProviderOdd.OddSunnyProvider(list);
                                                } else if (list[3].equalsIgnoreCase("gapful")) {
                                                    buzznumbers.ProviderOdd.OddGapfulProvider(list);
                                                } else if (list[3].equalsIgnoreCase("spy")) {
                                                    buzznumbers.ProviderOdd.OddSpyProvider(list);
                                                } else if (list[3].equalsIgnoreCase("jumping")) {
                                                    JumpingOddProvider(list, variable);
                                                } else if (list[3].equalsIgnoreCase("even")) {
                                                    System.out.printf("The request contains mutually exclusive properties: [%s, %s]%n", list[2].toUpperCase(), list[3].toUpperCase());
                                                    System.out.println("There are no numbers with these properties.");
                                                } else {
                                                    System.out.printf("The property [%s] is wrong.%n", list[3].toUpperCase());
                                                    System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]");
                                                }
                            } else if ((list[2].equalsIgnoreCase("jumping"))) {
                                if (list[3].equalsIgnoreCase("jumping")) {
                                    JumpingProvider(list);
                                } else if (list[3].equalsIgnoreCase("buzz")) {
                                    JumpingBuzzProvider(list, variable);
                                } else if (list[3].equalsIgnoreCase("duck")) {
                                    JumpingDuckProvider(list, variable);
                                } else if (list[3].equalsIgnoreCase("palindromic")) {
                                    JumpingPalindromicProvider(list, variable);
                                } else if (list[3].equalsIgnoreCase("square")) {
                                    JumpingSquareProvider(list, variable);
                                } else if (list[3].equalsIgnoreCase("sunny")) {
                                    JumpingSunnyProvider(list, variable);
                                } else if (list[3].equalsIgnoreCase("gapful")) {
                                    JumpingGapfulProvider(list, variable);
                                } else if (list[3].equalsIgnoreCase("spy")) {
                                    JumpingSpyProvider(list, variable);
                                } else if (list[3].equalsIgnoreCase("odd")) {
                                    JumpingOddProvider(list, variable);
                                } else if (list[3].equalsIgnoreCase("even")) {
                                    JumpingEvenProvider(list, variable);
                                } else {
                                    System.out.printf("The property [%s] is wrong.%n", list[3].toUpperCase());
                                    System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]");
                                }
                            }else {
                                if (!list[3].equalsIgnoreCase("gapful") && !list[3].equalsIgnoreCase("square") &&
                                        !list[3].equalsIgnoreCase("duck") && !list[3].equalsIgnoreCase("sunny") &&
                                        !list[3].equalsIgnoreCase("spy") && !list[3].equalsIgnoreCase("palindromic") &&
                                        !list[3].equalsIgnoreCase("buzz") && !list[3].equalsIgnoreCase("odd") &&
                                        !list[3].equalsIgnoreCase("even")) {
                                    System.out.printf("The properties [%s, %s] are wrong.%n", list[2].toUpperCase(), list[3].toUpperCase());
                                    System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]");
                                } else {
                                    System.out.printf("The property [%s] is wrong.%n", list[2].toUpperCase());
                                    System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]");
                                }

                            }

                        } else if (list.length == 5) {
                            if (list[2].equalsIgnoreCase("odd") && list[3].equalsIgnoreCase("spy")
                            && list[4].equalsIgnoreCase("palindromic")) {
                                Providerthree(list, variable);
                            } else if (list[2].equalsIgnoreCase("odd") && list[3].equalsIgnoreCase("spy")
                                    && list[4].equalsIgnoreCase("gapful")) {
                                Providerthree2(list, variable);
                            } else if (list[2].equalsIgnoreCase("even") && list[3].equalsIgnoreCase("palindromic")
                                    && list[4].equalsIgnoreCase("duck")) {
                                Providerthree3(list, variable);
                            } else if (number.contains("duck") && number.contains("spy")) {
                                System.out.println("The request contains mutually exclusive properties: [DUCK, SPY]");
                                System.out.println("There are no numbers with these properties.");
                            } else if ((number.contains("even") && number.contains("odd"))) {
                                System.out.println("The request contains mutually exclusive properties: [EVEN, ODD]");
                                System.out.println("There are no numbers with these properties.");
                            } else if (number.contains("sunny") && number.contains("square")) {
                                System.out.println("The request contains mutually exclusive properties: [SUNNY, SQUARE]");
                                System.out.println("There are no numbers with these properties.");
                            } else {
                                if (!list[2].equalsIgnoreCase("even") && !list[2].equalsIgnoreCase("odd")
                                        && !list[2].equalsIgnoreCase("buzz") && !list[2].equalsIgnoreCase("jumping")
                                        && !list[2].equalsIgnoreCase("sunny") && !list[2].equalsIgnoreCase("spy")
                                        && !list[2].equalsIgnoreCase("square") && !list[2].equalsIgnoreCase("duck")
                                        && !list[2].equalsIgnoreCase("palindromic") && !list[2].equalsIgnoreCase("gapful")) {
                                    System.out.printf("The property [%s] is wrong.", list[2].toUpperCase());
                                    System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
                                }
                                else if (!list[3].equalsIgnoreCase("even") && !list[3].equalsIgnoreCase("odd")
                                        && !list[3].equalsIgnoreCase("buzz") && !list[3].equalsIgnoreCase("jumping")
                                        && !list[3].equalsIgnoreCase("sunny") && !list[3].equalsIgnoreCase("spy")
                                        && !list[3].equalsIgnoreCase("square") && !list[3].equalsIgnoreCase("duck")
                                        && !list[3].equalsIgnoreCase("palindromic") && !list[3].equalsIgnoreCase("gapful")) {
                                    System.out.printf("The property [%s] is wrong.", list[2].toUpperCase());
                                    System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
                                }
                                else if (!list[4].equalsIgnoreCase("even") && !list[4].equalsIgnoreCase("odd")
                                        && !list[4].equalsIgnoreCase("buzz") && !list[4].equalsIgnoreCase("jumping")
                                        && !list[4].equalsIgnoreCase("sunny") && !list[4].equalsIgnoreCase("spy")
                                        && !list[4].equalsIgnoreCase("square") && !list[4].equalsIgnoreCase("duck")
                                        && !list[4].equalsIgnoreCase("palindromic") && !list[4].equalsIgnoreCase("gapful")) {
                                    System.out.printf("The property [%s] is wrong.", list[2].toUpperCase());
                                    System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
                                }

                        }} else if (list.length == 6) {
                            if (list[2].equalsIgnoreCase("even") && list[3].equalsIgnoreCase("palindromic")
                                    && list[4].equalsIgnoreCase("duck") && list[5].equalsIgnoreCase("buzz")) {
                                Providerfor(list, variable);
                            } else if (list[2].equalsIgnoreCase("even") && list[3].equalsIgnoreCase("spy")
                                    && list[4].equalsIgnoreCase("buzz") && list[5].equalsIgnoreCase("gapful")) {
                                Providerfor2(list, variable);
                            } else if (number.contains("duck") && number.contains("spy")) {
                                System.out.println("The request contains mutually exclusive properties: [DUCK, SPY]");
                                System.out.println("There are no numbers with these properties.");
                            } else if ((number.contains("even") && number.contains("odd"))) {
                                System.out.println("The request contains mutually exclusive properties: [EVEN, ODD]");
                                System.out.println("There are no numbers with these properties.");
                            } else if (number.contains("sunny") && number.contains("square")) {
                                System.out.println("The request contains mutually exclusive properties: [SUNNY, SQUARE]");
                                System.out.println("There are no numbers with these properties.");
                            } else {
                                if (!list[2].equalsIgnoreCase("even") && !list[2].equalsIgnoreCase("odd")
                                        && !list[2].equalsIgnoreCase("buzz") && !list[2].equalsIgnoreCase("jumping")
                                        && !list[2].equalsIgnoreCase("sunny") && !list[2].equalsIgnoreCase("spy")
                                        && !list[2].equalsIgnoreCase("square") && !list[2].equalsIgnoreCase("duck")
                                        && !list[2].equalsIgnoreCase("palindromic") && !list[2].equalsIgnoreCase("gapful")) {
                                    System.out.printf("The property [%s] is wrong.", list[2].toUpperCase());
                                    System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
                                }
                                else if (!list[3].equalsIgnoreCase("even") && !list[3].equalsIgnoreCase("odd")
                                        && !list[3].equalsIgnoreCase("buzz") && !list[3].equalsIgnoreCase("jumping")
                                        && !list[3].equalsIgnoreCase("sunny") && !list[3].equalsIgnoreCase("spy")
                                        && !list[3].equalsIgnoreCase("square") && !list[3].equalsIgnoreCase("duck")
                                        && !list[3].equalsIgnoreCase("palindromic") && !list[3].equalsIgnoreCase("gapful")) {
                                    System.out.printf("The property [%s] is wrong.", list[2].toUpperCase());
                                    System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
                                }
                                else if (!list[4].equalsIgnoreCase("even") && !list[4].equalsIgnoreCase("odd")
                                        && !list[4].equalsIgnoreCase("buzz") && !list[4].equalsIgnoreCase("jumping")
                                        && !list[4].equalsIgnoreCase("sunny") && !list[4].equalsIgnoreCase("spy")
                                        && !list[4].equalsIgnoreCase("square") && !list[4].equalsIgnoreCase("duck")
                                        && !list[4].equalsIgnoreCase("palindromic") && !list[4].equalsIgnoreCase("gapful")) {
                                    System.out.printf("The property [%s] is wrong.", list[2].toUpperCase());
                                    System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
                                }
                                else if (!list[5].equalsIgnoreCase("even") && !list[5].equalsIgnoreCase("odd")
                                        && !list[5].equalsIgnoreCase("buzz") && !list[5].equalsIgnoreCase("jumping")
                                        && !list[5].equalsIgnoreCase("sunny") && !list[5].equalsIgnoreCase("spy")
                                        && !list[5].equalsIgnoreCase("square") && !list[5].equalsIgnoreCase("duck")
                                        && !list[5].equalsIgnoreCase("palindromic") && !list[5].equalsIgnoreCase("gapful")) {
                                    System.out.printf("The property [%s] is wrong.", list[2].toUpperCase());
                                    System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
                                }
                        }} else {
                            if (list[2].equalsIgnoreCase("even") && list[3].equalsIgnoreCase("palindromic")
                                    && list[4].equalsIgnoreCase("duck") && list[5].equalsIgnoreCase("buzz") &&
                                    list[6].equalsIgnoreCase("gapful")) {
                                Providerfive(list, variable);
                            } else if (list[2].equalsIgnoreCase("even") && list[3].equalsIgnoreCase("sunny")
                                    && list[4].equalsIgnoreCase("duck") && list[5].equalsIgnoreCase("buzz") &&
                                    list[6].equalsIgnoreCase("gapful")) {
                                Providerfive2(list, variable);
                            } else if (number.contains("duck") && number.contains("spy")) {
                                System.out.println("The request contains mutually exclusive properties: [DUCK, SPY]");
                                System.out.println("There are no numbers with these properties.");
                            } else if ((number.contains("even") && number.contains("odd"))) {
                                System.out.println("The request contains mutually exclusive properties: [EVEN, ODD]");
                                System.out.println("There are no numbers with these properties.");
                            } else if (number.contains("sunny") && number.contains("square")) {
                                System.out.println("The request contains mutually exclusive properties: [SUNNY, SQUARE]");
                                System.out.println("There are no numbers with these properties.");
                            } else {
                                if (!list[2].equalsIgnoreCase("even") && !list[2].equalsIgnoreCase("odd")
                                && !list[2].equalsIgnoreCase("buzz") && !list[2].equalsIgnoreCase("jumping")
                                && !list[2].equalsIgnoreCase("sunny") && !list[2].equalsIgnoreCase("spy")
                                && !list[2].equalsIgnoreCase("square") && !list[2].equalsIgnoreCase("duck")
                                && !list[2].equalsIgnoreCase("palindromic") && !list[2].equalsIgnoreCase("gapful")) {
                                    System.out.printf("The property [%s] is wrong.", list[2].toUpperCase());
                                    System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
                                }
                                else if (!list[3].equalsIgnoreCase("even") && !list[3].equalsIgnoreCase("odd")
                                        && !list[3].equalsIgnoreCase("buzz") && !list[3].equalsIgnoreCase("jumping")
                                        && !list[3].equalsIgnoreCase("sunny") && !list[3].equalsIgnoreCase("spy")
                                        && !list[3].equalsIgnoreCase("square") && !list[3].equalsIgnoreCase("duck")
                                        && !list[3].equalsIgnoreCase("palindromic") && !list[3].equalsIgnoreCase("gapful")) {
                                    System.out.printf("The property [%s] is wrong.", list[2].toUpperCase());
                                    System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
                                }
                                else if (!list[4].equalsIgnoreCase("even") && !list[4].equalsIgnoreCase("odd")
                                        && !list[4].equalsIgnoreCase("buzz") && !list[4].equalsIgnoreCase("jumping")
                                        && !list[4].equalsIgnoreCase("sunny") && !list[4].equalsIgnoreCase("spy")
                                        && !list[4].equalsIgnoreCase("square") && !list[4].equalsIgnoreCase("duck")
                                        && !list[4].equalsIgnoreCase("palindromic") && !list[4].equalsIgnoreCase("gapful")) {
                                    System.out.printf("The property [%s] is wrong.", list[2].toUpperCase());
                                    System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
                                }
                                else if (!list[5].equalsIgnoreCase("even") && !list[5].equalsIgnoreCase("odd")
                                        && !list[5].equalsIgnoreCase("buzz") && !list[5].equalsIgnoreCase("jumping")
                                        && !list[5].equalsIgnoreCase("sunny") && !list[5].equalsIgnoreCase("spy")
                                        && !list[5].equalsIgnoreCase("square") && !list[5].equalsIgnoreCase("duck")
                                        && !list[5].equalsIgnoreCase("palindromic") && !list[5].equalsIgnoreCase("gapful")) {
                                    System.out.printf("The property [%s] is wrong.", list[2].toUpperCase());
                                    System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
                                }
                                else if (!list[6].equalsIgnoreCase("even") && !list[6].equalsIgnoreCase("odd")
                                        && !list[6].equalsIgnoreCase("buzz") && !list[6].equalsIgnoreCase("jumping")
                                        && !list[6].equalsIgnoreCase("sunny") && !list[6].equalsIgnoreCase("spy")
                                        && !list[6].equalsIgnoreCase("square") && !list[6].equalsIgnoreCase("duck")
                                        && !list[6].equalsIgnoreCase("palindromic") && !list[6].equalsIgnoreCase("gapful")) {
                                    System.out.printf("The property [%s] is wrong.", list[2].toUpperCase());
                                    System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
                                }
                            }

                        }
                    }
                }catch (NumberFormatException e) {
                    System.out.println("The first parameter should be a natural number or zero.");
                }

            }
            }
        }
    }

