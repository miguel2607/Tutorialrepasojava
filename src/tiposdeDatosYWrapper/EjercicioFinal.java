package tiposdeDatosYWrapper;

import java.util.ArrayList;

public class EjercicioFinal {

    public static void main(String[] args) {

        ArrayList<Integer> nuevosNumero = new ArrayList<>();

        nuevosNumero.add(12);
        nuevosNumero.add(13);
        nuevosNumero.add(14);


        int suma = 0;

        for (Integer numeros : nuevosNumero){
            suma += numeros;
        }
        System.out.println("numeros sumados = " + suma);

    }
}
