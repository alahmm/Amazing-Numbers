package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Scanner;

public class Main {

    public static void Options() {
        String str = """
                                
Supported requests:
- enter a natural number to know its properties;
- enter two natural numbers to obtain the properties of the list:
  * the first parameter represents a starting number;
  * the second parameter shows how many consecutive numbers are to be printed;
- two natural numbers and properties to search for;
- a property preceded by minus must not be present in numbers;
- separate the parameters with one space;
- enter 0 to exit.""";
        System.out.println(str);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Amazing Numbers!");
        Options();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.print("Enter a request:");
            String number = scanner.nextLine();
            if (number.isEmpty()) {
                Options();
            } else if (!number.contains(" ")) {
                try {
                    if (Long.parseLong(number) == 0) {
                        System.out.println();
                        System.out.println("Goodbye!");
                        return;
                    }
                    function(number);
                } catch (NumberFormatException exception) {
                    System.out.println("The first parameter should be a natural number or zero.");
                }
            } else {
                function(number);
            }
        }
    }

    public static boolean IsSpy(String number) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < number.length(); i++) {
            char variable = number.charAt(i);
            int integer = variable - 48;
            sum += integer;
            product *= integer;
        }
        return sum == product;
    }

    public static boolean IsEven(String number) {
        return Long.parseLong(number) % 2 == 0;
    }

    public static boolean IsBuzz(String number) {
        char character1 = number.charAt(number.length() - 1);
        int character = character1 - 48;
        return Long.parseLong(number) % 7 == 0 || character == 7;
    }

    public static boolean IsDuck(String number) {
        int counter = 0;
        for (int i = 1; i < number.length(); i++) {
            char character3 = number.charAt(i);
            int character4 = character3 - 48;
            if ((character4 == 0)) {
                counter++;
            }
        }
        return counter != 0;
    }

    public static boolean IsPalindromic(String number) {
        StringBuilder builder = new StringBuilder();
        builder.append(number);
        StringBuilder builder2 = new StringBuilder();
        for (int i = 0; i < builder.length(); i++) {
            builder2.append(builder.charAt(builder.length() - 1 - i));
        }
        boolean isSymetric = true;
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) != builder2.charAt(i)) {
                isSymetric = false;
                break;
            }
        }
        return isSymetric;
    }

    public static boolean IsGapful(String number) {
        char[] element = new char[]{number.charAt(0), number.charAt(number.length() - 1)};
        String string = String.valueOf(element);
        return number.length() > 2 && (Long.parseLong(number) % Long.parseLong(string) == 0);
    }

    public static boolean IsSunny(String number) {
        Long numberLong = Long.parseLong(number) + 1;
        boolean isSanny = false;
        double variable = Math.sqrt(numberLong);
        long variableNew = (long) variable;
        if (Math.pow(variableNew, 2) == numberLong) {
            isSanny = true;
        }
        return isSanny;
    }

    public static boolean IsSquare(String number) {
        Long numberLong = Long.parseLong(number);
        boolean isSquare = false;
        double variable = Math.sqrt(numberLong);
        long variableNew = (long) variable;
        if (Math.pow(variableNew, 2) == numberLong) {
            isSquare = true;
        }
        return isSquare;
    }

    public static boolean IsJumping(String number) {
        boolean isJumping = false;
        if (number.length() == 1) {
            isJumping = true;
        } else {
            char[] chars = number.toCharArray();
            if (chars[chars.length - 2] == chars[chars.length - 1] + 1 || chars[chars.length - 2] == chars[chars.length - 1] - 1) {
                for (int i = 0; i < chars.length - 1; i++) {
                    if (chars[i] == chars[i + 1] + 1 || chars[i] == chars[i + 1] - 1) {
                        isJumping = true;
                    } else {
                        isJumping = false;
                        break;
                    }
                }

            }
        }
        return isJumping;
    }
    public static boolean IsHappy(String number) {
        boolean isHappy = false;
        String string = number;
        int sum = 0;
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add(string);
        while(true) {
            for (int i = 0; i < number.length(); i++) {
                char variable = number.charAt(i);
                int integerVariable = variable - 48;
                sum += Math.pow(integerVariable, 2);

            }
            number = Integer.toString(sum);
            numbers.add(number);
            sum = 0;
            if (number.equals("1")) {
                isHappy = true;
                break;
            }
            if (duplicate(numbers)) {
                break;
            }
        }
        return isHappy;
    }
    public static boolean duplicate(ArrayList<String> list) {
        boolean isduplicate = false;
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i != j && list.get(i).equalsIgnoreCase(list.get(j))) {
                    counter++;
                }
            }

        }
        if (counter == 2) {
            isduplicate = true;
        }
        return isduplicate;
    }
    public static boolean isTrue(String number, String Property) {
        if (Property.equalsIgnoreCase("even")) {
            return IsEven(number);
        } else if (Property.equalsIgnoreCase("odd")) {
            return !IsEven(number);
        } else if (Property.equalsIgnoreCase("spy")) {
            return IsSpy(number);
        } else if (Property.equalsIgnoreCase("sunny")) {
            return IsSunny(number);
        } else if (Property.equalsIgnoreCase("square")) {
            return IsSquare(number);
        } else if (Property.equalsIgnoreCase("jumping")) {
            return IsJumping(number);
        } else if (Property.equalsIgnoreCase("gapful")) {
            return IsGapful(number);
        } else if (Property.equalsIgnoreCase("palindromic")) {
            return IsPalindromic(number);
        } else if (Property.equalsIgnoreCase("buzz")) {
            return IsBuzz(number);
        } else if (Property.equalsIgnoreCase("happy")) {
            return IsHappy(number);
        } else if (Property.equalsIgnoreCase("sad")) {
            return !IsHappy(number);
        } else {
            return IsDuck(number);
        }
    }
    public static boolean decider (String number, String property) {
        boolean isAdder;
        if (property.startsWith("-")) {
            String newProperty = property.substring(1);
            isAdder = !isTrue(number, newProperty);
        } else {
            isAdder = isTrue(number, property);
        }
        return isAdder;
    }
    public static boolean isTrue(String number, String[] selectedProperties) {
        if (selectedProperties.length == 1) {
            return decider(number, selectedProperties[0]);
        } else if (selectedProperties.length == 2) {
            return decider(number, selectedProperties[0]) && decider(number, selectedProperties[1]);
        } else if (selectedProperties.length == 3) {
            return decider(number, selectedProperties[0]) && decider(number, selectedProperties[1]) && decider(number, selectedProperties[2]);
        } else if (selectedProperties.length == 4) {
            return decider(number, selectedProperties[0]) && decider(number, selectedProperties[1])
                    && decider(number, selectedProperties[2]) && decider(number, selectedProperties[3]);
        } else if (selectedProperties.length == 5) {
            return decider(number, selectedProperties[0]) && decider(number, selectedProperties[1])
                    && decider(number, selectedProperties[2]) && decider(number, selectedProperties[3])
                    && decider(number, selectedProperties[4]);
        } else if (selectedProperties.length == 6) {
            return decider(number, selectedProperties[0]) && decider(number, selectedProperties[1])
                    && decider(number, selectedProperties[2]) && decider(number, selectedProperties[3])
                    && decider(number, selectedProperties[4]) && decider(number, selectedProperties[5]);
        } else if (selectedProperties.length == 7){
            return decider(number, selectedProperties[0]) && decider(number, selectedProperties[1])
                    && decider(number, selectedProperties[2]) && decider(number, selectedProperties[3])
                    && decider(number, selectedProperties[4]) && decider(number, selectedProperties[5])
                    && decider(number, selectedProperties[6]);
        } else {
            return decider(number, selectedProperties[0]) && decider(number, selectedProperties[1])
                    && decider(number, selectedProperties[2]) && decider(number, selectedProperties[3])
                    && decider(number, selectedProperties[4]) && decider(number, selectedProperties[5])
                    && decider(number, selectedProperties[6]) && decider(number, selectedProperties[7]);
        }
    }
    public static void Provider(String[] list, String[] selectedProperties) {
        String variable = list[0];
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (isTrue(variable, selectedProperties)) {
                Printer(variable, list);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void Printer(String number, String[] list) {
        String[] properties = new String[]{
                "even", "odd", "spy", "sunny", "square", "jumping", "gapful", "palindromic", "buzz", "duck", "happy", "sad"
        };
        if (list.length == 1) {
            System.out.printf("Properties of %s%n", number);
            for (String property : properties
            ) {
                if (isTrue(number, property)) {
                    System.out.printf("           %n%s: true", property);
                } else {
                    System.out.printf("           %n%s: false", property);
                }
            }
        } else {
            ArrayList<String> listOfProp = new ArrayList<>();
            for (String property : properties
            ) {
                if (isTrue(number, property)) {
                    listOfProp.add(property);
                }
            }
            for (int i = 0; i < listOfProp.size(); i++) {
                if (i == 0) {
                    System.out.printf("%s is %s", number, listOfProp.get(0));
                }
                if (i != 0) {
                    System.out.printf(", %s", listOfProp.get(i));
                }
            }
            System.out.println();
        }
    }
    public static ArrayList<String> NegativeSign (String number, String[] listOfSelectedOptions) {
        ArrayList<String> listNegativ = new ArrayList<>();
        //ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < listOfSelectedOptions.length; i++) {
            if (listOfSelectedOptions[i].startsWith("-")) {
                listNegativ.add(listOfSelectedOptions[i]);
                listNegativ.add(Integer.toString(i));
            }
        }
        return listNegativ;

    }
    public static void checkNegativ (String number, String[] listOfSelectedProperties, String prop1, String prop2) {
        ArrayList<String> array = NegativeSign(number, listOfSelectedProperties);
        if (array.size() == 4) {
            MutuallProperties("-" + prop1, "-" + prop2);
        } else {
            int counter = 0;
            for (int i = 0; i < listOfSelectedProperties.length; i++) {
                if (listOfSelectedProperties[i].equalsIgnoreCase(prop2)) {
                    counter ++;
                }
            }
            if (counter == 1) {
                MutuallProperties("-" + prop1, prop2);
            } else {
                MutuallProperties(prop1, "-" + prop2);
            }

        }
    }
    public static void MutualChecker (String number, String[] listOfSelectedProperties, String[] list) {
        String[] listOfMutuall = new String[]{"spy", "duck", "even", "odd", "sunny", "square", "happy", "sad"};
        if (number.toLowerCase().contains("duck") && number.toLowerCase().contains("spy") && !number.contains("-")) {
            MutuallProperties("DUCK", "SPY");
        } else if ((number.toLowerCase().contains("even") && number.toLowerCase().contains("odd"))) {
            if (!number.contains("-")) {
                MutuallProperties("EVEN", "ODD");
            } else {

                checkNegativ(number, listOfSelectedProperties, "EVEN", "ODD");
            }
        } else if (number.toLowerCase().contains("sunny") && number.toLowerCase().contains("square") && !number.contains("-")) {
            MutuallProperties("SUNNY", "SQUARE");
        } else if (number.toLowerCase().contains("happy") && number.toLowerCase().contains("sad")) {
            if (!number.contains("-")) {
                MutuallProperties("HAPPY", "SAD");
            } else {
                checkNegativ(number, listOfSelectedProperties, "SAD", "HAPPY");
            }
        } else if (duplicate(listOfSelectedProperties, "happy") || duplicate(listOfSelectedProperties, "sad")
                || duplicate(listOfSelectedProperties, "sunny") || duplicate(listOfSelectedProperties, "square")||
                duplicate(listOfSelectedProperties, "duck") || duplicate(listOfSelectedProperties, "spy") ||
                duplicate(listOfSelectedProperties, "jumping") || duplicate(listOfSelectedProperties, "gapful") ||
                duplicate(listOfSelectedProperties, "even") || duplicate(listOfSelectedProperties, "odd")
                || duplicate(listOfSelectedProperties, "buzz") || duplicate(listOfSelectedProperties, "palindromic")
        ) {
            for (String property : listOfMutuall
            ) {
                if (number.contains(property) && number.contains("-" + property)) {
                    MutuallProperties(property.toUpperCase(), "-" + property.toUpperCase());
                }
            }
        }  else {

            Provider(list, listOfSelectedProperties);
        }
    }
    public static void Checker(String[] list, String[] listOfSelectedProperties, String number) {
        ArrayList<String> notInTheList = new ArrayList<>();
        for (String property : listOfSelectedProperties
             ) {
                if (!property.equalsIgnoreCase("even") && !property.equalsIgnoreCase("odd")
                        && !property.equalsIgnoreCase("buzz") && !property.equalsIgnoreCase("jumping")
                        && !property.equalsIgnoreCase("sunny") && !property.equalsIgnoreCase("spy")
                        && !property.equalsIgnoreCase("square") && !property.equalsIgnoreCase("duck")
                        && !property.equalsIgnoreCase("palindromic") && !property.equalsIgnoreCase("gapful")
                        && !property.equalsIgnoreCase("-happy") && !property.equalsIgnoreCase("-sad")
                        && !property.equalsIgnoreCase("-even") && !property.equalsIgnoreCase("-odd")
                        && !property.equalsIgnoreCase("-spy") && !property.equalsIgnoreCase("-duck")
                        && !property.equalsIgnoreCase("-sunny") && !property.equalsIgnoreCase("-square")
                        && !property.equalsIgnoreCase("-gapful") && !property.equalsIgnoreCase("-palindromic")
                        && !property.equalsIgnoreCase("-buzz") && !property.equalsIgnoreCase("-jumping")
                        && !property.equalsIgnoreCase("happy") && !property.equalsIgnoreCase("sad")){
                    notInTheList.add(property);
                }
            }
        if (notInTheList.size() == 1) {
            System.out.printf("The property [%s] is wrong.%n", notInTheList.get(0));
            System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
        } else if (notInTheList.size() == 2) {
            System.out.printf("The properties [%s, %s] are wrong.%n", notInTheList.get(0), notInTheList.get(1));
            System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
        } else {
            MutualChecker(number, listOfSelectedProperties, list);

        }
    }
    public static void MutuallProperties (String prop1, String prop2) {
        System.out.printf("The request contains mutually exclusive properties: [%s, %s]%n", prop1, prop2);
        System.out.println("There are no numbers with these properties.");
    }
    public static boolean duplicate(String[] list, String property) {
        boolean isduplicate = false;
        int counter = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if(i != j && list[i].equalsIgnoreCase(property) && list[j].equalsIgnoreCase("-" + property)) {
                    counter ++;
                }
            }
            }
        if (counter == 1) {
            isduplicate = true;
        }
        return isduplicate;
    }
    public static void function(String number) {
        try {
            if (!number.contains(" ")) {
                if (Long.parseLong(number) < 0) {
                    System.out.println("The first parameter should be a natural number or zero.");
                } else {
                    String[] list = new String[1];
                    Printer(number, list);
                }
            } else {
                String[] list = number.split(" ");
                if (Long.parseLong(list[1]) < 0) {
                    System.out.println("The second parameter should be a natural number or zero.");
                } else if (Long.parseLong(list[0]) < 0) {
                    System.out.println("The first parameter should be a natural number or zero.");
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
                            Printer(Long.toString(listOfIntegers[i]), list);
                        }
                    } else {
                        String[] listOfSelectedProperties = new String[list.length - 2];
                        for (int i = 0; i < list.length - 2; i++) {
                            listOfSelectedProperties[i] = list[i + 2];
                        }
                        ArrayList<String> dupli = new ArrayList<>();
                        for (String property : listOfSelectedProperties
                             ) {
                            dupli.add(property);
                        }
                            List<String> newList = dupli.stream().distinct().collect(Collectors.toList());
                        String[] newListOfSelectedOption = new String[newList.size()];
                            for (int i = 0; i < newList.size(); i++) {
                                newListOfSelectedOption[i] = newList.get(i);
                            }
                            Checker(list, newListOfSelectedOption, number);

                        }

                    }
                }

        } catch (Exception e) {
            System.out.println("The first parameter should be a natural number or zero.");
        }
    }
}

