package ModificadoresDeAcceso;

public class gerenteEmpleado extends Empleado {


    public gerenteEmpleado(int sueldo) {
        super(sueldo);
    }

    public void mostrarDetalles() {
        System.out.println("Sueldo del empleado: " + sueldo);
        System.out.println("Bono del empleado: " + calcularBono());
    }
}
