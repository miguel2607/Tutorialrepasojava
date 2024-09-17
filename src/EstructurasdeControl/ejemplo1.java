package EstructurasdeControl;

public class ejemplo1 {

    public int edadPerosona = 17;
//Ejercicio 1: Escribe un programa que determine si una persona es mayor
// o menor de edad con base en su edad.

    public static void main(String[] args) {

        ejemplo1 ejemplo1 = new ejemplo1();

        if (ejemplo1.edadPerosona >= 18 ){
            System.out.println("la persona es mayor de edad");
        }else {
            System.out.println("la persona es menor de edad");
        }


    }
}
