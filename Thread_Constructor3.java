class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }
    @Override
    public void run() {
        int i = 34;
        System.out.println("Thank You");
        // while (true) {
        //     System.out.println("I am a thread");
        // }
    }
}

class MyThr1 implements Runnable {
    public MyThr1(Runnable r, String name) {
        super();
    }
    @Override
    public void run(){
        System.out.println("I am a thread with runnable");
    }
}

public class Thread_Constructor3{
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Pragyesh");
        MyThr t2 = new MyThr("Harry");
        // t1.start();
        // t2.start();
        // System.out.println("The id of the thread t1 is " + t1.getId());
        // System.out.println("The name of the thread t1 is " + t1.getName());
        // System.out.println("The id of the thread t2 is " + t2.getId());
        // System.out.println("The name of the thread t2 is " + t2.getName());

        // MyThr1 bullet1 = new MyThr1(t1);
        MyThr1 bullet1 = new MyThr1(t2, "Harry");
        Thread gun1 = new Thread(bullet1);
        System.out.println("The id of the thread gun1 is " + gun1.getId());
        System.out.println("The name of the thread gun1 is " + gun1.getName());
        gun1.start();
        t1.start();
    }
}