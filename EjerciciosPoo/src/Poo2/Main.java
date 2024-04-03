package Poo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CD cd = new CD();
        int op;
        Scanner scn = new Scanner(System.in);

        do {
            System.out.println("**********MENU**********");
            System.out.println("QUÉ QUIERES HACER? " +
                    "\n 1.- Numero de canciones que tengo" +
                    "\n 2.- Que cancion quieres escuchar" +
                    "\n 3.- Grabar cancion en puesto especifico" +
                    "\n 4.- Grabar cancion en el primer puesto libre" +
                    "\n 5.- Eliminar" +
                    "\n 6.- Ver lista de canciones" +
                    "\n 7.- Ver lista de canciones" +
                    "\n 8.- Salir");
            op = scn.nextInt();
            scn.nextLine();
            switch (op) {
                case 1:
                    cd.numeroCanciones();
                    break;
                case 2:
                    cd.dameCancion();
                    break;
                case 3:

                    //POSICION
                    System.out.println("VAMOS A GUARDAR UNA CANCION. \n Primero di en que posicion la quieres guardar:");
                    int posicion = scn.nextInt();
                    scn.nextLine(); // Limpiar el buffer

                    //CANCION
                    System.out.println("Introduce el titulo de la cancion: ");
                    String song = scn.nextLine();
                    if (song.contains(" ")) {
                        System.out.println("Error: La entrada no debe contener espacios.");
                        System.out.println("Introduce de nuevo la cancion:");
                         song = scn.nextLine();
                    }

                    //AUTOR
                    System.out.println("Introduce el autor del autor: ");
                    String author = scn.nextLine();
                    if (author.contains(" ")) {
                        System.out.println("Error: La entrada no debe contener espacios.");
                        System.out.println("Introduce de nuevo el artista:");
                        author = scn.nextLine();
                        ;
                    }

                    //SE GUARDA EN LA CANCION
                    Cancion cancionGrabar = new Cancion(song, author);

                    //SE ENVIA A GUARDAR
                    cd.grabaCancion(posicion, cancionGrabar);
                    break;
                case 4:
                    //NOMBRE DE LA CANCION
                    System.out.println("Introduce el titulo de la cancion: ");
                    song = scn.nextLine();
                    if (song.contains(" ")) {
                        System.out.println("Error: La entrada no debe contener espacios.");
                        System.out.println("Introduce de nuevo la cancion:");
                         song = scn.nextLine();

                    }

                    //NOMBRE DEL AUTOR
                    System.out.println("Introduce el autor de la cancion: ");
                    author = scn.nextLine();
                    if (author.contains(" ")) {
                        System.out.println("Error: La entrada no debe contener espacios.");
                        System.out.println("Introduce de nuevo el artista:");
                        author = scn.nextLine();

                    }

                    Cancion cancion = new Cancion(song, author);
                    cd.agregar(cancion);
                    break;
                case 5:
                    System.out.println("Di la posicion de la cancion que quieres eliminar: ");
                    posicion = scn.nextInt();
                    cd.eliminar(posicion);
                    break;
                case 6:
                    cd.verLista();
                    break;
                default:
                    break;
            }
        } while (op != 8);
    }
}
