package one.digital.innovation.gof.strategy;

public class ComportamentoDenfesivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente....");
    }
}
