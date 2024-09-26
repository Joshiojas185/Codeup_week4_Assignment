/*
This Class is used to create some methods which will help us in arithmetic operations and conversions as well
Owner -> Ojas Joshi
Date -> 26/09/2024
 */
public class Maths {
    public static long pow(int base, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * base;
        }
        return result;
    }

    public static double power(double base, double power) {
        double result = 1;

        for (int i = 1; i <= power; i++) {
            result = (result * base);
        }
        return result;
    }

    public static double negPow(String number, int currentRadix) {
        double result = 0;
        for (int i = 0; i < number.length(); i++) {
            result = result + Character.getNumericValue(number.charAt(i)) * Maths.power((double) 1 / currentRadix, (i + 1));
        }
        return result;
    }

    public static long add(double a, double b) {
        return (long) ((long) a + b);
    }

    public static long multiply(double a, double b) {
        return (long) (a * b);
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static long subtract(double a, double b) {
        return (long) (a - b);
    }

    public static String extractNumber(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                result = result + input.charAt(i);
            } else {
                break;
            }
        }
        return result;
    }

    public static String extractHex(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                break;
            }
            if (Character.getNumericValue(input.charAt(i)) <= 15) {
                result = result + input.charAt(i);
            } else {
                break;
            }
        }
        return result;
    }

    public static int pointIndex(String input) {
        int index = -1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '.') {
                index = i;
                break;
            }
        }
        return index;
    }

    public static boolean containPoints(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '.') {
                count++;
            }
        }
        return count == 1;
    }

    public static int getRadix(String input) {
        int radix;
        switch (input) {
            case "bin":
                radix = 2;
                break;
            case "tri":
                radix = 3;
                break;
            case "for":
                radix = 4;
                break;
            case "pen":
                radix = 5;
                break;
            case "six":
                radix = 6;
                break;
            case "sep":
                radix = 7;
                break;
            case "oct":
                radix = 8;
                break;
            case "non":
                radix = 9;
                break;
            case "dec":
                radix = 10;
                break;
            case "hex":
                radix = 16;
                break;
            default:
                radix = -1;
                break;
        }
        return radix;
    }

}
