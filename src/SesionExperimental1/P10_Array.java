package practica;

import java.util.Scanner;

public class P10_Array {

	public static void main(String[] args) {

		/*
		 * Realiza una aplicacin con diseño modular, mediante la cual se permita
		 * realizaslas siguientes operaciones: 1. calcular potenci 2. calcular raiz
		 * cuadrada 3. calcular factorial
		 * 
		 * cada una e las opciones ejecutara un metodo por el cual debera devolver el
		 * dato correspondiente los datos seran pedidos por consola y pasados a los
		 * metodos, utilizando tantos comos ean necesarios tanto el punto 1 como el 2 se
		 * debe utilizar metodos de la libreria math haz un punto cuatro que sea para
		 * salir del bucle, ya que el menu se va a ir repitiendo unay otra vez
		 */

		Scanner scn = new Scanner(System.in);

		int opcion;
		int base;
		int exponencial;
		int raiz;
		int resultado; 
		int factorial;

		System.out.println("Ingrese na de la siguientes opciones: ");
		System.out.println("Opcion 2: Potencia ");
		System.out.println("Opcion 2: raiz cuadrada ");
		System.out.println("Opcion 3: Factorial Recursividad");
		opcion = scn.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("Introduzca el numero base: ");
			base = scn.nextInt();
			System.out.println("Inotroduzca el numero exponencial");
			exponencial = scn.nextInt();
			potencia(base, exponencial);
			
			break;
		case 2:
			System.out.println("Introduzca el numero para realizar la raiz cuadrada: ");
			raiz = scn.nextInt();
			raiz(raiz);
			break;

		case 3: 
			System.out.println("Introduce l numero para calcular la factorial: ");
			factorial = scn.nextInt();
			factorial(factorial);
			break;
		}
	}

	static void potencia(int base, int exponencial) {
		int resultado = (int) Math.pow(base, exponencial);
		System.out.println("El exponencial es : " + resultado);

	}

	static void raiz(int n) {
		int resultado;
		resultado = (int) Math.sqrt(n);
		System.out.println("La raiz cuadrada es : " + resultado);
	}

	static int factorial(int n) {
		int resultado;
		// CASO BASE
		if (n == 1) {
			resultado = 1;
		} else {

			// CASO RECURSIVO
			resultado = n * factorial(n - 1);

		}
		return resultado;

	}
}
