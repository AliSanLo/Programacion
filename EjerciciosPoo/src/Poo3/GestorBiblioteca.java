package Poo3;

import java.io.*;
import java.util.*;

import static java.io.DataInputStream.readUTF;

public class GestorBiblioteca {
    StringBuilder sb = new StringBuilder();
    private HashMap<Integer, StringBuilder> hm = new HashMap<>();


    File f;
    FileOutputStream fos;
    DataOutputStream dos;
    FileInputStream fis;
    DataInputStream dis;
    Scanner scn = new Scanner(System.in);





    public void agregarLibro(String titulo, String autor, int anio) throws IOException {
        try {
            // Agrega los datos al HashMap
            StringBuilder sb = new StringBuilder();
            sb.append(titulo).append(",").append(autor).append(",").append(anio);
            hm.put(hm.size() + 1, sb); // Utiliza un ID único como clave

            // Guarda el HashMap en el archivo
            guardarHashMapEnArchivo();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void buscarLibro() throws IOException {
        //PEDIMOS DATOS
        System.out.println("¿Quieres buscarlo por título o por autor? t/a ");
        char op = 't';
        op = scn.next().charAt(0);
        scn.nextLine();

        if (op == 't') {
            System.out.println("Introduce el título: ");
            String titulo = scn.nextLine();

            // Recorremos el HashMap para buscar el libro por título
            boolean encontrado = false;
            for (Map.Entry<Integer, StringBuilder> entry : hm.entrySet()) {
                String[] datosLibro = entry.getValue().toString().split(",");
                if (datosLibro[0].equals(titulo)) {
                    encontrado = true;
                    System.out.println("ID: " + entry.getKey() + ", Detalles del libro: " + entry.getValue());
                }
            }

            if (!encontrado) {
                System.out.println("No se ha encontrado ese título");
            }
        } else if (op == 'a') {
            System.out.println("Introduce el autor que quieres buscar: ");
            String autor = scn.nextLine();

            // Recorremos el HashMap para buscar el libro por autor
            boolean encontrado = false;
            for (Map.Entry<Integer, StringBuilder> entry : hm.entrySet()) {
                String[] datosLibro = entry.getValue().toString().split(",");
                if (datosLibro[1].equals(autor)) {
                    encontrado = true;
                    System.out.println("ID: " + entry.getKey() + ", Detalles del libro: " + entry.getValue());
                }
            }

            if (!encontrado) {
                System.out.println("No se ha encontrado ese autor");
            }
        } else {
            System.out.println("Opción no válida");
        }
    }

    public void eliminarLibro() throws IOException {


        System.out.println("¿Qué libro deseas eliminar? Introduce el ID:");
        int id = scn.nextInt();
        scn.nextLine(); // Consumir el salto de línea pendiente

        if (hm.containsKey(id)) {
            hm.remove(id);
            System.out.println("Libro eliminado con éxito.");
            guardarHashMapEnArchivo(); // Actualizar el archivo con el contenido del HashMap
        } else {
            System.out.println("No se encontró ningún libro con ese ID.");
        }
    }
    public void listarLibros() {

        //  System.out.println(dis.readUTF() + ", " + dis.readUTF() + ", " + dis.readInt());
        for (Map.Entry<Integer, StringBuilder> entry : hm.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

    }


    private void guardarHashMapEnArchivo() throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(new File("Biblioteca.txt")))) {
            while (dis.available() > 0) {
                String libroData = dis.readUTF();
                StringBuilder sb = new StringBuilder(libroData);
                // Determina el ID basado en el tamaño actual del HashMap
                hm.put(hm.size() + 1, sb);
            }
        }
    }
    public GestorBiblioteca() throws IOException {
        guardarHashMapEnArchivo();
    }
}

