import java.util.Scanner;

public class Nested_Try_Catch {
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while (flag) {

            System.out.println("Enter the value of  array index ");

            int ind = sc.nextInt();
            try {

                System.out.println("It is first try block ");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Ending of the program");
    }
}
