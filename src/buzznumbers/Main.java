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
    public static void main(String[] args) {
        System.out.println("Welcome to Amazing Numbers!");
        String str = """
                
Supported requests:
- enter a natural number to know its properties;
- enter two natural numbers to obtain the properties of the list:
  * the first parameter represents a starting number;
  * the second parameters show how many consecutive numbers are to be processed;
- two natural numbers and two properties to search for;
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
                            } else {
                                System.out.printf("The property [%s] is wrong.%n", list[2].toUpperCase());
                                System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, EVEN, ODD]");
                            }
                        } else {
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
                                } else {
                                    System.out.printf("The property [%s] is wrong.%n", list[3].toUpperCase());
                                    System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, EVEN, ODD]");
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
                                } else if (list[3].equalsIgnoreCase("spy")) {
                                    System.out.printf("The request contains mutually exclusive properties: [%s, %s]%n", list[2].toUpperCase(), list[3].toUpperCase());
                                    System.out.println("There are no numbers with these properties.");
                                } else {
                                    System.out.printf("The property [%s] is wrong.%n", list[3].toUpperCase());
                                    System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, EVEN, ODD]");
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
                                } else {
                                    System.out.printf("The property [%s] is wrong.%n", list[3].toUpperCase());
                                    System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, EVEN, ODD]");
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
                                } else {
                                    System.out.printf("The property [%s] is wrong.%n", list[3].toUpperCase());
                                    System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, EVEN, ODD]");
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
                                } else if (list[3].equalsIgnoreCase("square")) {
                                    System.out.printf("The request contains mutually exclusive properties: [%s, %s]%n", list[2].toUpperCase(), list[3].toUpperCase());
                                    System.out.println("There are no numbers with these properties.");
                                } else {
                                    System.out.printf("The property [%s] is wrong.%n", list[3].toUpperCase());
                                    System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, EVEN, ODD]");
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
                                    } else if (list[3].equalsIgnoreCase("duck")) {
                                        System.out.printf("The request contains mutually exclusive properties: [%s, %s]%n", list[2].toUpperCase(), list[3].toUpperCase());
                                        System.out.println("There are no numbers with these properties.");
                                    } else {
                                        System.out.printf("The property [%s] is wrong.%n", list[3].toUpperCase());
                                        System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, EVEN, ODD]");
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
                                        } else if (list[3].equalsIgnoreCase("sunny")) {
                                            System.out.printf("The request contains mutually exclusive properties: [%s, %s]%n", list[2].toUpperCase(), list[3].toUpperCase());
                                            System.out.println("There are no numbers with these properties.");
                                        } else {
                                            System.out.printf("The property [%s] is wrong.%n", list[3].toUpperCase());
                                            System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, EVEN, ODD]");
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
                                            } else if (list[3].equalsIgnoreCase("odd")) {
                                                System.out.printf("The request contains mutually exclusive properties: [%s, %s]%n", list[2].toUpperCase(), list[3].toUpperCase());
                                                System.out.println("There are no numbers with these properties.");
                                            } else {
                                                System.out.printf("The property [%s] is wrong.%n", list[3].toUpperCase());
                                                System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, EVEN, ODD]");
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
                                                } else if (list[3].equalsIgnoreCase("even")) {
                                                    System.out.printf("The request contains mutually exclusive properties: [%s, %s]%n", list[2].toUpperCase(), list[3].toUpperCase());
                                                    System.out.println("There are no numbers with these properties.");
                                                } else {
                                                    System.out.printf("The property [%s] is wrong.%n", list[3].toUpperCase());
                                                    System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, EVEN, ODD]");
                                                }
                            } else {
                                if (!list[3].equalsIgnoreCase("gapful") && !list[3].equalsIgnoreCase("square") &&
                                        !list[3].equalsIgnoreCase("duck") && !list[3].equalsIgnoreCase("sunny") &&
                                        !list[3].equalsIgnoreCase("spy") && !list[3].equalsIgnoreCase("palindromic") &&
                                        !list[3].equalsIgnoreCase("buzz") && !list[3].equalsIgnoreCase("odd") &&
                                        !list[3].equalsIgnoreCase("even")) {
                                    System.out.printf("The properties [%s, %s] are wrong.%n", list[2].toUpperCase(), list[3].toUpperCase());
                                    System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, EVEN, ODD]");
                                } else {
                                    System.out.printf("The property [%s] is wrong.%n", list[2].toUpperCase());
                                    System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, EVEN, ODD]");
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

