package Libro_getterYsetter.copy;

public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private int paginas;

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

    // Getters y setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}
