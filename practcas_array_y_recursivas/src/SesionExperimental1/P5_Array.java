package SesionExperimental1;

import java.util.Scanner;

public class P5_Array {

	public static void main(String[] args) {
		/*
		 * Prpgrama Java para leer la altura de N personas y cacular la altura media.
		 * Calcular cuantas personas tienen una latura superior a la media y cuántas
		 * tienen una altura inferior a la media. El valor de N se pide por teclado debe
		 * ser entero positivo
		 */

		int n = 0;
		Scanner scn = new Scanner(System.in);

		System.out.println("¿Con cuantas personas trabajamos? ");
		n = scn.nextInt();

		if (n > 0) {
			int[] num = new int[n];

			System.out.println("Cual es la altura de cada persona? Introduce " + n + "medidas en centimetros");
			for (int i = 0; i < num.length; i++) {
				num[i] = scn.nextInt();

			}
			// bucle para sumar todos los datos
			int nanterior = 0;
			for (int i = 0; i < num.length; i++) {
				nanterior += num[i];

			}
			System.out.println(nanterior);
			// calculamos la media
			int media = nanterior / n;
			System.out.println("La altura media es de  " + media);

			// a ver cual esta por encima y pr debajo
			int mayorMedia = 0;
			int menorMedia = 0;
			for (int i = 0; i < num.length; i++) {
				if (num[i] > media) {
					mayorMedia++;
				} else {
					menorMedia++;
				}

			}
			System.out.println("Hay " + mayorMedia + " personas cuya altura supera la media");
			System.out.println("Hay " + menorMedia + " personas cuya altura es inferior la media");

		}
	}

}
