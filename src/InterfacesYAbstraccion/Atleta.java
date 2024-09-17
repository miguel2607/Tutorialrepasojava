package InterfacesYAbstraccion;

public class Atleta implements Corredor,Saltador{
    @Override
    public void correr() {
        System.out.println("el atleta esta corriendo");
    }

    @Override
    public void saltar() {
        System.out.println("el atleta esta saltando");
    }
}
