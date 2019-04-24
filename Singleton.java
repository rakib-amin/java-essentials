/**
* A Singleton Class
*/

public class Singleton {

    private static Singleton singleton;
    
    private static final Object lock = new Object();

    public static Singleton getInstance() {
        Singleton singleton1 = singleton;
        if (singleton1 == null) {
            // making this block thread-safe (not required)
            synchronized (lock) {
                singleton1 = singleton;
                if (singleton1 == null) {
                    singleton1 = new Singleton();
                    singleton = singleton1;
                }
            }
        }
        return singleton1;
    }

    private Singleton() {}
}
