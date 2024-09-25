/*
This Class is used to create some methods which will help us in arithmetic operations and conversions as well
Owner -> Ojas Joshi
Date -> 25/09/2024
 */
public class Maths {
    public static long pow(int base, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * base;
        }
        return result;
    }

    public static long add(int a, int b) {
        return a + b;
    }

    public static long multiply(int a, int b) {
        return (long) a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }

    public static long subtract(int a, int b) {
        return a - b;
    }

}
