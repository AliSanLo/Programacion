package practica;

import java.util.Scanner;

public class P9_Array {

	public static void main(String[] args) {
		/*
		 * Pide al usuario por teclado una frase y pasa sus caracteres a un array de
		 * caracteres. Pudes hacer con o sin metodos de String
		 */
		Scanner scn = new Scanner(System.in);

		System.out.println("Introduce una frase: ");
		String frase = scn.nextLine(); 
		//nextLine es para cuando hay espacios. Si no hay espacios, se usa el metodo next

		char[] caract = new char[frase.length()];
		for (int i = 0; i < frase.length(); i++) {
			caract[i] = frase.charAt(i); // El método charAt se utiliza para obtener el 
			//carácter en una posición específica dentro de una cadena.
			System.out.print(caract[i]);
		}
	}

}
