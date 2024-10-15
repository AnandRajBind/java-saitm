class MyThread extends Thread { // Thread class hai uska already ak constructor hai jisme hum thread ka name
                                // pass kar sakte hai
    public MyThread(String name) {// MyThread class ka constructor
        super(name);
    }

   public void run() {
       System.out.println("Thankyou");
        int i = 0;
        while (i < 3) {
        System.out.println("Thread is running "+ this.getName());
        i++;
        }
   }
}

public class Thread_Constructor {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Anand ");
        MyThread t2 = new MyThread("Raj");
        t1.start();
        try {
            t1.join();   /* yadi ham chahate hai ki t1 thread ka excution complete ho jaye iske bad t2 thread ka executin start ho to uske liye hame join()  method ka use kate hai. */

        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
        System.out.println("Thread id is : " + t1.getId());
        System.out.println("Thread name is : " + t1.getName());
        System.out.println("Thread id is : " + t2.getId());
        System.out.println("Thread name is : " + t2.getName());
    }
}
 