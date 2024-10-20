import java.util.Scanner;

public class Specific_Exception {
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        System.out.println("Enter the array index ");
        Scanner sc = new Scanner(System.in);
        int ind = sc.nextInt();
        System.out.println("Enter the number you want to divide the array element with ");
        int number = sc.nextInt();

        try {
            System.out.println("The value at array index enterd is:" + marks[ind]);
            System.out.println("The value of array-value/number is:" + marks[ind] / number);
        }
        // only Arithmatic exception will be caught
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException occured");
            System.out.println(e);
        }  
         // only ArrayIndexOutOfBounds exception will be caught

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        }
        // all other exceptions will be caught
        catch (Exception e) {
            System.out.println("Some other exception occured");
            System.out.println(e);
        }
    }
}
