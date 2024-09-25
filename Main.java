/*
This Class is used to do all the conversions and do the arithmetic operations using methods of Conversion Class
Owner -> Ojas Joshi
Date -> 25/09/2024
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String choice = null;
        String number = null;
        long result = 0;
        System.out.println(Constant.OPERATION_CHOICES);
        do {
            System.out.println(Constant.CHOOSE_OPERATION);
            try {
                choice = scan.nextLine();
                switch (choice) {
                    case "1":
                        System.out.println(Constant.OPT_BASE_CONVERSION);
                        System.out.println(Constant.BASE_CONVERSION);
                        String option = scan.nextLine();
                        switch (option) {
                            case "1":
                                System.out.println(Constant.INPUT_NUMBER);
                                number = scan.nextLine();
                                if (Conversion.isValidBinary(number)) {
                                    System.out.println(Constant.DESIRED_OUTPUT + Conversion.othersToDecimal(number, 2));
                                } else {
                                    System.out.println(Constant.INVALID_BINARY);
                                }
                                break;
                            case "2":
                                System.out.println(Constant.INPUT_NUMBER);
                                number = scan.nextLine();
                                if (Conversion.isValidBinary(number)) {
                                    result = Conversion.othersToDecimal(number, 2);
                                    System.out.println(Constant.DESIRED_OUTPUT + Conversion.decimalToOther((int) result, 8));
                                } else {
                                    System.out.println(Constant.INVALID_BINARY);
                                }
                                break;
                            case "3":
                                System.out.println(Constant.INPUT_NUMBER);
                                number = scan.nextLine();
                                if (Conversion.isValidBinary(number)) {
                                    result = Conversion.othersToDecimal(number, 2);
                                    System.out.println(Constant.DESIRED_OUTPUT + Conversion.decimalToOther((int) result, 16));
                                } else {
                                    System.out.println(Constant.INVALID_BINARY);
                                }
                                break;
                            case "4":
                                System.out.println(Constant.INPUT_NUMBER);
                                number = scan.nextLine();
                                if (Conversion.isValid(number, 8)) {
                                    result = Conversion.othersToDecimal(number, 8);
                                    System.out.println(Constant.DESIRED_OUTPUT + Conversion.decimalToOther((int) result, 2));
                                } else {
                                    System.out.println(Constant.INVALID_INPUT);
                                }
                                break;
                            case "5":
                                System.out.println(Constant.INPUT_NUMBER);
                                number = scan.nextLine();
                                if (Conversion.isValid(number, 8)) {
                                    System.out.println(Constant.DESIRED_OUTPUT + Conversion.othersToDecimal(number, 8));
                                } else {
                                    System.out.println(Constant.INVALID_INPUT);
                                }
                                break;
                            case "6":
                                System.out.println(Constant.INPUT_NUMBER);
                                number = scan.nextLine();
                                if (Conversion.isValid(number, 8)) {
                                    result = Conversion.othersToDecimal(number, 8);
                                    System.out.println(Constant.DESIRED_OUTPUT + Conversion.decimalToOther((int) result, 16));
                                } else {
                                    System.out.println(Constant.INVALID_INPUT);
                                }
                                break;
                            case "7":
                                System.out.println(Constant.INPUT_NUMBER);
                                number = scan.nextLine();
                                if (Conversion.isValid(number, 2)) {
                                    System.out.println(Constant.DESIRED_OUTPUT + Conversion.decimalToOther(Integer.parseInt(number), 2));
                                } else {
                                    System.out.println(Constant.INVALID_INPUT);
                                }
                                break;
                            case "8":
                                System.out.println(Constant.INPUT_NUMBER);
                                number = scan.nextLine();
                                if (Conversion.isValid(number, 10)) {
                                    System.out.println(Constant.DESIRED_OUTPUT + Conversion.decimalToOther(Integer.parseInt(number), 8));
                                } else {
                                    System.out.println(Constant.INVALID_INPUT);
                                }
                                break;
                            case "9":
                                System.out.println(Constant.INPUT_NUMBER);
                                number = scan.nextLine();
                                if (Conversion.isValid(number, 10)) {
                                    System.out.println(Constant.DESIRED_OUTPUT + Conversion.decimalToOther(Integer.parseInt(number), 16));
                                } else {
                                    System.out.println(Constant.INVALID_INPUT);
                                }
                                break;
                            case "10":
                                System.out.println(Constant.INPUT_NUMBER);
                                number = scan.nextLine();
                                if (Conversion.isValidHex(number)) {
                                    result = Conversion.othersToDecimal(number, 16);
                                    System.out.println(Constant.DESIRED_OUTPUT + Conversion.decimalToOther((int) result, 2));
                                } else {
                                    System.out.println(Constant.INVALID_INPUT);
                                }
                                break;
                            case "11":
                                System.out.println(Constant.INPUT_NUMBER);
                                number = scan.nextLine();
                                if (Conversion.isValidHex(number)) {
                                    result = Conversion.othersToDecimal(number, 16);
                                    System.out.println(Constant.DESIRED_OUTPUT + Conversion.decimalToOther((int) result, 8));
                                } else {
                                    System.out.println(Constant.INVALID_INPUT);
                                }
                                break;
                            case "12":
                                System.out.println(Constant.INPUT_NUMBER);
                                number = scan.nextLine();
                                if (Conversion.isValidHex(number)) {
                                    System.out.println(Constant.DESIRED_OUTPUT + Conversion.othersToDecimal(number, 16));
                                } else {
                                    System.out.println(Constant.INVALID_INPUT);
                                }
                                break;
                            case "13":
                                System.out.println(Constant.INPUT_NUMBER);
                                number = scan.nextLine();
                                System.out.println(Constant.CURRENT_BASE);
                                int currentBase = scan.nextInt();
                                scan.nextLine();
                                if (Conversion.isValid(number, currentBase)) {
                                    if (currentBase < 2 || currentBase > 16) {
                                        System.out.println(Constant.INVALID_BASE);
                                        break;
                                    }
                                    if (currentBase == 2) {
                                        if (!Conversion.isValidBinary(number)) {
                                            System.out.println(Constant.INVALID_BINARY);
                                            break;
                                        }
                                    }
                                    result = Conversion.othersToDecimal(number, currentBase);
                                    System.out.println(Constant.CONVERTED_BASE);
                                    int convertedBase = scan.nextInt();
                                    if (convertedBase < 2 || convertedBase > 16) {
                                        System.out.println(Constant.INVALID_BASE);
                                        break;
                                    }
                                    scan.nextLine();
                                    System.out.println(Constant.DESIRED_OUTPUT + Conversion.decimalToOther((int) result, convertedBase));
                                } else {
                                    System.out.println(Constant.INVALID_INPUT);
                                }
                                break;
                            case "0":
                                System.out.println(Constant.FUNCTION_EXITS);
                                break;
                            default:
                                System.out.println(Constant.INVALID_INPUT);
                                break;
                        }
                        break;
                    case "2":
                        System.out.println(Constant.OPT_ARITHMETIC_OPERATIONS);
                        System.out.println(Constant.ARITHMETIC_OPERATIONS);
                        System.out.println(Constant.INPUT_FIRST_NUMBER);
                        String num1 = scan.nextLine();
                        System.out.println(Constant.CURRENT_BASE);
                        int base = scan.nextInt();
                        scan.nextLine();
                        num1 = String.valueOf(Conversion.othersToDecimal(num1, base));
                        System.out.println(Constant.INPUT_SECOND_NUMBER);
                        String num2 = scan.nextLine();
                        System.out.println(Constant.CURRENT_BASE);
                        int base2 = scan.nextInt();
                        scan.nextLine();
                        num2 = String.valueOf(Conversion.othersToDecimal(num2, base2));
                        System.out.println(Constant.ARITHMETIC_OPERATIONS);
                        String decision = scan.nextLine();
                        switch (decision) {
                            case "1":
                                long outcome = Maths.add(Integer.parseInt(num1), Integer.parseInt(num2));
                                System.out.println(Constant.EXPECTED_BASE);
                                int expectedBase = scan.nextInt();
                                System.out.println(Conversion.decimalToOther((int) outcome, expectedBase));
                                break;
                            case "2":
                                long outcome1 = (Maths.subtract(Integer.parseInt(num1), Integer.parseInt(num2)));
                                System.out.println(Constant.EXPECTED_BASE);
                                int expectedBase1 = scan.nextInt();
                                System.out.println(Conversion.decimalToOther((int) outcome1, expectedBase1));
                                break;
                            case "3":
                                long outcome2 = (long) (Maths.divide(Integer.parseInt(num1), Integer.parseInt(num2)));
                                System.out.println(Constant.EXPECTED_BASE);
                                int expectedBase2 = scan.nextInt();
                                System.out.println(Conversion.decimalToOther((int) outcome2, expectedBase2));
                                break;
                            case "4":
                                long outcome3 = (Maths.multiply(Integer.parseInt(num1), Integer.parseInt(num2)));
                                System.out.println(Constant.EXPECTED_BASE);
                                int expectedBase3 = scan.nextInt();
                                System.out.println(Conversion.decimalToOther((int) outcome3, expectedBase3));
                                break;

                        }
                        break;
                    case "0":
                        System.out.println(Constant.EXIT);
                        break;
                }
            } catch (Exception e) {
                System.out.println(Constant.ERROR_HANDLING);
            }
        } while (!choice.equalsIgnoreCase("0"));
    }
}