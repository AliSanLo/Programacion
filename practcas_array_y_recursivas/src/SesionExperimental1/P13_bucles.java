package SesionExperimental1;

import java.util.Random;
import java.util.Scanner;

public class P13_bucles {

	public static void main(String[] args) {
		/*
		 * Realice un programa que slicite al usuario que piense un numero enter entre
		 * el 1 y el 100. El programa debe tener guardado en una variable el numero que
		 * tiene que adivinar el usuario, e indicarle al suario si le numero que digito
		 * es menos o mayor, asi hasta qe lo adivine. Y por ultimo mostrarle el numeor
		 * de intentos que le llvo (USA METODOSS)
		 */
		Scanner scn = new Scanner(System.in);
		Random rand = new Random();
		int num = 0;
		int contador = 0;
		System.out.println("Piensa un numero entre el 1 y el 100");
		// Generar un número aleatorio entre 0 y 100
		int numAl = rand.nextInt(101);
		do {
			num = scn.nextInt();
			System.out.println(pista(num, numAl));
			System.out.println(contador++);
			
		} while (num != numAl);
	}

	static String pista(int num, int numAl) {
		if (num > numAl) {
			return "El numero a adivinar es menor";
		}
		if (num < numAl) {
			return "El numero a adivinar es mayor";
		}
		return "ADIVINASTE EL NUMERO";

	
	}

}
