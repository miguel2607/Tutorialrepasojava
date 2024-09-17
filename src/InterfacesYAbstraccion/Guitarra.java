package InterfacesYAbstraccion;

public abstract class Guitarra extends Instrmento implements Afinable{

    @Override
    void tocar() {
        System.out.println("la guitarra se esta tocando");
    }

    @Override
    public void afinar() {
        System.out.println(" se esta afinando la guitarra");
    }
}
