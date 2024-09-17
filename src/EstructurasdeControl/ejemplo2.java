package EstructurasdeControl;

public class ejemplo2 {

//Ejercicio 2: Escribe un programa que reciba un número del
// 1 al 7 e imprima el día de la semana correspondiente usando switch.


    public int numeroSemana = 4;

    public static void main(String[] args) {
        ejemplo2 ejemplo2 = new ejemplo2();

        switch (ejemplo2.numeroSemana){

            case 1:
                System.out.println("dia lunes");
            break;
            case 2:
                System.out.println("dia martes");
            break;
            case 3:
                System.out.println("dia miercoles");
            break;
            case 4:
                System.out.println("dia jueves");
                break;
            case 5:
                System.out.println("dia viernes");
                break;
            case 6:
                System.out.println("dia sabado");
                break;
            case 7:
                System.out.println("dia domingo");
                break;
            default:
                System.out.println("no existe este dia");
        }

    }


}
