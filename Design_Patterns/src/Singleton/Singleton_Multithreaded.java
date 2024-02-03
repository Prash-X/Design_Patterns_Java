package Singleton;
public class Singleton_Multithreaded {
    private static Singleton_Multithreaded instance;

    private Singleton_Multithreaded(){

    }

    public static Singleton_Multithreaded getInstance() {
        if (instance == null) {
            synchronized (Singleton_Multithreaded.class) { //take the lock
                if (instance == null) {
                    instance = new Singleton_Multithreaded();
                    System.out.println("Object created using Thread: "+Thread.currentThread().getName());
                }
            }
        }
        return instance;
    }
}
