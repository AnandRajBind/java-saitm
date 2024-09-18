
public class Method {

    // static void logic(int x, int y) {
    //     int z;
    //     if (x > y) {
    //         z = x + y;
    //     } else {
    //         z = (x + y) * 5;
    //     }
    //     System.out.println(z);
    // }
    int logic(int x, int y) {   //   static  int logic(int x, int y){}   method declered throug the static keyword 
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String args[]) {
        // int a = 5;
        // int b = 10;

        int c;
        Method obj = new Method();// method call through the object 
        c = obj.logic(10, 20);

        System.out.println("The value of c is:" + obj.logic(10, 5));
        System.out.println("The value of c is:" + c);

        // c = logic(10, 5);// method call without object. in this case method must be declared static keyword.
        // System.out.println("The value of c is:" +  c);
        // System.out.println("The value of c is:" + logic(10, 5));
    }
}
