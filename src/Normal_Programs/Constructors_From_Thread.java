package Normal_Programs;

class thread extends Thread {
    public thread() {
    }

    public thread(String name) {
        super(name);
    }

    public thread(Runnable runnable, String name) {
        super(runnable, name);
    }

    public thread(Runnable runnable) {
        super(runnable);
    }

    public void run() {
        System.out.println(getName());
    }
}

class runnable implements Runnable {
    public void run() {
        System.out.println("Hi i am a Runnable Normal_Java_Programs.thread");
    }
}

public class Constructors_From_Thread {
    public static void main(String[] args) {

        runnable r1 = new runnable();

        thread t1 = new thread("Joy");
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getPriority());
        t1.setPriority(4);
        System.out.println(t1.getPriority());
        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());
        t1.setPriority(Thread.NORM_PRIORITY);
        System.out.println(t1.getPriority());
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t1.getState());
        System.out.println(t1.getId());


        thread t2 = new thread(r1);
        System.out.println();
        System.out.println(t2.getState());
        t2.start();
        System.out.println(t2.getPriority());
        System.out.println(t2.getState());
        System.out.println(t2.getId());
        try {
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }


        thread t3 = new thread(r1, "Mridha");
        System.out.println();
        System.out.println(t3.getState());
        t3.start();
        System.out.println(t3.getPriority());
        System.out.println(t3.getState());
        System.out.println(t3.getId());
    }
}
