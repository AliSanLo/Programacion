package practica;

import java.util.Scanner;

public class P7_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * En una clase de 5 alumnos se han realizado tres examenes y se requiere
		 * determinar el numero de: a) Alumons que aprobaron al menos un examen b)
		 * Alumnos que aprobaron todos los examenes c) Alumnos que aprobaron unicamente
		 * el ultimo examen
		 * 
		 * Realice un pgrograma que ermita la lectura de los datos y el calculo de la
		 * estadisticas
		 */
		Scanner scn = new Scanner(System.in);

		int exm1 = 0;
		int exm2 = 0;
		int exm3 = 0;
		int contA = 0;
		int contB = 0;
		int contC = 0;

		int alumno = 1;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Alumno" + alumno++);
			System.out.println("INGRESE LA NOTA DEL PRIMER EXAMEN: ");
			exm1 = scn.nextInt();

			System.out.println("INGRESE LA NOTA DEL SEGUNDO EXAMEN: ");
			exm2 = scn.nextInt();

			System.out.println("INGRESE LA NOTA DEL TERCER EXAMEN: ");
			exm3 = scn.nextInt();

			if ((exm1 >= 5) && (exm2 >= 5) && (exm3 >= 5)) {
				contA++;
			}
			if ((exm1 >= 5) || (exm2 >= 5) || (exm3 >= 5)) {
				contB++;
			}
			if ((exm1 < 5) && (exm2 < 5) && (exm3 >= 5)) {
				contC++;
			}
		}
		System.out.println("ESTADISTICAS:  \n Alumnos que han aprobado todos los examenes: " + contA
				+ "\n Alumnos que han aprobado al menos un examen:  " + contB + "\n Alumnos que han"
				+ " aprobado solo el ultimo examen: " + contC);
	}

}
