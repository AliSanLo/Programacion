package reto3;

import java.util.Scanner;

public class reto_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Reto3: Realiza una calculadora de sueldo. para ello se deberán seguir la
		 * siguiente secuencia de acciones: a. El programa pedirá por consola al usuario
		 * que introduzca dos valores numéricos: el sueldo de un trabajador y su número
		 * de pagas.
		 * 
		 * b. El programa calculará el sueldo bruto, sueldo bruto mensual, sueldo neto,
		 * sueldo neto anual, teniendo en cuenta que se aplica una retención del 0.15
		 * 
		 * c. Finalmente se mostrarán por consola todos los resultados obtenidos
		 */

		Scanner scanner = new Scanner(System.in);

		double sueldo_bruto_mensual = 0;
		double sueldo_neto = 0;
		double sueldo_neto_anual = 0;

	// Introduccion del sueldo bruto
		System.out.println("Introduce el sueldo");
		double sueldo_bruto = scanner.nextInt();
		
		//numero de pagas
		System.out.println("Introduce el numero de pagas");
		double num_pagas = scanner.nextInt();
		
		// calculo sueldo bruto mensual
		sueldo_bruto_mensual = sueldo_bruto * 30;
		
		//calculo del sueldo neto
		double retencion = (sueldo_bruto * 15) / 100;
		sueldo_neto = sueldo_bruto - retencion;
		
		//calculo sueldo neto anual
		double sueldo_neto_mensual = sueldo_neto * 30;
		sueldo_neto_anual = (sueldo_neto_mensual *12) + (num_pagas * sueldo_neto_mensual);
		
		

		// RETENCION DEL 15 %

		System.out.println("Tu sueldo bruto es de " + sueldo_bruto);
		System.out.println("Tu sueldo mensual es de " + sueldo_bruto_mensual);
		System.out.println("Tu sueldo neto es de " + sueldo_neto);	
		System.out.println("Tu sueldo neto mensual es de " + sueldo_neto_mensual);	
		System.out.println("Tu sueldo neto anual es de " + sueldo_neto_anual);	

		

	}

}
