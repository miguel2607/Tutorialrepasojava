package usodeFinal;

public class ejemplo1 {

    final double Pi = 3.1416;


    public static void main(String[] args) {
ejemplo1 ejemplo1 = new ejemplo1();

ejemplo1.Pi = 2.1; // no se puede cambiar el valor por que es final

        System.out.println(ejemplo1.Pi);


    }

}
