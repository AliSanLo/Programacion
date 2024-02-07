package Libro_objetosYtoString;

public class Libro {

    public String isbn;
    public String titulo;
    public String autor;
    public int paginas;

    // Constructor con parámetros
    public Libro(String isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "El libro " + this.titulo + " con ISBN " + this.isbn + " creado por el autor " + this.autor + " tiene "
                + this.paginas + " páginas.";
    }

}
