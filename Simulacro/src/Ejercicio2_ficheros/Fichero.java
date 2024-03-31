package Ejercicio2_ficheros;

import java.io.*;
import java.util.Scanner;

public class Fichero {
    /*Realiza un programa en JAVA en el que muestres un menú que te permita 3 opciones:
     1. Creación de un fichero binario
     (con el nombre que tú quieras) en el que indiques en cada línea:
• Tu Nombre.
• Tu Edad.
• Tu Ciudad de Nacimiento.
 2. Mostrar por pantalla el contenido del fichero binario creado.
 3. Salir del Programa.*/

    public static void mostrarMenu() throws IOException {
        Scanner scn = new Scanner(System.in);
        String menu;
        System.out.println("**********MENU************");
        System.out.println("1.- Creación de un fichero binario");
        System.out.println("2.- Mostrar por pantalla el contenido del fichero binario creado");
        System.out.println("3.- Salir del Programa");
        int opciones = 3;
        File f;

        switch (opciones) {
            case 1:
                f = new File("C:\\Users\\alici\\IdeaProjects\\Simulacro\\src\\prueba");
                System.out.println("Tu nombre: ");
                String nombre = scn.nextLine();
                FileInputStream fis = new FileInputStream(f);
                FileWriter fw = new FileWriter(f);
                fw.write(nombre);
                System.out.println("Tu edad: ");
                int edad = scn.nextInt();
                fw.write(edad);
                System.out.println("Tu ciudad de nacimiento: ");
                String ciudad = scn.nextLine();
                fw.write(ciudad);
                fw.close();
                fis.close();
                break;
            case 2:
                f = new File("C:\\Users\\alici\\IdeaProjects\\Simulacro\\src\\prueba");
                FileOutputStream fos = new FileOutputStream(f);
                FileReader fr = new FileReader(f);
                fr.read();
                fr.close();
                fos.close();
                break;
            case 3:
                System.out.println("FIN DEL PROGRAMA");
                break;
            default:
        }

    }
}
