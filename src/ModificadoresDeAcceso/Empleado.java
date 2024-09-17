package ModificadoresDeAcceso;

public class Empleado {


    protected double sueldo;

    public Empleado(double sueldo) {
        this.sueldo = sueldo;
    }

    protected double calcularBono(){

       return sueldo * 0.10;

    }


}
