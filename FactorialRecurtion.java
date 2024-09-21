
import java.util.Scanner;

public class FactorialRecurtion {
// factorial using recurtion 
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
// sum of natural numbers using recurtion

static int sumRecursion(int n) {

    if (n == 1) {
        return 1;
    }
    return n + sumRecursion(n - 1);
}
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
        System.out.printf("The factorial of %d is:%d \n", n, factorial(n));
        sumRecursion(n);
        System.out.printf("Sum of %d natural numbers is %d: ",n, sumRecursion(n));

// fibonacci method call
   int result = fibonacci(5);
    System.out.println("The fibonacci series is: " + result);
    }
}

