package Singleton;

public class Client {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("It creates only 1 object with multiple reference declared above ");
        System.out.println(s1==s2); //prints "true"

        Singleton_Multithreaded ms2 = Singleton_Multithreaded.getInstance();

        Runnable r = (()->{
            Singleton_Multithreaded ms1 = Singleton_Multithreaded.getInstance();

        });
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();


    }

}
