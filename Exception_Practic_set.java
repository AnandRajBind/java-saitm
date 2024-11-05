
import java.util.Scanner;

class Exception_Practic_set {

    public static void main(String[] args) {
        // problem 1***************************************************************
        // syntax error-> int name= anand;

        // logical error->
        int age = 22;
        int year_born = 2000 - age;
        System.out.println("Year born: " + year_born);// logical error that means age is not correct.iske liye hame
                                                      // current year me se age ko subtract karna hoga.
        // runtime error->
        // System.out.println(6 / 0);
        // problm 2**********************************************************
        /*
         * try {
         * int a = 666 / 0;
         * } catch (IllegalArgumentException e) {
         * System.out.println("This is an illegal argument exception");
         * } catch (ArithmeticException e) {
         * System.out.println("This is an arithmetic exception");
         * }
         */
        // problm 3
       

/* 
        class Throw_Throws {
            
              if (r<0) {
                       throw new NegativeRadiusException(); 
              }
                 
              double result = Math.PI * r * r;
              return result;
          }
*/
        int marks[] = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;

        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        boolean flag = true;
        while (flag && i < 5) {
            try {
                System.out.println("Enter the number");
                index = sc.nextInt();
                System.out.println("The value of index is " + marks[index]);
                break;// valid index put karna ke bad break ho jayega. otherwise invalid hone per 5
                      // types try
                      // karne ke bad error message show karega.
            } catch (ArrayIndexOutOfBoundsException e) {
                 System.out.println("Enter the valid index");
                i++;

            }
        }

        class CustomException extends Exception {// custom exception 
            public  String getMessage() {
                return "error Invalid array index or Custom Exception";
            }
        }

             if (i >= 5) {
             throw new  CustomException();
            }
        
   
    }
}
