package Ej3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("INTRODUCE 1 numero:");
        double euros = scn.nextDouble();

        int op;
        do {
            op = 0;

            System.out.println("A QUE MONEDA QUIERES CONVERTIR LA CANTIDAD INGRESADA:" +
                    "\n 1.-Dolar" +
                    "\n 2.- Libras" +
                    "\n 3.- Yenes");
            op = scn.nextInt();

            switch(op) {

                case 1:
                    double dolares = 1.18;
                    double cambio = euros * dolares;
                    System.out.println(cambio);
                    break;
                case 2:
                    double libras = 1.16;
                    cambio = euros * libras;
                    System.out.println(cambio);

                    break;
                case 3:
                    double yenes = 0.0076;
                    cambio = euros * yenes;
                    System.out.println(cambio);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (op != 4);
    }


}