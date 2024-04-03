package Poo3;

public class Libro {
    public String titulo;
    public String autor;
    public int anio;

    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public Libro() {
    }

    @Override
    public  String toString() {
        return "Libro: " +
                "titulo: " + titulo  +
                ", Autor: " + autor +
                ", anio: " + anio ;
    }

    public Libro(String titulo) {
        this.titulo = titulo;
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
