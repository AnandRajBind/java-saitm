class Mythread implements Runnable {
    public Mythread(String name) {
        // super(name);
        System.out.println("Thread constructor is  created using runnable interface : ");
    }

    public void run() {
    }
}

public class Thread_Constructor2 {
    public static void main(String[] args) {
        Mythread bullet = new Mythread("Anand");
        Thread gun = new Thread(bullet, "Anand raj bind");
        gun.start();
        System.out.println("Thread name is : " + gun.getName());
        System.out.println("Thread id is : " + gun.getId());
    }
}
