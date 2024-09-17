package ClasesMétodosAtributoseInstancias;

public class libro {
    public String Titulo = "las pequñas aventuras de mini mbappe";

    public String Autor = "Miguel R";

    public int numPaginas = 300;



    void mostrardetalles(){

        {

            {
                System.out.println("el libro " + Titulo + " de el autor " + Autor + " tiene " + numPaginas + " paginas");
            }
        }
    }


    void esLargo(){

        if (numPaginas >= 300){
            System.out.println("el libro es largo");
        }else{
            System.out.println("el libro es corto");
        }


    }


    public static void main(String[] args) {




//Ejercicio 1: Crea una clase llamada Libro con los atributos titulo, autor, y numPaginas.

      libro libro = new libro();
      libro.numPaginas = 200;
      libro.Titulo = "las aventuras de mini miguel";
      libro.Autor = "mbappe";

      libro libro1 = new libro();
      libro1.Autor = "kiki";
      libro1.Titulo = "Programacion";
      libro1.numPaginas = 400;

        libro1.mostrardetalles();
        libro1.esLargo();

        libro.mostrardetalles();

        libro.esLargo();

    }
}