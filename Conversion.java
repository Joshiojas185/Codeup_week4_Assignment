/*
This class is used for conversion of one base to other base and to validate whether the given input is valid or not
Owner -> Ojas Joshi
Date -> 26/09/2024
 */
public class Conversion {
    public static long othersToDecimal(String input, int base) {
        int length = input.length() - 1;
        long value = 0;
        for (int i = 0; i < input.length(); i++) {
            value = value + (Character.getNumericValue(input.charAt(length - i)) * Maths.pow(base, i));
        }
        return value;
    }

    public static boolean isValid(String input, int base) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.getNumericValue(input.charAt(i)) < 0 || Character.getNumericValue(input.charAt(i)) >= base) {
                return false;
            }
        }
        return true;
    }

    public static String decimalToOther(int number, int base) {
        String remainder = "";
        while (number != 0) {
            if (number % base <= 9) {
                remainder = remainder + ((number % base));
                number = number / base;
            } else if (number % base > 9) {
                int a = (int) (number % base);
                if (a >= 10 && a <= 15) {
                    char character = (char) ('A' + (a - 10));
                    remainder = remainder + (character);
                    number = number / base;
                }
            }
        }
        String result = "";
        for (int i = remainder.length() - 1; i >= 0; i--) {
            result += remainder.charAt(i);
        }
        return result;
    }

    public static String removeWhiteSpaces(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ' && input.charAt(i) != '_' && input.charAt(i) != '-') {
                result = result + input.charAt(i);
            }
        }
        return result;
    }
}
