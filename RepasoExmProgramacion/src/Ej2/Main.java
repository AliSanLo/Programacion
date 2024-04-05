package Ej2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        if (num1%2==0 && num2%2==0){
            System.out.println("Ambos son pares");
        }else{
            System.out.println("Uno de los dos no es par");
        }
        if(num1 > (num2*2)&& num1 <8){
            System.out.println("El primer numero es mas grande que el doble del segundo y menos que 8");

        }else {
            System.out.println("El primer numero NO es mas grande que e doble del segundo y menos que 8");
        }
    }
}
