/*
This class is used for conversion of one base to other base and to validate whether the given input is valid or not
Owner -> Ojas Joshi
Date -> 25/09/2024
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

    public static boolean isValidHex(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '1' && input.charAt(i) != '2' &&
                    input.charAt(i) != '3' && input.charAt(i) != '4' &&
                    input.charAt(i) != '5' && input.charAt(i) != '6' &&
                    input.charAt(i) != '7' && input.charAt(i) != '8' &&
                    input.charAt(i) != '9' && input.charAt(i) != '0' &&
                    input.charAt(i) != 'A' && input.charAt(i) != 'B' &&
                    input.charAt(i) != 'C' && input.charAt(i) != 'C' &&
                    input.charAt(i) != 'D' && input.charAt(i) != 'E' &&
                    input.charAt(i) != 'F' && input.charAt(i) != 'a' &&
                    input.charAt(i) != 'b' && input.charAt(i) != 'c' &&
                    input.charAt(i) != 'd' && input.charAt(i) != 'e' &&
                    input.charAt(i) != 'f') {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidBinary(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '1' && input.charAt(i) != '0') {
                return false;
            }
        }
        return true;
    }

    public static boolean isValid(String s, int base) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.getNumericValue(s.charAt(i)) >= base) {
                return false;
            }
        }
        return true;
    }

    public static String decimalToOther(int x, int base) {
        StringBuilder y = new StringBuilder();
        while (x != 0) {
            if (x % base <= 9) {
                y.append((x % base));
                x = x / base;
            } else if (x % base > 9) {
                int a = x % base;
                if (a >= 10 && a <= 15) {
                    char z = (char) ('A' + (a - 10));
                    y.append(z);
                    x = x / base;
                }
            }
        }
        return y.reverse().toString();
    }

}
