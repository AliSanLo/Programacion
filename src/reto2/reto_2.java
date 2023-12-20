package reto2;

import java.util.Scanner;

public class reto_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Reto2: Realiza una calculadora de IVA. para ello se deberán seguir la siguiente
		secuencia de acciones:
		a. Se pedirá al usuario que introduzca por consola un valor numérico (el
		precio de adquisición de un artículo (sin IVA)) y también se le pedirá que
		introduzca otro valor numérico (el IVA que se le ha aplicado).
		b. El sistema calculará el precio del producto tanto sin IVA como con él
		c. Finalmente se mostrarán ambos precios formateados*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el precio del procucto: ");
		double precio_art =  scanner.nextInt();
		
		System.out.println("Introduce el portencaje del IVA: ");
		double iva =  scanner.nextInt();
		
		double porcentaje = 0;

		porcentaje = (iva * precio_art) / 100;
		double precio_final = precio_art - porcentaje ;
		
		System.out.println("El precio final del articulo con el IVA aplicado es de " + precio_final + " euros");
		System.out.println("El precio final del articulo sin el IVA aplicado es de " + precio_art + " euros");
				
	}

}
