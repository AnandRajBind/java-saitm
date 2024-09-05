import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args) 
    {

    
        Scanner sc = new Scanner(System.in);
        int a[]=new int [5];
System.out.printf("Enter the array value\n");
for(int i=0; i<a.length; i++){
a[i]=sc.nextInt();
}
for(int i=0; i<a.length; i++){
    System.out.println(a[i]);
}
}
}
