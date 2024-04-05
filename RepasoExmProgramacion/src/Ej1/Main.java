package Ej1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Introducimos numeros
        Scanner scn = new Scanner(System.in);
        System.out.println("INTRODUCE 3 NUMEROS:");
        int num1 = scn.nextInt();
        System.out.println("INTRODUCE 3 NUMEROS:");
        int num2 = scn.nextInt();
        System.out.println("INTRODUCE 3 NUMEROS:");
        int num3 = scn.nextInt();

        //num1 y num2 = num3
        if (num1 + num2 == num3) {
            System.out.println("La suma de " + num1 + " y " + num2 + "es igual a " + num3);

        } else {
            System.out.println("La suma de los dos primeros numeros no es igal al tercero");
        }
    }


}