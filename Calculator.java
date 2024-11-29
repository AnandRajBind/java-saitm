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
    static int userInput1;
    static int userInput2;
    static  Scanner sc = new Scanner(System.in);
static int result;
    public static void userInput() {
        System.out.println("Enter the first number");
        userInput1 = sc.nextInt();
        System.out.println("Enter the second number");
        userInput2 = sc.nextInt();
    }

    public static int addition() throws MaxInputException, InvalidInputException {
        userInput();
        if (userInput1 >= 100000 || userInput2 >= 100000) {
            throw new MaxInputException();
        }
        if (userInput1 == 8 || userInput2 == 9) {
            throw new InvalidInputException();
        }
        return userInput1 + userInput2;
    }

    public static int substraction() throws MaxInputException, InvalidInputException {
        userInput();
        if (userInput1 >= 100000 || userInput2 >= 100000) {
            throw new MaxInputException();
        }

        if (userInput1 == 8 || userInput2 == 9) {
            throw new InvalidInputException();
        }

        return userInput1 - userInput2;
    }

    public static int multiplication() throws MaxInputException, InvalidInputException, MaxMultiplierReachedException {

        userInput();
        if (userInput1 >= 100000 || userInput2 >= 100000) {
            throw new MaxInputException();
        }
        if (userInput1 == 8 || userInput2 == 9) {
            throw new InvalidInputException();
        }
        if (userInput1 >= 70000 || userInput2 >= 70000) {
            throw new MaxMultiplierReachedException();
        }
        return userInput1 * userInput2;
    }

public static int division() throws MaxInputException, InvalidInputException, DivisionException {


    userInput();
    if (userInput1 >= 100000 || userInput2 >= 100000) {
        throw new MaxInputException();
    }
    
    if (userInput1 == 8 || userInput2 == 9) {
        throw new InvalidInputException();
    }
    
    if (  userInput2 == 0) {
        throw new DivisionException();
    }
    
    return userInput1 / userInput2;
}

    /**
     * @param args
     * @throws MaxInputException
     * @throws InvalidInputException
     */
    public static void main(String args[]) throws MaxInputException, InvalidInputException, MaxMultiplierReachedException, DivisionException {
//userInput();
//substraction();
//multiplication();
//division();

System.out.println("*****************Enter the operation you want to perform************** ");
System.out.println("1. Addition \n 2. Substraction \n 3. Multiplication \n 4. Division");
result = sc.nextInt();
switch (result) {
    case 1 : 
        System.out.println("Addition of two numbers is: " + addition());
        break;
    case 2 : 
        System.out.println("Susubstraction of two numbers is: " + substraction());
        break;
    case 3 : 
        System.out.println("Mumultiplication of two numbers is: " + multiplication());
        break;
    case 4 : 
        System.out.println("Division of two numbers is: " + division());
        break;
    default:
System.out.println("Invalid Input ");
}
}
}