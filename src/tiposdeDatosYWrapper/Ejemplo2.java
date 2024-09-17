package tiposdeDatosYWrapper;

public class Ejemplo2 {

    public double calificacion = 4.56766;
    Double numero = Double.valueOf(calificacion);


    public static void main(String[] args) {

        // Ejercicio 2: Escribe un programa que convierta un valor double
        // en un objeto Double, realice una operación con él y luego lo convierta de nuevo a primitivo.

        Ejemplo2 E = new Ejemplo2();

        System.out.println("el numero wrapper es " + E.numero);

    }



}

