package Ejercicio2_ficheros;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        String menu;
        int op;
        do {
            System.out.println("**********MENU************");
            System.out.println("1.- Creación de un fichero binario");
            System.out.println("2.- Mostrar por pantalla el contenido del fichero binario creado");
            System.out.println("3.- Salir del Programa");

            op = scn.nextInt();
            scn.nextLine();
            File f;

            switch (op) {

                case 1:
                    //Abrimos el fichero
                    f = new File("C:\\Users\\alici\\IdeaProjects\\Simulacro\\src\\prueba");

                    //Pedimos los datos
                    System.out.println("Tu nombre: ");
                    String nombre = scn.nextLine();

                    System.out.println("Tu edad: ");
                    int edad = scn.nextInt();
                    scn.nextLine();

                    System.out.println("Tu ciudad de nacimiento: ");
                    String ciudad = scn.nextLine();

                    //Abrimos el flujo de entrada para escribir en el archivo los datos
                    FileOutputStream fos = new FileOutputStream(f);
                    //para poder trabajar con datos
                    DataOutputStream dos = new DataOutputStream(fos);
                    dos.writeUTF(nombre);
                    dos.writeInt(edad);
                    dos.writeUTF(ciudad);

                    //ceerramos el flujo de entrada para uqe no espere recibir mas datos
                    fos.close();
                    break;
                case 2:
                    f = new File("C:\\Users\\alici\\IdeaProjects\\Simulacro\\src\\prueba");
                    FileInputStream fis = new FileInputStream(f);
                    DataInputStream dis = new DataInputStream(fis);

                    System.out.println(dis.readUTF());
                    System.out.println(dis.readInt());
                    System.out.println(dis.readUTF());


                    //cerramos fglujo de salida
                    dis.close();
                    fis.close();
                    break;
                case 3:
                    System.out.println("FIN DEL PROGRAMA");
                    break;
                default:
            }
        } while (op != 3);
    }
}
