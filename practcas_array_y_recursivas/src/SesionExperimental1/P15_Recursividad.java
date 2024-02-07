package SesionExperimental1;

public class P15_Recursividad {

	public static void main(String[] args) {
		/*
		 * Haz un programa usando metodos, simulando un dado qeu se va a tirar 5 veces y
		 * mostrar que numeros han salido, cantidad de pares y cantidad de impares ()se
		 * hace con math rantom()
		 */
		int[] tiros = new int[6];
		int num = 0;
		for (int i = 0; i < 6; i++) {

			num = (int) (Math.random() * 6) + 1;
			tiros [i] = num;
			System.out.println(tiros[i]);

		}
		String resultado = dado(tiros); // Llamamos a la función para contar pares e impares
		System.out.println(resultado);

	}

	static String dado(int[] tiros) {
		int par = 0;
		int impar = 0;

		for (int i = 0; i < 6; i++) {

			if (tiros[i] % 2 == 0) {
				par++;
			}
			if (tiros[i] % 2 != 0) {
				impar++;
			}

		}
		return "Hay " + par + " numeros pares y " + impar + " numeros impares";

	}
}
