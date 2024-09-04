
import java.util.Scanner;

public class SumNaturalNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  n natural number you want to sum ");
        int num = sc.nextInt();
        System.out.println("Sum of your natural is:");
int sum=0;

        for (int i = 1; i <= num; i++) {
             sum=sum+i;
        }
        System.out.println(sum);
    }
}
