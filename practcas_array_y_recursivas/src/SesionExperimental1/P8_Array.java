package practica;

import java.util.Scanner;

public class P8_Array {

	public static void main(String[] args) {
		/*
		 * Crea un array de ua longitud de 5 valores Pide los valoes al usuario Despues
		 * pide un sexto valor y comprueba si ese sexto valor equivale a la suma del
		 * resto de elementos del array
		 * 
		 */
		Scanner scn = new Scanner(System.in);

		int[] num = new int[5];
		System.out.println("Introduce 5 numeros");
//bucle para introducir los 5 numeros del array
		for (int i = 0; i < num.length; i++) {
			num[i] = scn.nextInt();
		}

//para introducir el sexto numero
		System.out.println("Introduce un sexto numero en el array: ");
		int sexto = scn.nextInt();

		int[] num2 = new int[6];
		for (int j = 0; j < num.length; j++) {

			num2[j] = num[j];

			

		}
		for (int j = num.length; j < num2.length; j++) {
			if (num2[5] == 0) {
				num2[5] = sexto;
			} else {
				num2[j] = 0;
			}
			// introduzco el numero de la sexta posicion
		}
		//bucle para imprimir por pantalla el bucle definitivo
		for (int j = 0; j < num2.length; j++) {
		System.out.print(num2[j]);
		}

//bucle para sumar todos los numeros del array
		int suma = 0;
		for (int i = 0; i < num.length; i++) {
			suma += num[i];
		}
		System.out.println("Los 5 primeros numeros suman: " + suma);
		if (suma == num2[5]) {
			System.out.println("Los 5 primeros numeros SI suman el mismo valor que " + num2[5]);

		} else {
			System.out.println("Los 5 primeros numeros NO suman el mismo valor que " + num2[5]);

		}
	}

}
