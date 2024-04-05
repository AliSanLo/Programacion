package Ej5;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("INTRODUCE 1 numero:");
        int num1 = scn.nextInt();

        int[] random = new int[num1];
        int mayor = 0;
        int menor = 0;
        int suma = 0;
        int aux = 0;


        for (int i = 0; i < random.length; i++) {
            random[i]  = (int) Math.round(Math.random() * 100 + 1);
            System.out.println(random[i]);
            if (random[i] > mayor) {
                mayor = random[i];
            }else{
                menor = random[i];
            }


            suma += random[i];

        }
        int media = suma / num1;
        System.out.println("El numero mayor es:" + mayor);
        System.out.println("El numero menor es:" + menor);
        System.out.println("La media es:" + media);

    }
}
