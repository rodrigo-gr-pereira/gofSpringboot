package one.digital.innovation.gof.singleton;
/**
 * Singleton "Lazy Holder"
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Ref</a>
 * @autor falvojr
 *
 * */
public class SingletonLazyHolder {
    private static class InstanceHolder{
    public static SingletonLazyHolder instancia  = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }
    public  static SingletonLazyHolder getInstacia(){

        return InstanceHolder.instancia;
    }
}
