import java.util.Scanner;

class DivisionException extends Exception {
    public String toString() {
        return "Cannot Divided by zero Exception";
    }
}

class InvalidInputException extends Exception {
    public String toString() {
        return "User Input is invalid";
    }
}

class MaxInputException extends Exception {
    public String toString() {
        return "Occur Exception! User Input is High please input to be(100000)lower number";
    }
}

class MaxMultiplierReachedException extends Exception {
    public String toString() {
        return "Dont allow any multiplitation input to be greater 7000";
    }
}

class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int userInput1 = sc.nextInt();
        System.out.println("Enter the second number");
        int userInput2 = sc.nextInt();
        // System.out.printf("Addition of %d and %d is: %d \n", userInput1, userInput2,
        // userInput1 + userInput2 );
        // System.out.printf("Substraction of %d and %d is: %d \n", userInput1,
        // userInput2, userInput1 - userInput2 );
        // System.out.printf("Multiplication of %d and %d is: %d \n", userInput1,
        // userInput2, userInput1 * userInput2 );
        /*
         * try {
         * if (userInput1 == & ) {
         * throw new InvalidInputException();
         * }
         * System.out.printf("Division of %d and %d  is: %d \n", userInput1, userInput2,
         * userInput1 / userInput2);
         * } catch (InvalidInputException e) {
         * System.out.println(e.toString());
         * }
         */
        try {
            if (userInput2 == 0  ) {
                throw new DivisionException();
            }
            System.out.printf("Division of %d and %d  is: %d \n", userInput1, userInput2, userInput1 / userInput2);
 
        } catch (DivisionException e) {
            System.out.println(e.toString());
        }

        try {
            if (userInput1 >= 100000 || userInput2 >= 100000) {
                throw new MaxInputException();
            }
             System.out.printf("Addition of %d and %d  is: %d \n", userInput1, userInput2, userInput1 + userInput2);
            System.out.printf("Substraction of %d and %d  is: %d \n", userInput1, userInput2,
                    userInput1 - userInput2);
                    System.out.printf("Multiplicaion of %d and %d  is: %d \n", userInput1, userInput2, userInput1 * userInput2);

        }

        catch (MaxInputException e) {
            System.out.println(e.toString());
        }
       

        try {
            if (userInput1 >= 100000 || userInput2 >= 7000) {
                throw new MaxMultiplierReachedException();
            }
            System.out.printf("Max multiplication  of %d and %d  is: %d \n", userInput1, userInput2, userInput1 * userInput2);
        } catch (MaxMultiplierReachedException e) {
            System.out.println(e.toString());
        }

        System.out.println("***********************************");
    }
}