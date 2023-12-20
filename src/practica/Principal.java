package practica;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crea un prograsma en el que introduciremos un numero por pantalla y
		 * devovleremos el dia de la semana que corresponde. Por ejemplo: 2 -> martes
		 */
		int dia;
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		dia = scn.nextInt();

		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
			default:
				System.out.println("nO EXISTE ESE DIA DE LA SEMANA, BOBO");
		}

	}

}
