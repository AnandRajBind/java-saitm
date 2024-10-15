class MyThread extends Thread { // Thread class hai uska already ak constructor hai jisme hum thread ka name
    // pass kar sakte hai
    public MyThread(String name) {// MyThread class ka constructor
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Thankyou  " + this.getName());
            // System.out.println("Thread is running");
            i++;
        }
    }
}

public class Thread_Priority {
    public static void main(String[] args) {
        // Ready Queue: T1 T2 T3 T4 T5
        MyThread t1 = new MyThread("Anand1 (MIN PRIORITY)");
        MyThread t2 = new MyThread("Anand2 (MIN PRIORITY) ");
        MyThread t3 = new MyThread("Anand3 (NORM PRIORITY) ");
        MyThread t4 = new MyThread("Anand4  (NORM PRIORITY) ");
        MyThread t5 = new MyThread("Anand5 (MAX PRIORITY) ");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);// by default priority is 5 norml priority 
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        // System.out.println("The higher priority of " + t5.getName() +
        // t5.setPriority.MAX_PRIORITY);
    }
}
