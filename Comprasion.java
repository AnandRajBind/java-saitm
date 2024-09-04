
import java.util.Scanner;

public class Comprasion {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the Value of b: ");
        int b = sc.nextInt();
        System.out.println("Enter the Value of c: ");
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("A is greater Value ");
            } else {
                System.out.println("C is greater Value ");
            }
        } else {
            if (c > b) {
                System.out.println("C is greater Value ");
            } else {
                System.out.println("B is greater Value ");
            }
        }
    }
}
