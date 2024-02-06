package SesionExperimental1;

import java.util.Scanner;

public class P4_Array {

	public static void main(String[] args) {
		/*
		 * Programa Java que guarda en un array 10 numeros entreros que se leen por
		 * teclado. A continuacion se recorre el array y calcula cuántos numeros son
		 * positivos, cuandos negativos y cuantos ceros
		 */

		int[] num = new int[10];
		int positivo = 0 ; 
		int negativo = 0;
		int cero = 0 ; 
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce 10 numeros:");

		for (int i = 0; i < num.length; i++) {
			num[i] = scn.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			if ( num[i] > 0){
				positivo ++;
			}if (num[i] < 0 ) {
				negativo ++;
			}if (num[i] == 0 ) {
				cero++;
			}
			
		}
		
		System.out.println(positivo + " numeros son positivos");
		System.out.println(negativo + " numeros son negativos");
		System.out.println(cero + " numeros son ceros");

	}

}
