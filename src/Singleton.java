/**
 * Created by surya on 12/20/17.
 */
public class Singleton {
    private static Singleton soleInstance = new Singleton();

    private Singleton() {
        System.out.println("Creating ...");

    }
    public static Singleton getInstance(){
        return soleInstance;
    }
}