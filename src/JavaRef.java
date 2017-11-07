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
import java.util.Random;

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
//        System.out.println(basicReturnValues(23.4));
//        double vtest = basicReturnValues(23);
//        System.out.println(vtest);
//        
//        System.out.println(absoluteValue(-3));
//        System.out.println(distance(23,45,67,21));
//        System.out.println(isSingleDigit(3));
//        zTest();
//        System.out.println("prod = "+prod(1, 4));
//        System.out.println(fibonacci(13));
//        fib();
//        System.out.println(ackermann(1, 15));

        // Chapter 07: Loops
//        whileLoop(3);
        
//        System.out.println("example2");
//        example2();
//        System.out.println("example3");
//        example3();
//        System.out.println("example4");
//        example4();
//        System.out.println("example5");
//        example5();
//        System.out.println("printRow");
//        printRow();
//        System.out.println("printRow2");
//        printRow2(6);
//        System.out.println("printTable");
//        printTable();
//        System.out.println("printTable2");
//        printTable2(6);
//        System.out.println("printRow3");
//        printRow3(6, 6);
//        System.out.println("printTable3");
//        printTable3(6);
//        System.out.println("printRow4");
//        printRow4(6, 12);
//        System.out.println("printTable4");
//        printTable4(6);
//        addNumbers(in);
//        scanDoubleOne(in);
//        scanDouble2(in);
//          starTri();
//          starTriNum();
          
        // Chapter 08: Arrays
//        basicArray();
//        sumArray();
//        gridArray();
//        testArray();
//        indexArray();
        copyArray();
        
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
        int inch = 100;
        double cm = inch * cmPerInch;
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

    /** Distance, s 6.02 */
    public static double distance
        (double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        System.out.println("dx is " + dx);
        System.out.println("dy is " + dy);
        double dsquared = dx * dx + dy * dy;
        System.out.println("dsquared is " + dsquared);
        double result = Math.sqrt(dsquared);
        return result;
    }

    /** Is Single Digit, s 6.05 */
    public static boolean isSingleDigit(int x) {
        return x > -10 && x < 10;
    }

    /** Z test, s 6.05 */
    public static boolean zTest() {
        int z = 3;
        if (isSingleDigit(z)) {
            System.out.println("z is small");
            return true;
        } else {
            System.out.println("z is big");
            return false;
        }
    }

    /** prod, s 6.07 */
    public static int prod(int m, int n) {
        if (m == n) {
            return n;
        } else {
            int recurse = prod(m, n - 1);
            int result = n * recurse;
            return result;
        }
    }

    /** fibonacci, s 6.07 */
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /** fib, s 6.07 */
    public static void fib() {
        for(int i=1,f=0,n=0; n<15; n++) {
            System.out.println(i = (f+(f+i)) - (f=f+i) );
        }
    }

    /** Ackermann function, s 6.11 */
    public static int ackermann(int m, int n) {
        if (m < 0 || n < 0) {
            throw new IllegalArgumentException("Non-negative args only!");
        }

        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return ackermann(m-1, 1); // Corrected!
        } else {
            // perforce (m > 0) && (n > 0)
            return ackermann(m-1, ackermann(m,n-1));
        }
    }
    
    /** While Loop, s 6.11 */
    public static void whileLoop(int n) {
        // 1. Evaluate the condition, yielding true or false.
        // 2. If the condition is false, skip the body and go to the next statement.
        // 3. If the condition is true, execute the body and go back to step 1.

        while (n > 0) {
            System.out.println(n);
            n = n - 1;
        }
        System.out.println("Blastoff!");
    }

    /** Example, s 7.11 */
    public static void example2() {
        int i = 1;
        while (i < 10) {
            double x = i;
            System.out.println(x + "   " + Math.log(x) / Math.log(2));
            i = i + 1;
        }
    }

    /** Example, s 7.11 */
    public static void example3() {
        final double LOG2 = Math.log(2);
        int i = 1;
        while (i < 100) {
            double x = i;
            System.out.println(x + "   " + Math.log(x) / LOG2);
            i = i * 2;
        }
    }

    /** Example, s 7.11 */
    public static void example4() {
        int i = 1;
        while (i <= 64) {
            System.out.printf("%08d\n", 2 * i);
            i = i + 1;
        }
        System.out.println();
    }

    /** Example, s 7.11 */
    public static void printRow() {
        int i = 1;
        while (i <= 6) {
            System.out.printf("%4d", 2 * i);
            i = i + 1;
        }
        System.out.println();
    }

    /** Example, s 7.11 */
    public static void printRow2(int n) {
        int i = 1;
        while (i <= 6) {
            System.out.printf("%4d", n * i);
            i = i + 1;
        }
        System.out.println();
    }

    /** Example, s 7.11 */
    public static void example5() {
        int i = 1;
        while (i <= 6) {
            printRow2(i);
            i = i + 1;
        }
    }

    /** Example, s 7.11 */
    public static void printTable() {
        int i = 1;
        while (i <= 6) {
            printRow2(i);
            i = i + 1;
        }
    }

    /** Example, s 7.11 */
    public static void printTable2(int rows) {
        int i = 1;
        while (i <= rows) {
            printRow2(i);
            i = i + 1;
        }
    }

    /** Example, s 7.11 */
    public static void printRow3(int n, int cols) {
        int i = 1;
        while (i <= cols) {
            System.out.printf("%4d", n * i);
            i = i + 1;
        }
        System.out.println();
    }

    /** Example, s 7.11 */
    public static void printTable3(int rows) {
        int i = 1;
        while (i <= rows) {
            printRow3(i, rows);
            i = i + 1;
        }
    }

    /** Example, s 7.11 */
    public static void printTable4(int rows) {
        for (int i = 1; i <= rows; i = i + 1) {
            printRow4(i, rows);
        }
    }

    /** Example, s 7.11 */
    public static void printRow4(int n, int cols) {
        int i;
        for (i = 1; i <= cols; i = i + 1) {
            System.out.printf("%4d", n * i * i);
        }
        System.out.println(i);
    }

    /** Add numbers, s 7.7 */
    public static void addNumbers(Scanner in) {
        // Scanner in = new Scanner(System.in);
        // in.nextLine();  // read the newline
        int xx = -1;
        int sum = 0;
        while (xx != 0) {
            System.out.print("Enter a number:");
            xx = in.nextInt();
            if (xx <= 0) {
                continue;
            }
            System.out.println("Adding " + xx);
            sum += xx;
        }
        System.out.println(sum);
    }

    /** Validate, s 7.7 */
    public static double scanDoubleOne(Scanner in) {
        boolean okay;
        do {
            System.out.print("Enter a number: ");
            if (in.hasNextDouble()) {
                okay = true;
            } else {
                okay = false;
                String word = in.next();
                System.err.println(word + " is not a number");
            }
        } while (!okay);
        double x = in.nextDouble();
        return x;
    }

    /** Validate, s 7.7 */
    public static double scanDouble2(Scanner in) {
        while (true) {
            System.out.print("Enter a number: ");
            if (in.hasNextDouble()) {
                break;
            }
            String word = in.next();
            System.err.println(word + " is not a number");
        }
        double x = in.nextDouble();
        return x;
    }

    /** Validate, s 7.7 */
    public static void starTri() {
        for (int i = 0; i <= 7; i++) {
            for (int j = 6; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    /** Validate, s 7.7 */
    public static void starTriNum() {
        for (int i = 0; i <= 7; i++) {
            for (int a = 1; a <= i; a++ ) {
                System.out.print(a);
            }
            for (int j = 6; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /** Array, s 8.0 */
    public static void basicArray() {
        // Number Array
        int[] randArray = new int[9];
        Random rand = new Random();
        for (int i = 0; i < randArray.length; i++)
            randArray[i] = rand.nextInt(100) + 1;
        System.out.println(Arrays.toString(randArray));
        Arrays.sort(randArray);
        System.out.println(Arrays.toString(randArray));
        // name Array
        String[] nameArray = new String[] {"Eli", "Bill", "Bob", "Sam"};
        System.out.println(Arrays.toString(nameArray));
        Arrays.sort(nameArray);
        System.out.println(Arrays.toString(nameArray));
        int[] counts = new int[4];
        counts[0] = 7; 
        counts[1] = counts[0] * 2; 
        counts[2]++; 
        counts[3] -= 60;
        System.out.println("New Array: " + Arrays.toString(counts));
    }

    /** Array, s 8.0 */
    public static void sumArray() {
        // sum Array
        int[] sumArray = new int[9];
        Random rand = new Random();
        for (int i = 0; i < sumArray.length; i++)
            sumArray[i] = rand.nextInt(100) + 1;
        System.out.println("Array to sum: " + Arrays.toString(sumArray));
        int sum = 0;
        for(int num : sumArray) {
            sum += num;
        }
        System.out.println("Sum of array elements is: "+sum); 
    }

    /** Array, s 8.0 */
    public static void gridArray() {
        // print grid
        
        int[] nums = {0,0,0,0,0,0,0,0,0,0};
        int[] nums1 = {1,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < nums.length; j++) {
                   System.out.print(nums[j]+ " ");
                }
                System.out.println(" ");
         }
         for (int k = 0; k < nums1.length; k++) {
             System.out.print(nums1[k]+ " ");
         }
         System.out.println(" ");
    }

    /** Array, s 8.0 */
    public static void testArray() {
        // Number Array
        int value = 12;
        int[] randArray = new int[15];
        Random rand = new Random();
        for (int i = 0; i < randArray.length; i++)
            randArray[i] = rand.nextInt(100) + 1;
        System.out.println(Arrays.toString(randArray));
        System.out.print("Array contains 12: ");
        System.out.println(containsX(randArray, value));
    }

    public static boolean containsX(int[] arr, int item) {
        for (int n : arr) {
           if (item == n) {
              return true;
           }
        }
        return false;
     }

    /** Array, s 8.0 */
    public static void indexArray() {
        int num1 = 34;
        int num2 = 35;
        int[] my_array = {234, num1, 76, num2, 36, 56};
        System.out.println("Index position of 25 is: " + findIndex(my_array, num1));
        System.out.println("Index position of 77 is: " + findIndex(my_array, num2));
    }

    public static int  findIndex (int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }

    /** Array, s 8.0 */
    public static void copyArray() {
        int[] oldArray = {5, 4, 6, 1, 6, 5, 7, 8, 9};
        int[] newArray = new int[9];     
        System.out.println("Old Array: " + Arrays.toString(oldArray));
        for(int i=0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        System.out.println("New Array: " + Arrays.toString(newArray));
    }
}
