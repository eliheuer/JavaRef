/**
* A java reference file, based on the book ThinkJava
*
* TODO add a better description here.
*
* @author  Eli Heuer
* @version 1.0
* @since   2017-11-6
*/

import java.util.Arrays;
import java.util.Scanner;

public class JavaRef {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        /** Chapter 01: The Way of the Program: */
//        basicPrint();
//        escapeSequences();

        /** Chapter 02: Variables and Operators: */
//        declaringVariables();
//        printingVariables();

        /** Chapter 03: Input and Output: */
//        basicInput();
//        literalsConstants();
//        formattingOutput();
//        modulusOperator();
//        scannerBug();

        /** Chapter 04: Void Methods: */
//        basicMethod("don't make me say this twice!");
//        basicMath();
//        int hour = 11;
//        int minute = 59;
//        multipleParameters(hour, minute);

        /** Chapter 05: Conditionals and Logic. */
//        relationalOperators();
//        System.out.println(checkPalindrome("racecar"));
//        booleanFlag();
//        chainingAndNesting();
//        returnStatement(-34);
//        int b = 45;
//        scanDouble(in,b);
//        countdown(b);
//        displayBinary(b);
        
        // Chapter 06: Value Methods
        System.out.println(basicReturnValues(23.4));
        double vtest = basicReturnValues(23);
        System.out.println(vtest);
        
        System.out.println(absoluteValue(-3));
        
        // Chapter 07: Loops

        // Chapter 08: Arrays

        // Chapter 09: Strings and Things

    }

    /** Basic printing. */
    public static void basicPrint() {                    // this is a method
        System.out.print("Goodbye, ");                   // this is a statement.
        System.out.println("cruel world");  
    }

    /** Escape Sequences. */
    public static void escapeSequences() {                                         //  This is a method
        System.out.print("Hello\nhow are you\ndoing?\n");                          //  \n = new line
        System.out.print("Here is a list: \n\t 1.apple \n\t 2.orange \n");         //  \t = tab
        System.out.print("Hello \"how\" are you doing?\n");                        //  \" = double quote
        System.out.print("Hello \\how\\ are you doing?\n");                        //  \\ = backslash
    }

    /** Declaring Variables */
    public static void declaringVariables() {
        String firstName;
        firstName = "Eli";
        String lastName = "Hooper";
        int hour, minute;
    }

    /** Printing Variables */
    public static void printingVariables() {
        String lastName = "Hooper";
        System.out.println(lastName);
    }

    /** Printing Variables */
    public static void basicArithmetic() {
        String lastName = "Hooper";
        System.out.println(lastName);
    }

    /** Printing Variables */
    public static void basicInput() {
        String lastName = "Hooper";
        System.out.println(lastName);
    }

    /** Literals and Constants */
    public static void literalsConstants() {
        double cmPerInch = 2.54;
        cm = inch * cmPerInch;
        final double CM_PER_INCH = 2.54;
    }

    /** Printing Variables */
    public static void formattingOutput() {
        // \%d     decimal integer                             12345
        // \%08d   padded with zeros, at least 8 digits wide   00012345
        // \%f floating-point                                  6.789000
        // \%.2f   rounded to 2 decimal places                 6.79
        
        final double CM_PER_INCH = 2.54;
        int inch = 100;
        double cm = inch * CM_PER_INCH;
        System.out.printf("%d in = %f cm\n", inch, cm);
    }

    /** Modulus Operator */
    public static void modulusOperator() {
        double cm;
        int feet, inches, remainder;
        final double CM_PER_INCH = 2.54;
        final int IN_PER_FOOT = 12;
        Scanner in = new Scanner(System.in);

        // prompt the user and get the value
        System.out.print("Exactly how many cm? ");
        cm = in.nextDouble();

        // convert and output the result
        inches = (int) (cm / CM_PER_INCH);
        feet = inches / IN_PER_FOOT;
        remainder = inches % IN_PER_FOOT;
        System.out.printf("%.2f cm = %d ft, %d in\n",
                          cm, feet, remainder);
    }
    

    /** Scanner Bug */
    public static void scannerBug() {

        // When you read a String followed by an int, 
        // everything works just fine. But when you read an 
        // int followed by a String, something strange happens.

        Scanner input = new Scanner(System.in);
        String name;
        int age;

        // Works
        System.out.print("What is your name? ");
        name = input.nextLine();
        System.out.print("What is your age? ");
        age = input.nextInt();
        System.out.printf("Hello %s, age %d\n", name, age);

        // Has bug
        System.out.print("What is your age? ");
        age = input.nextInt();
        System.out.print("What is your name? ");
        name = input.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);

        // Bug fixed
        System.out.print("What is your age? ");
        age = input.nextInt();
        input.nextLine();  // read the newline
        System.out.print("What is your name? ");
        name = input.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);
    }

    /** Basic Math */
    public static void basicMath() {
        double root = Math.sqrt(17.0);
        double angle = 1.5;
        double height = Math.sin(angle);

        double degrees = 90;
        double angle2 = degrees / 180.0 * Math.PI;
        double radians = Math.toRadians(180.0);
        double degrees2 = Math.toDegrees(Math.PI);
        long x = Math.round(Math.PI * 20.0);

        double x2 = Math.cos(angle + Math.PI / 2.0);
        double x3 = Math.exp(Math.log(10.0));
        double x4 = Math.pow(2.0, 10.0);
    }

    /** Basic Method */
    public static void basicMethod(String s) {
            System.out.println(s);
            System.out.println(s);
    }

    /** Multiple parameters, s 4.6, p 56*/
    public static void multipleParameters(int hour, int minute) {
        System.out.print(hour);
        System.out.print(":");
        System.out.println(minute);
    }
    
    /** Relational operators, s 5.1, p 67 */
    public static void relationalOperators() {
        //  x == y          // x is equal to y
        //  x != y          // x is not equal to y
        //  x >  y          // x is greater than y
        //  x <  y          // x is less than y
        //  x >= y          // x is greater than or equal to y
        //  x <= y          // x is less than or equal to y
        String fruit1 = "Apple";
        String fruit2 = "Orange";
        int x = 1;
        int y = 2;
        System.out.println(fruit1.equals(fruit2));
        System.out.println(x == y);
        System.out.println(x != y);
    }

    /** Logical operators, s 5.2, p 68 */
    public static void logicalOperators() {
        //  x == y          // x is equal to y
        //  x != y          // x is not equal to y
        //  x >  y          // x is greater than y
        //  x <  y          // x is less than y
        //  x >= y          // x is greater than or equal to y
        //  x <= y          // x is less than or equal to y
        String fruit1 = "Apple";
        String fruit2 = "Orange";
        int x = 1;
        int y = 2;
        System.out.println(fruit1.equals(fruit2));
        System.out.println(x == y);
        System.out.println(x != y);
    }

    /** Check Palindrome  */
    public static boolean checkPalindrome(String word) {
        int wordLength = word.length();
        if (wordLength < 2) {
            return true;
        } else if (word.charAt(0) != word.charAt(wordLength - 1)) {
            return false;
            } else {
                return checkPalindrome(word.substring(1, wordLength - 1));
            }
    }

    /** Boolean Flag */
    public static void booleanFlag() {

        // Example
        boolean flag;
        flag = true;
        boolean testResult = false;

        int x = 17;
        int n = 19;
        System.out.println("n = "+n);
    boolean evenFlag = (n % 2 == 0);    // true if n is even
    boolean positiveFlag = (x > 0);     // true if x is positive

    if (evenFlag) {
        System.out.println("n was even when I checked it");
    }

    if (!evenFlag) {
        System.out.println("n was odd when I checked it");
        }
    }

    /** Chaining and nesting, s 5.4, p 71*/
    public static void chainingAndNesting() {
        int x = 17;
        if (x > 0) {
            System.out.println("x is positive");
        } else if (x < 0) {
            System.out.println("x is negative");
        } else {
            System.out.println("x is zero");
        }
    }

    /** Return Statement, s 5.6, p 72*/
    public static void returnStatement(double x) {
        if (x <= 0.0) {
            System.err.println("Error: x must be positive.");
            return;
        }
        double result = Math.log(x);
        System.out.println("The log of x is " + result);
    }
    
    /** Validating input, s 5.7 */
    public static void validatingInput(double x) {
        if (x <= 0.0) {
            System.err.println("Error: x must be positive.");
            return;
        }
        double result = Math.log(x);
        System.out.println("The log of x is " + result);
    }
    
    /** Scan Double, s 5.7 */
    public static void scanDouble(Scanner in, int b) {
        in.nextLine();  // read the newline
        System.out.println("b = " + b);
        System.out.print("Enter a number: ");
        double x = in.nextDouble();
        validatingInput(x);
    }
    /** countdown, s 5.7 */
    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }

    /** Display Binary, s 5.10 */
    public static void displayBinary(int value) {
        if (value > 0) {
            displayBinary(value / 2);
            System.out.print(value % 2);
        }
    }

    /** Basic Return Values, s 6.01 */
    public static double basicReturnValues(double radius) {
        double result = Math.PI * radius * radius;
        return result;
        // return Math.PI * radius * radius;  // shorter, same result.
    }

    /** Absolute Value, s 6.01 */
    public static double absoluteValue(double x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }
}
