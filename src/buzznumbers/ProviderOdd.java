package buzznumbers;

public class ProviderOdd {
    public static void OddBuzzProvider (String[] list) {
        String variable = list[0];
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (!buzznumbers.Main.IsEven(variable) && buzznumbers.Main.IsBuzz(variable)) {
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
    public static void OddDuckProvider (String[] list) {
        String variable = list[0];
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (!buzznumbers.Main.IsEven(variable) && buzznumbers.Main.IsDuck(variable)) {
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
    public static void OddPalindromicProvider (String[] list) {
        String variable = list[0];
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (!buzznumbers.Main.IsEven(variable) && buzznumbers.Main.IsPalindromic(variable)) {
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
    public static void OddGapfulProvider (String[] list) {
        String variable = list[0];
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (!buzznumbers.Main.IsEven(variable) && buzznumbers.Main.IsGapful(variable)) {
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
    public static void OddSpyProvider (String[] list) {
        String variable = list[0];
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (!buzznumbers.Main.IsEven(variable) && buzznumbers.Main.IsSpy(variable)) {
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
    public static void OddSquareProvider (String[] list) {
        String variable = list[0];
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (!buzznumbers.Main.IsEven(variable) && buzznumbers.Main.IsSquare(variable)) {
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
    public static void OddSunnyProvider (String[] list) {
        String variable = list[0];
        Long variable2 = Long.parseLong(variable);
        int counter = 0;
        long number2 = Long.parseLong(list[1]);
        while (counter < number2) {
            if (!buzznumbers.Main.IsEven(variable) && buzznumbers.Main.IsSunny(variable)) {
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
