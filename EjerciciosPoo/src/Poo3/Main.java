package Poo3;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Libro l1 = new Libro();
        GestorBiblioteca gb = new GestorBiblioteca();

        int op = 0;
        Scanner scn = new Scanner(System.in);
        do {
            System.out.println(" **********MENU***********" +
                    "\n 1.- Agregar Libro" +
                    "\n 2.- Buscar Libro" +
                    "\n 3.- Eliminar Libro" +
                    "\n 4.- Listar Libros" +
                    "\n 5.- Salir");
            op = scn.nextInt()
            ;
            switch (op) {//GUARDAMOS EL TITULO, AUTOR Y AÑO DE PUBLICACION
                case 1:
                    System.out.println("Dime el titulo: ");
                    scn.nextLine();
                    String titulo = scn.nextLine();


                    System.out.println("Dime el autor: ");
                    String autor = scn.nextLine();

                    System.out.println("Dime el año de publicacion: ");
                    int anio = scn.nextInt();
                    scn.nextLine();


                    l1.setTitulo(titulo);
                    l1.setAutor(autor);
                    l1.setAnio(anio);

                    gb.agregarLibro(titulo, autor, anio);
                    break;
                case 2:
                    gb.buscarLibro();
                    break;
                case 3:
                    gb.eliminarLibro();
                    break;
                case 4:
                    gb.listarLibros();
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        } while (op != 5); // echar un ojo
    }
}


