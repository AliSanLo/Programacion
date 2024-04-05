package Ej12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int op = 0;

        do {
            System.out.println("INTRODUCE LA OPCION DESEADA:" +
                    "\n 1.- Añadir temperatura" +
                    "\n 2.- Mostar temperatura media" +
                    "\n Mostrar temperaturas extrema" +
                    "\n 4.-Salir");
             op = scn.nextInt();


            switch (op) {
                case 1:
                    menu.aniadir();

                    break;
                case 2:
                    int tamaño = menu.temperatura.size();
                    int media = menu.mostrarMedia();
                    System.out.println("La temperatura media de las " + tamaño + "temperaturas registradas es : " + media);
                    break;

                case 3:
                String resultado =   menu.extremas();
                    System.out.println(resultado);
                    break;

                case 4:
                    break;
            }
        } while (op != 4);
    }
}
