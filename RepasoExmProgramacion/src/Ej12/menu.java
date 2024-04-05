package Ej12;

import java.util.ArrayList;
import java.util.Scanner;

public class menu {
    static Scanner scn = new Scanner(System.in);
    static int capacidad = 10;
    public static ArrayList<Integer> temperatura = new ArrayList<Integer>(capacidad);

    public static void aniadir() {
        System.out.println("Introduce un valor:");
        int aux = scn.nextInt();
        temperatura.add(aux);
    }

    public static int mostrarMedia() {
        int aux = 0;

        for (int i = 0; i < temperatura.size(); i++) {
            int elemento = temperatura.get(i);
            aux += elemento;
        }
        int media = aux / temperatura.size();
        return media;
    }

    static int mayor = 0;
    static int menor = 0;
    public static String extremas() {
                for (int i = 0; i < temperatura.size(); i++) {
            int elemento = temperatura.get(i);
            if (mayor < elemento) {
                mayor = elemento;
            } else {
                menor = elemento;
            }

        }
                return"La mayor temperatura registrada es de : " + mayor +"\n Y la menor es de : "+ menor;

    }
}

