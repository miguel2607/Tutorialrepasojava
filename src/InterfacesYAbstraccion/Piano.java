package InterfacesYAbstraccion;

public abstract class Piano extends Instrmento implements Afinable{

    @Override
    void tocar() {
        System.out.println("el piano se esta tocando");
    }

    @Override
    public void afinar() {
        System.out.println(" se esta afinando el piano");
    }
}
