package SesionExperimental1;

public class P2_Array {

	public static void main(String[] args) {
		/*
		 * Escribir un programa que almacene en n array los numeros del 1 al 1o y los
		 * muestre por pantalla en orden inverso separads por comas
		 */

		int numero = 0;
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = num.length - 1; i >= 0; i--) { // si ponemos num.length da error
			System.out.print(num[i] + " , ");
		}
	}

}
