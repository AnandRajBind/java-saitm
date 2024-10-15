
class MyThread extends Thread {

    public void run() {
        int i = 0;
        while (true) {
            System.out.println("Thankyou  thread class 1 ");
            try {

                Thread.sleep(10);// thread 1 is 10 mili second ke liye pause hoga 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyThread2 extends Thread {

    public void run() {
         while (true) {
            System.out.println("My Thankyou thread class 2 ");
         }
    }
}

public class Thread_Method {
    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        /*
         * yadi ham chahate hai ki t1 thread ka excution complete ho jaye iske bad t2
         * thread ka executin start ho to uske liye hame join() method ka use kate hai.
         */
       /*  try {
            t1.join();

        } catch (Exception e) {
            System.out.println(e);
        }*/
        t2.start();
    }
}
