class MyThread extends Thread {
    public void run() {
        try {

            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }
        int i = 0;
        while (true) {
            System.out.println("good morning");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        int i = 0;
        while (true) {

            System.out.println("Welcome");
            i++;
        }
    }
}

class Thread_Practice {
    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        // t1.setPriority(6);// Thread.MIN_PRIORITY=1
        // t2.setPriority(9);// Thread.MAX_PRIORITY=10
        System.out.println("Priority of t1 thread  is : " + t1.getPriority());
        System.out.println("Priority of t2 thread  is : " + t2.getPriority());
        System.out.println("State  of t1 thread  is : " + t1.getState());

        t1.start();
        t2.start();
        System.out.println("State  of t2 thread  is : " + t2.getState());
        System.out.println("check the current State  of thread: " + Thread.currentThread().getState());
    }
}
