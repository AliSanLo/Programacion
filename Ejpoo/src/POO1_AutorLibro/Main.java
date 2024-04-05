package POO1_AutorLibro;

public class Main {
    public static void main(String[] args) {
        Autor a = new Autor("Laura Gallego", "laura@gallego.com", true);
        Libro l = new Libro("Donde los arboles cantan ", a,15);

        l.mostrarDetalles();
    }
}
