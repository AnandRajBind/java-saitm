class MyThreadRunnable1 implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Runnable Thread1 is running");
            System.out.println("Runnable ++++++++++++++++++Thread1 is running");
            System.out.println("Runnable--------------------------------- Thread1 is running");
        }
    }
}

class MyThreadRunnable2 implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Runnable Thread2 is running");
            System.out.println("Runnable Thread2//////////////////////////////////// is running");
            System.out.println("Runnable Thread2****************************************** is running");
        }
    }
}

public class Threading_with_runnable_interface {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
