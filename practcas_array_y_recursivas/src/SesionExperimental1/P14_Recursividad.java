package SesionExperimental1;

import java.util.Scanner;

public class P14_Recursividad {

	public static void main(String[] args) {

		/*
		 * Crea un metodo que, dado un numero lo imprima invertido por pantalla. Por
		 * ejemplo: 1234 -> 4321. Pista: hy que dividir entre 10 y calcular restos al
		 * dividir entre 10. Se hace con recursividad
		 */
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduzca un numero por pantalla: ");
		int num = scn.nextInt();
		
		invertido (num);
	}
	
	static void invertido (int num) {
		int res;
		if(num<10) {
			System.out.print(num);
		}else {
			System.out.print(num%10);
			invertido(num/10);
		}
	}
}
