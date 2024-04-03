package Poo2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class CD {
    int contador = 0;
    Cancion[] array = new Cancion[10];
    Scanner scn = new Scanner(System.in);

    public CD() {
    }

    public CD(String titulo, String artista, int contador, Cancion[] array) {
        this.contador = contador;
        this.array = array;
    }

    public int numeroCanciones() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                contador++;
            }
        }
        return contador;
    }

    public Cancion dameCancion() { // por qué de tipo cancion?
        System.out.println("Intrpduce el numero de la cancion que quieres escuchar: ");
        int aux = scn.nextInt();
        return array[aux];
    }

    public void grabaCancion(int posicion, Cancion cancion) {
                        array[posicion] = cancion;
            System.out.println("Se ha agregado " + array[posicion]);

            }



    public void agregar(Cancion cancion) {
        System.out.println("SE GUARDARA UNA CANCION EN LA PRIMERA POSICION DISPONIBLE");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = cancion;
                System.out.println("Se ha agregado la canción: " + cancion);
                break;
            }
        }
    }

    public void eliminar(int posicion) {

        array[posicion] = null;
        System.out.println("ELIMINADO");

    }

    public void verLista() {
        for (Cancion cancion : array) {
            System.out.println(cancion);
        }
    }


}
