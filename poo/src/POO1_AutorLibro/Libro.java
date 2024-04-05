package POO1_AutorLibro;

public class Libro {
    public String titulo;
    public Autor autor;
    public int precio;

    public Libro(String titulo, Autor autor, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.println(getAutor()+" Titulo : "+getTitulo()+ "Precio : "+getPrecio());
    }
}
