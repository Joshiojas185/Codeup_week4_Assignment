/*
In this class we are declaring the constants which we will be using in the other classes.
This class will contain all the hard coded or the constant values
Program Owner -> Ojas Joshi
Date -> 26/09/2024
 */
public class Constant {
    static String ENTER_PROMPT = "Enter The Prompt !!...";
    static String INVALID_PROMPT = "That is an Invalid Prompt !! Sorry Can't Process this!! ";
    static String INVALID_BASE = "Its an Invalid Base of the Following number!";
    static String INVALID_CONVERSION = "Sorry This Operation Can't be Performed !! Either the Number " +
                                       "does not belong to the base range or base is Out Of Range ";
    static String DECIMAL_OUTPUT = "The Desired Output in Decimal is ";
    static String ERROR_HANDLING = "Error: Invalid input. Please try again.";
    static String DESIRED_OUTPUT = "The Desired Output is ";
    static String EXIT = "Program Exits";
    static String PROMPT_RULES = """
            Welcome To The Program
            Rules to Enter the Prompt
            Please try the keep the base within the range 2-10 or 16
            Conversion, Addition, Subtraction, Multiplication, Division -> These all operations can be performed
            Keywords are as follows :
            bin -> base 2  tri -> base 3 for -> base 4  pen -> base  six -> base 
            sep -> base 7  oct -> base 8 non -> base 9  dec -> base 10  hex -> base 16
            Please try to Enter Prompt like these :
            1 -> Convert bin 111 dec  2 -> add oct 4 hex 6
            3 -> sub oct 34 dec 15    4 -> div dec 4 oct 24           
            5 -> mul hex 1a bin 11""";
    static String PROMPT_EXAMPLES = """
            Please Try to Enter Prompts like these
            1 -> Convert bin 111 dec
            2 -> add dec 14 oct 25
            3 -> mul dec 24 hex 1a
            4 -> convert hex 1a dec 9""";

}