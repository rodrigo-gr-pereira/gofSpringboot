package one.digital.innovation.gof.singleton;
/**
 * Singleton "preguiçoso"
 *
 * @autor falvojr
 *
 * */
public class SingletonLazy {
    private static SingletonLazy instacia;

    private SingletonLazy(){
        super();
    }
    public  static SingletonLazy getInstacia(){
        if(instacia == null){
            instacia = new SingletonLazy();
        }
        return instacia;
    }
}
