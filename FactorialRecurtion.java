
import java.util.Scanner;
public class FactorialRecurtion {

   static int factorial(int n){
if(n==0 || n==1){
    return 1;
}
else {
    return n*factorial(n-1);
}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
System.out.printf("The factorial of %d is:%d", n, factorial(n));

    }
}