class Phone{

    public void showTime(){
        System.out.println("Time is 7 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone  extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
      /*  Phone obj1 = new Phone();
        SmartPhone obj2 = new SmartPhone();
        obj1.greet();
        obj1.name(); */
// super class ke reference equals to subclass ke object

// reference hai phone ka lekin obj hai smartphone ka
Phone obj = new SmartPhone(); // This is called Dynamic Method Dispatch.
// SmartPhone obj2 = new Phone(); // Not allowed 
obj.showTime();
obj.on();
// obj.music(); // Not allowed
 }
}
