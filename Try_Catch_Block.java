public class Try_Catch_Block {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        int c ;
        try {
            c = a / b;
            System.out.println("The result is: " + c);
        } catch (Exception e) {// Exception is  a object 
            System.out.println(" We faild to divide. Reason:"  );
            System.out.println(e);
        }
        System.out.println("This is the end of the program.");
    }
}
