package tiposdeDatosYWrapper;

public class Ejemplo4 {

    double estatura = 2.03;

    Double creandoObjeto = estatura;

    double regresandolo = creandoObjeto;

    public static void  main(String[] args) {
        //Ejercicio 2: Escribe un programa que convierta un valor double en un
        //objeto Double, realice una operación con él y luego lo convierta de nuevo a primitivo.


        Ejemplo4 ejemplo4 = new Ejemplo4();

        if (ejemplo4.estatura > 1.55) {
            System.out.println("el numero nuevo es " + ejemplo4.estatura + 1);
            System.out.println(ejemplo4.regresandolo);

        }else {
            System.out.println(0);
        }

    }


}
