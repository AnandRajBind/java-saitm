class MyThread extends Thread { // Thread class hai uska already ak constructor hai jisme hum thread ka name
                                // pass kar sakte hai
    public MyThread(String name) {// MyThread class ka constructor
        super(name);
    }

    public void run() {
        System.out.println("Thankyou");
        // int i = 0;
        // while (i < 10) {
        // System.out.println("Thread is running");
        // i++;
        // }
    }
}

public class Thread_Constructor {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Anand ");
        MyThread t2 = new MyThread("Raj");
        t1.start();
        t2.start();
        System.out.println("Thread id is : " + t1.getId());
        System.out.println("Thread id is : " + t1.getName());
        System.out.println("Thread id is : " + t2.getId());
        System.out.println("Thread id is : " + t2.getName());
    }
}
 