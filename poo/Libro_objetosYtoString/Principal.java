package Libro_objetosYtoString;

public class Principal {

	public static void main(String[] args) {
        Libro libro1 = new Libro("12755", "El quijote", "Cervantes", 500);
        Libro libro2 = new Libro("98743", "El Señor de los anillos", "Tolkien", 754);
System.out.println(libro1);
System.out.println(libro2);

if (libro1.paginas >libro2.paginas) {
	System.out.println("El libro " + libro1.titulo + " es el qeu tiene mas paginas");
}
else  {
	System.out.println("El libro " + libro2.titulo + " es el qeu tiene mas paginas");

}

	}
}
