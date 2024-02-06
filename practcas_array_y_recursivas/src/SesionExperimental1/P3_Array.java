package SesionExperimental1;

public class P3_Array {

	public static void main(String[] args) {
		/*
		 * Escribir un programa que almacene en un array los siguientes precios 50, 75,
		 * 46, 22, 80 65, 8 y muestre por pantalla el menor y el mayor de los precios
		 */
		int[] num = { 50, 75, 46, 22, 80, 65, 8 };
		int mayor = 0;
		for (int i = 0; i < num.length; i++) {
			while (num[i] > mayor) {
				mayor = num[i];
			}

		}
		System.out.println("El numero mayor es " + mayor);

		int nmenor = 0;
		for (int i = 0; i < num.length; i++) {
			int menor = num[i];
			while (num[i] < menor) {
				menor = num[i];
			}
			nmenor = menor;

		}
		System.out.println("El numero menor es " + nmenor);

	}
}
