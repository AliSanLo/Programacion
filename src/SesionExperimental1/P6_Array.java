package SesionExperimental1;

import java.util.Scanner;

public class P6_Array {

	public static void main(String[] args) {
		/*
		 * Ingresar 10 numeros enteros y mostrar los numeros pares. Crear dos arrays en
		 * el que uno meteras todos los numeros y otro solo meteras los pares. Al final
		 * muestra el segundo array (pares)
		 */
		Scanner scn = new Scanner(System.in);

		int[] numeros = new int[10];
		int[] pares = new int[10];
		int contP = 0;

		System.out.println("Introduce 10 numeros ");
		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = scn.nextInt();

			if (numeros[i] % 2 == 0) {
				pares[contP] = numeros[i];
				contP++;
			}
		}
		for (int i = 0; i < contP; i++)
			System.out.print(pares[i]);

	}
}
