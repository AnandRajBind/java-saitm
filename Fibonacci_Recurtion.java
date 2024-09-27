import java.util.Scanner;

public class Fibonacci_Recurtion {
 // fibonacci series using recurtion print the n(6)th number
    static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        // fibonacci method call
        int result = fibonacci(5);
        System.out.println("The fibonacci series is: " + result);
    }
}
