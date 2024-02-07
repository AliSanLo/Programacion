package Libro;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private int paginas;
	private boolean prestamo;
	private int prestados;
	private int ejemplares;

	public Libro(String isbn, String titulo, String autor, int paginas, boolean prestamo, int prestados,
			int ejemplares) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.prestamo = prestamo;
		this.prestados = prestados;
		this.ejemplares = ejemplares;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas
				+ ", prestamo=" + prestamo + ", prestados=" + prestados + ", ejemplares=" + ejemplares + "]";
	}

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

	public boolean isPrestamo() {
		return prestamo;
	}

	public void setPrestamo(boolean prestamo) {
		this.prestamo = prestamo;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getPrestados() {
		return prestados;
	}

	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}

	public Libro() {
		// Inicialización de valores por defecto o cualquier lógica adicional
	}

	public boolean prestamo() {
		boolean prestamo = true;
		if (prestados < ejemplares) {
			prestados++;
		} else {
			prestamo = false;
		}
		return prestamo;
	}

	public boolean devolucion() {
		boolean devuelto = true;
		if (prestados == 0) {
			devuelto = false;
		} else {
			prestados--;

		}
		return devuelto;

	}

}
