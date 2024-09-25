import java.util.Scanner;

// prime number are nattural number that are divisible by only 1 and itself.
public class PrimeNumber {

  public void Prime(int num) {
        int prime = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                prime++;
             }
        }
        if (prime == 2) {
            System.out.println("Number is  prime");
        } else {
            System.out.println("Number is not prime");
        }
     }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num");
        int num = sc.nextInt();

        PrimeNumber obj = new PrimeNumber();
        obj.Prime(num);
    }
}
