public class Fundamentals {
    public String student;
    public String teacher;

    public Fundamentals(String studentName, String teacherName) {
        this.student = studentName;
        this.teacher = teacherName;
    }

    public static void PrintFundamentals() {

        System.out.println("=== Welcome to the Java Fundamentals Demo! ===\n");

        /*
         * SECTION 1: BASIC PRINT STATEMENTS & LITERALS
         * - Show string literals and simple statements.
         */
        System.out.println("--- Basic Print Statements ---");
        System.out.println("Hello, this is a string literal printed by a statement.");
        System.out.println("Another string literal: \"Hello World\"");
        System.out.println();

        /*
         * SECTION 2: DATA TYPES & VARIABLES
         * - Demonstrates declaration, assignment, printing of primitive data types.
         */
        System.out.println("--- Data Types & Variables ---");

        // Declaration and initialization of primitive types
        byte myByte = 127;            // max for byte
        short myShort = 1000;
        int myInt = 42;
        long myLong = 123456789L;     // 'L' denotes a long literal
        float myFloat = 3.14F;        // 'F' denotes a float literal
        double myDouble = 1.23456789;
        char myChar = 'A';
        boolean myBoolean = true;

        String [] myPermutations = {"000", "001", "010", "011", "100", "101", "110", "111"};

        int myMaxInt = Integer.MAX_VALUE;
        System.out.println("Max int: " + myMaxInt);

        // Print them out
        System.out.println("byte myByte: " + myByte);
        System.out.println("short myShort: " + myShort);
        System.out.println("int myInt: " + myInt);
        System.out.println("long myLong: " + myLong);
        System.out.println("float myFloat: " + myFloat);
        System.out.println("double myDouble: " + myDouble);
        System.out.println("char myChar: " + myChar);
        System.out.println("boolean myBoolean: " + myBoolean);
        System.out.println();

        /*
         * SECTION 3: WRAPPER CLASSES
         * - Show boxing, unboxing, and some methods of commonly used wrappers.
         */
        System.out.println("--- Common Wrapper Classes ---");

        Byte myByteObj = 127;       // Autoboxing from byte to Byte
        Short myShortObj = 1000;
        Integer myIntObj = 42;
        Long myLongObj = 123456789L;
        Float myFloatObj = 3.14F;
        Double myDoubleObj = 1.23456789;
        Character myCharObj = 'Z';
        Boolean myBoolObj = false;

        System.out.println("Byte object: " + myByteObj + " (toString): " + myByteObj.toString());
        System.out.println("Short object: " + myShortObj);
        System.out.println("Integer object: " + myIntObj + " (binary): " + Integer.toBinaryString(myIntObj));
        System.out.println("Long object: " + myLongObj);
        System.out.println("Float object: " + myFloatObj);
        System.out.println("Double object: " + myDoubleObj);
        System.out.println("Character object: " + myCharObj);
        System.out.println("Boolean object: " + myBoolObj);
        System.out.println("myIntObj.doubleValue(): " + myIntObj.doubleValue());
        System.out.println();

        /*
         * SECTION 4: STRINGS & STRING METHODS
         * - Demonstrates concatenation, length, and a few fundamental methods.
         */
        System.out.println("--- Strings & Basic Methods ---");
        String greet = "Hello mello";
        String who = "World";
        System.out.println("greet: " + greet);
        System.out.println("who: " + who);
        System.out.println("Concatenate greet + who: " + greet + " " + who);
        System.out.println("Length of greet: " + greet.length());
        System.out.println("greet.toUpperCase(): " + greet.toUpperCase());
        System.out.println("greet.toLowerCase(): " + greet.toLowerCase());
        System.out.println("greet.charAt(last char): " + greet.charAt(greet.length() - 1)); //son karakteri verir
        System.out.println("greet.contains(\"ell\"): " + greet.contains("ell"));
        System.out.println();

        /*
         * SECTION 5: OPERATORS & EXPRESSIONS
         * - Introduce arithmetic operators, assignment, and comparison examples.
         */
        System.out.println("--- Operators & Expressions ---");
        int a = 10;
        int b = 3;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));  // integer division
        System.out.println("a % b = " + (a % b));  // modulus
        System.out.println("Is a > b? " + (a > b));
        System.out.println("Is a == b? " + (a == b));
        System.out.println();

        /*
         * SECTION 6: CONVERTING & PARSING
         * - Convert int to String, String to int, etc.
         */
        System.out.println("--- Converting & Parsing ---");
        int numValue = 5;
        String strValue = Integer.toString(numValue);
        System.out.println("Converted int -> String: " + strValue);

        String numericString = "10";
        int parsedInt = Integer.parseInt(numericString);
        System.out.println("Parsed String -> int: " + parsedInt);
        System.out.println();

        /*
         * SECTION 7: CASTING
         * - Demonstrate casting from double to int and from larger to smaller types.
         */
        System.out.println("--- Casting ---");
        double castDouble = 9.99723692736;
        int castInt = (int) castDouble;
        System.out.println("castInt (from 9.99): " + castInt);

        long bigLong = 1000;
        short shortVal = (short) bigLong; // possible data loss if bigLong > Short.MAX_VALUE
        System.out.println("shortVal (from 1000L): " + shortVal);
        System.out.println();

        /*
         * SECTION 8: BASIC CONTROL FLOW
         * - If/else, for loop, while loop examples.
         */
        System.out.println("--- Control Flow (If/Else, Loops) ---");

        // If/Else
        int checkValue = 7;
        if (checkValue % 2 == 0) {
            System.out.println(checkValue + " is even");
        } else {
            System.out.println(checkValue + " is odd");
        }

        // For Loop
        System.out.print("For Loop (numbers 1 to 5): ");
        for (int i = 1; i <= 5; i++) { //i=i+1;
            System.out.print(i + " ");
        }

        System.out.println();

        // While Loop
        int count = 3;
        System.out.print("While Loop (count down): ");
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }

        System.out.println("\n");

        /*
         * SECTION 9: ARRAYS & SIMPLE MANIPULATION
         * - Demonstrates array declaration, indexing, loop through an array.
         */
        System.out.println("--- Arrays ---");
        int[] numbers = { 10, 20, 30, 40, 50, 609 }; // fixed size array
        System.out.println("Array length: " + numbers.length);
        System.out.println("Element at index 2: " + numbers[2]);

        // Loop through array
        System.out.print("All elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        for(int i =0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }

        System.out.println("\n");

        /*
         * SECTION 10: BASIC MATH
         * - Essential Math functions useful in problem-solving.
         */
        System.out.println("--- Basic Math Functions ---");
        System.out.println("Math.PI: " + Math.PI);
        System.out.println("Math.E: " + Math.E);
        System.out.println("Math.abs(-5): " + Math.abs(-5));
        System.out.println("Math.max(3, 7): " + Math.max(3, 7));
        System.out.println("Math.min(3, 7): " + Math.min(3, 7));
        System.out.println("Math.pow(2, 3): " + Math.pow(2, 3));
        System.out.println("Math.sqrt(16): " + Math.sqrt(16));
        System.out.println("Random (0 <= x < 1): " + Math.random());

        System.out.println("\n=== End of Demo ===");
    }
}
