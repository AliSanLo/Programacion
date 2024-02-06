package SesionExperimental1;

import java.util.Scanner;

public class P1_Array {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que almacene las asignaturas de un curso en un array y ue
		 * lo muestr por pantalla
		 */
		/* Atribuye una nota a cada asignatura */

		String[] asignaturas = { "Matematicas", "Fisica y Quimica", "Historia", "Lengua" };
		int[] nota = new int[asignaturas.length];
		for (int i = 0; i < asignaturas.length; i++) {

			Scanner scn = new Scanner(System.in);

			System.out.println("Inserta la nota de la asignatura de " + asignaturas[i]);
			nota[i] = scn.nextInt();
			System.out.println("La nota de " + asignaturas[i] + " es " + nota[i]);

		}
	}
}
