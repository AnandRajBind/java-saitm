
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to print counting ");
        int num = sc.nextInt();
        System.out.println("Your Counting is:");

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
            
        }
    }
}
