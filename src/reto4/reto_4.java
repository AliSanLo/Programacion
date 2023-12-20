package reto4;

import java.util.Scanner;

public class reto_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Reto4. Realiza un conversor de bases. Para ello se deberán seguir la siguiente secuencia de acciones: 
		 * a. El sistema pedirá por consola un valor numérico el cual será el número en base10 (decimal) del que se quiere
		 * calcular su base2 (binario). 
		 * b. El sistema realizará los cálculos necesarios para realizar el cambio (divisiones sucesivas entre 2). Puedes basarte en
		 * este ejemplo http://recursostic.educacion.es/secundaria/edad/4esotecnologia/quincena5/4q2_contenidos_2c.htm
		 * c. Por último, se mostrará por consola el numero traducido en base 2
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un número :");
		int num = scanner.nextInt();
		int n = num;

		while (n > 1) {
			int resto = n % 2;
			n = n / 2;
			System.out.print(resto);
			
		}
		System.out.println(n);

	}

}
