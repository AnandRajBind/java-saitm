import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to print the Table ");
        int num = sc.nextInt();
        System.out.println("Your Table is:");
int i=1;
     while(i<=10){
            System.out.printf("%d * %d = %d \n",num,i,num*i);
            i++;
        }
    }
}
