package Reto1;

import java.util.Scanner;

public class reto_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Reto1: Realiza un conversor de tiempo, para ello se deberán seguir la
		 * siguiente secuencia de acciones: a. Se le pedirá al usuario introducir una
		 * cantidad numérica (que representará los segundo) b. el programa calculará las
		 * horas minutos y segundo correspondiente a la cantidad introducida c. La
		 * aplicación sacar por consola la cantidad de horas minutos y segundos
		 * calculados
		 */

		Scanner scanner = new Scanner(System.in);
		int segundos = 0;
		int segun_final = 0;
		int num_minutos = 0;
		int min_final = 0;
		int horas = 0;

		System.out.println("Introduce los segundos :");
		int num_segundos = scanner.nextInt();

		if (num_segundos >= 60) {
			num_minutos = num_segundos / 60;
		}
		if ((num_segundos % 60) != 0) {
			segundos = num_minutos * 60;
			segun_final = num_segundos - segundos; // bucle for para que reste todo lo que pueda?*/
		}
		if (num_minutos >= 60) {
			horas = num_minutos / 60;
		}
		if ((num_minutos % 60) != 0) {
			int minutos = horas * 60;
			 min_final = num_minutos - minutos; // bucle for para que reste todo lo que pueda?*/
		}
		System.out.println("Son " + horas + " horas, " + min_final + " minutos, y " + segun_final + " segundos.");

	}
}
