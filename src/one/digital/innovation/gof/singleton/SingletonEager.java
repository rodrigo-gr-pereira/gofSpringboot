package one.digital.innovation.gof.singleton;
/**
 * Singleton "apresadp"
 *
 * @autor falvojr
 *
 * */
public class SingletonEager {
    private static SingletonEager instancia  = new SingletonEager();

    private SingletonEager(){
        super();
    }
    public  static SingletonEager getInstacia(){
        return instancia;
    }
}
