class c1 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hi, my name is func1");
        }
    }
}

class c2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hi, my name is func2");
        }
    }
}

public class Extending_Thread_class {
    public static void main(String[] args) {
        c1 obj1 = new c1();
        c2 obj2 = new c2();
        obj1.start();
        obj2.start();
    }
}
