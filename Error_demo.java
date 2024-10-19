import java.util.Scanner;

public class Error_demo {
    public static void main(String[] args) {

        // Syntax error
        // demo********************************************************************************************
        // int a=5// error here missing semicolon
        // b = 6; // error here b is not declared
        // System.out.println(a)
        // Logical error
        // demo*************************************************************************************************
        // Write a program to print all prime number between 1 to 10.
        // Prime number are the natural number that has been two factros 1 and itself.
        System.out.println("Prime numbers between 1 to 10 are:");
        System.out.println(2);
        for (int i = 1; i < 5; i++) {
            System.out.println(2 * i + 1);// logical error here 2, 3, 5, 7 are prime numbers but 9 is not prime number.

        }
        // RunTime error
        // demo*************************************************************************************************
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to divide 1000:");
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is " + 1000 / k);
    }
}
