import java.util.Scanner;

class CustomException extends Exception {// custom exception
    public String toString() {
        return "error Invalid array index or Custom Exception";
    }
}

public class Custom_exception_practic {

    // public static int meth(int i) throws CustomException {
    //     if (i >= 5) {
    //         throw new CustomException();
    //     }
    //     return 0;
    // }

    public static void main(String[] args) {

        int marks[] = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        int index;
        boolean flag = true;
    
        while (flag && i < 5) {
            try {
                System.out.println("Enter the number");
                index = sc.nextInt();
                if (i >= 5) {
                    throw new CustomException();
                }
              
                System.out.println("The value of index is " + marks[index]);
                
                break;// valid index put karna ke bad break ho jayega. otherwise invalid hone per 5
                      // types try
                      // karne ke bad error message show karega.
            }

            catch(CustomException e) {
                System.out.println("Enter the valid index");
                i++;
                System.out.println(e.toString());
            }
        }

        System.out.println("gjhgjh");
    }
}
