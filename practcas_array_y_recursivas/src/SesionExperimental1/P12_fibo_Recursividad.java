package SesionExperimental1;

import java.util.Scanner;

public class P12_fibo_Recursividad {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = 0;
		do {

			System.out.println("De cuatnos numeros constara la secuencia de fibonacci: ");
			n = scn.nextInt();
		} while (n <= 0);
		System.out.println("con recursividad");

		for (int i = 1; i < n; i++) {
			System.out.println(fibo(i) + " ");
		}
	}

	static int fibo(int n) {
		int res;
		if (n < 2) {
			res = n;
		} else {
			res = fibo(n - 1) + fibo(n - 2);
		}
		return res;

	}
}
