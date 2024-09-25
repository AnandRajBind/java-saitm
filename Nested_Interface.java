interface Showable {
    void show();

    public static interface Message {
        void msg();
    }
}

public class Nested_Interface implements Showable, Showable.Message {

    public void msg() {
        System.out.println("Hello nested msg method");
    }
    public void show() {
        System.out.println("Hello nested show method");
    }

    public static void main(String[] args) {
        Nested_Interface message1 = new Nested_Interface();// create object through the implemented class
      //  Showable.Message message2 = new Nested_Interface();// create object through the interface

      message1.show();
        message1.msg();// method call through the object of the implemented class
      //  message2.msg();// method call through the object of the interface

   //  msg();
    }
}