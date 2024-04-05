package Ej6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Cantidad Pedida");
        int cantidadPedida = scn.nextInt();

        System.out.println("Años a devolver");
        int anosDevolver = scn.nextInt();

        System.out.println("Interes");
        int interes = scn.nextInt();

        Hipoteca h = new Hipoteca();
        boolean resultHipoteca = h.hipoteca(cantidadPedida, anosDevolver, interes);

        if (resultHipoteca == true) {
            int meses = anosDevolver * 12;
            int cuota = cantidadPedida / meses;
            System.out.println("MES           CUOTA");
            for (int i = 0; i < meses; i++) {
                System.out.println(i + "           " + cuota);
            }


        }
    }
}
