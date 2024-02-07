package Libro;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String titulo, autor;
		int ejemplares;
		Libro libro1 = new Libro("32456", "algo", " autormierdi", 435, false, 3, 6);
		Libro libro2 = new Libro();

		System.out.println("Introduce el titulo: ");
		titulo = scn.nextLine();
		System.out.println("Introduce el autor: ");
		autor = scn.nextLine();
		System.out.println("Numero de ejemplares: ");
		ejemplares = scn.nextInt();

		libro2.setAutor(autor);
		libro2.setTitulo(titulo);
		libro2.setEjemplares(ejemplares);

		System.out.println("Libro1:");
		System.out.println(libro1.getTitulo());
		System.out.println(libro1.getAutor());
		System.out.println(libro1.getIsbn());
		
		if (libro1.prestamo()) {
			System.out.println("Se ha prestado el libro " + libro1.getTitulo());
		}else {
			System.out.println("No se ha podido prestar");


		}
	}

}
