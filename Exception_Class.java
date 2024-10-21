
// In java Exception is a  built is class. we can write our custom exceptions using Exception class in java.

import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

public class Exception_Class {
    public static void main(String args[]) throws MyException {
        int a;
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        a = sc.nextInt();
        try {
            if (a < 99) {
                // throw new MyException();
                throw new ArithmeticException("This is an Exception");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());// this will print the getMessage() method of MyException class.it is
                                               // called by manually.it is help to print the message of exception.
            System.out.println(e.toString());
            // System.out.println(e);// this will also call the toString() method.it is
            // called by default.

            e.printStackTrace();// this will print the stack trace of the exception.it is help to print the
                                // exception in detail.
            System.out.println("Finished");
            System.out.println(" Yes Finished");
        }

    }
}
