/*
This Class is used to do all the conversions and do the arithmetic operations using methods of Conversion Class
Owner -> Ojas Joshi
Date -> 26/09/2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Constant.PROMPT_RULES);
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println(Constant.ENTER_PROMPT);
            String input = scan.nextLine();
            if (input.equals("0")) {
                System.out.println(Constant.EXIT);
                break;
            } else {
                input = input.toLowerCase();
                String prompt = Conversion.removeWhiteSpaces(input);
                try {
                    String function;
                    String currentBase;
                    String number;
                    String convertedBase;
                    String secondNumber;
                    int currentRadix;
                    int convertedRadix;
                    long result = 0;
                    long total;
                    if (prompt.indexOf("convert") == 0 && prompt.indexOf("bin") == 7 && Maths.containPoints(prompt)) {
                        currentBase = prompt.substring(7, 10);
                        number = prompt.substring(10, prompt.length() - 3);
                        convertedBase = prompt.substring(prompt.length() - 3);
                        number = prompt.substring(10, 10 + Maths.pointIndex(prompt.substring(10)));
                        secondNumber = prompt.substring(11 + Maths.pointIndex(prompt.substring(10)), prompt.length() - 3);
                        currentRadix = Maths.getRadix(currentBase);
                        convertedRadix = Maths.getRadix(convertedBase);
                        secondNumber = String.valueOf(Maths.negPow(secondNumber, currentRadix));
                        if (Conversion.isValid(number, currentRadix)) {
                            result = Conversion.othersToDecimal(number, currentRadix);
                        } else {
                            System.out.println(Constant.INVALID_BASE);
                            return;
                        }
                        if (((convertedRadix >= 2 && convertedRadix <= 10) || convertedRadix == 16)) {
                            System.out.println(Constant.DESIRED_OUTPUT + Conversion.decimalToOther((int) result, convertedRadix) + secondNumber.substring(1));
                        } else {
                            System.out.println(Constant.INVALID_CONVERSION);
                            return;
                        }

                        return;

                    } else if (prompt.indexOf("convert") == 0) {
                        currentBase = prompt.substring(7, 10);
                        number = prompt.substring(10, prompt.length() - 3);
                        convertedBase = prompt.substring(prompt.length() - 3);
                        currentRadix = Maths.getRadix(currentBase);
                        convertedRadix = Maths.getRadix(convertedBase);
                        if (Conversion.isValid(number, currentRadix)) {
                            result = Conversion.othersToDecimal(number, currentRadix);
                        } else {
                            System.out.println(Constant.INVALID_BASE);
                            return;
                        }

                        if (((convertedRadix >= 2 && convertedRadix <= 10) || convertedRadix == 16)) {
                            System.out.println(Constant.DESIRED_OUTPUT + Conversion.decimalToOther((int) result, convertedRadix));
                        } else {
                            System.out.println(Constant.INVALID_CONVERSION);
                            return;
                        }

                    } else if (input.indexOf("hex") == 4) {
                        function = input.substring(0, 3);
                        currentBase = input.substring(4, 7);
                        number = Maths.extractHex(input.substring(8));
                        convertedBase = input.substring(number.length() + 9, number.length() + 12);
                        secondNumber = Maths.extractHex(input.substring(number.length() + 13));
                        currentRadix = Maths.getRadix(currentBase);
                        convertedRadix = Maths.getRadix(convertedBase);
                        switch (function) {
                            case "add":
                                if (Conversion.isValid(number, currentRadix)) {
                                    result = Conversion.othersToDecimal(number, currentRadix);
                                } else {
                                    System.out.println(Constant.INVALID_BASE);
                                    return;
                                }
                                if (Conversion.isValid(secondNumber, convertedRadix)) {
                                    total = Conversion.othersToDecimal(secondNumber, convertedRadix);
                                    System.out.println(Constant.DECIMAL_OUTPUT + Maths.add(result, total));
                                } else {
                                    System.out.println(Constant.INVALID_CONVERSION);
                                    return;
                                }
                                break;
                            case "sub":
                                if (Conversion.isValid(number, currentRadix)) {
                                    result = Conversion.othersToDecimal(number, currentRadix);
                                } else {
                                    System.out.println(Constant.INVALID_BASE);
                                    return;
                                }
                                if (Conversion.isValid(secondNumber, convertedRadix)) {
                                    total = Conversion.othersToDecimal(secondNumber, convertedRadix);
                                    System.out.println(Constant.DECIMAL_OUTPUT + Maths.subtract((int) result, (int) total));
                                } else {
                                    System.out.println(Constant.INVALID_CONVERSION);
                                    return;
                                }
                                break;
                            case "div":
                                if (Conversion.isValid(number, currentRadix)) {
                                    result = Conversion.othersToDecimal(number, currentRadix);
                                } else {
                                    System.out.println(Constant.INVALID_BASE);
                                    return;
                                }
                                if (Conversion.isValid(secondNumber, convertedRadix)) {
                                    total = Conversion.othersToDecimal(secondNumber, convertedRadix);
                                    System.out.println(Constant.DECIMAL_OUTPUT + Maths.divide((int) result, (int) total));
                                } else {
                                    System.out.println(Constant.INVALID_CONVERSION);
                                    return;
                                }
                                break;
                            case "mul":
                                if (Conversion.isValid(number, currentRadix)) {
                                    result = Conversion.othersToDecimal(number, currentRadix);
                                } else {
                                    System.out.println(Constant.INVALID_BASE);
                                    return;
                                }
                                if (Conversion.isValid(secondNumber, convertedRadix)) {
                                    total = Conversion.othersToDecimal(secondNumber, convertedRadix);
                                    System.out.println(Constant.DECIMAL_OUTPUT + Maths.multiply(result, total));
                                } else {
                                    System.out.println(Constant.INVALID_CONVERSION);
                                    return;
                                }
                                break;
                            default:
                                System.out.println(Constant.PROMPT_EXAMPLES);
                                break;

                        }
                        return;

                    } else if (prompt.indexOf("add") == 0) {
                        currentBase = prompt.substring(3, 6);
                        number = Maths.extractNumber(prompt.substring(6));
                        convertedBase = prompt.substring(number.length() + 6, number.length() + 9);
                        secondNumber = prompt.substring(number.length() + 9);
                        currentRadix = Maths.getRadix(currentBase);
                        convertedRadix = Maths.getRadix(convertedBase);
                        if (Conversion.isValid(number, currentRadix)) {
                            result = Conversion.othersToDecimal(number, currentRadix);
                        } else {
                            System.out.println(Constant.INVALID_BASE);
                            return;
                        }
                        if (Conversion.isValid(secondNumber, convertedRadix)) {
                            total = Conversion.othersToDecimal(secondNumber, convertedRadix);
                            System.out.println(Constant.DECIMAL_OUTPUT + Maths.add(result, total));
                        } else {
                            System.out.println(Constant.INVALID_CONVERSION);
                            return;
                        }

                    } else if (prompt.indexOf("sub") == 0) {
                        currentBase = prompt.substring(3, 6);
                        number = Maths.extractNumber(prompt.substring(6));
                        convertedBase = prompt.substring(number.length() + 6, number.length() + 9);
                        secondNumber = prompt.substring(number.length() + 9);
                        currentRadix = Maths.getRadix(currentBase);
                        convertedRadix = Maths.getRadix(convertedBase);
                        if (Conversion.isValid(number, currentRadix)) {
                            result = Conversion.othersToDecimal(number, currentRadix);
                        } else {
                            System.out.println(Constant.INVALID_BASE);
                            return;
                        }
                        if (Conversion.isValid(secondNumber, convertedRadix)) {
                            total = Conversion.othersToDecimal(secondNumber, convertedRadix);
                            System.out.println(Constant.DECIMAL_OUTPUT + Maths.subtract((int) result, (int) total));
                        } else {
                            System.out.println(Constant.INVALID_CONVERSION);
                            return;
                        }
                    } else if (prompt.indexOf("mul") == 0) {
                        currentBase = prompt.substring(3, 6);
                        number = Maths.extractNumber(prompt.substring(6));
                        convertedBase = prompt.substring(number.length() + 6, number.length() + 9);
                        secondNumber = prompt.substring(number.length() + 9);
                        currentRadix = Maths.getRadix(currentBase);
                        convertedRadix = Maths.getRadix(convertedBase);
                        if (Conversion.isValid(number, currentRadix)) {
                            result = Conversion.othersToDecimal(number, currentRadix);
                        } else {
                            System.out.println(Constant.INVALID_BASE);
                            return;
                        }
                        if (Conversion.isValid(secondNumber, convertedRadix)) {
                            total = Conversion.othersToDecimal(secondNumber, convertedRadix);
                            System.out.println(Constant.DECIMAL_OUTPUT + Maths.multiply(result, total));
                        } else {
                            System.out.println(Constant.INVALID_CONVERSION);
                            return;
                        }
                    } else if (prompt.indexOf("div") == 0) {
                        currentBase = prompt.substring(3, 6);
                        number = Maths.extractNumber(prompt.substring(6));
                        convertedBase = prompt.substring(number.length() + 6, number.length() + 9);
                        secondNumber = prompt.substring(number.length() + 9);
                        currentRadix = Maths.getRadix(currentBase);
                        convertedRadix = Maths.getRadix(convertedBase);
                        if (Conversion.isValid(number, currentRadix)) {
                            result = Conversion.othersToDecimal(number, currentRadix);
                        } else {
                            System.out.println(Constant.INVALID_BASE);
                            return;
                        }
                        if (Conversion.isValid(secondNumber, convertedRadix)) {
                            total = Conversion.othersToDecimal(secondNumber, convertedRadix);
                            System.out.println(Constant.DECIMAL_OUTPUT + Maths.divide((int) result, (int) total));
                        } else {
                            System.out.println(Constant.INVALID_CONVERSION);
                            return;
                        }
                    } else {
                        System.out.println(Constant.INVALID_PROMPT);
                        System.out.println(Constant.PROMPT_EXAMPLES);
                        return;
                    }
                } catch (Exception E) {
                    System.out.println(Constant.ERROR_HANDLING);
                    System.out.println(Constant.PROMPT_EXAMPLES);
                }
            }
        }
    }
}