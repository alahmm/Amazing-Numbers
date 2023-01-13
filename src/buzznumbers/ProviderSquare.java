package buzznumbers;

public class ProviderSquare {
    public static void SquareBuzzProvider (String[] list) {
        String variable = list[0];
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (buzznumbers.Main.IsSquare(variable) && buzznumbers.Main.IsBuzz(variable)) {
                buzznumbers.Main.PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void SquareDuckProvider (String[] list) {
        String variable = list[0];
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (buzznumbers.Main.IsSquare(variable) && buzznumbers.Main.IsDuck(variable)) {
                buzznumbers.Main.PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void SquarePalindromicProvider (String[] list) {
        String variable = list[0];
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (buzznumbers.Main.IsSquare(variable) && buzznumbers.Main.IsPalindromic(variable)) {
                buzznumbers.Main.PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void SquareGapfulProvider (String[] list) {
        String variable = list[0];
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (buzznumbers.Main.IsSquare(variable) && buzznumbers.Main.IsGapful(variable)) {
                buzznumbers.Main.PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void SquareSpyProvider (String[] list) {
        String variable = list[0];
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (buzznumbers.Main.IsSquare(variable) && buzznumbers.Main.IsSpy(variable)) {
                buzznumbers.Main.PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void SquareEvenProvider (String[] list) {
        String variable = list[0];
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (buzznumbers.Main.IsSquare(variable) && buzznumbers.Main.IsEven(variable)) {
                buzznumbers.Main.PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
    public static void SquareOddProvider (String[] list) {
        String variable = list[0];
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (buzznumbers.Main.IsSquare(variable) && !buzznumbers.Main.IsEven(variable)) {
                buzznumbers.Main.PropertiesProviderForMoreNumbers(variable);
                counter++;
                variable2++;
                variable = Long.toString(variable2);
            } else {
                variable2++;
                variable = Long.toString(variable2);
            }
        }
    }
}
