package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner (System.in);

try {

		System.out.println("Introduzca un numero: ");
		int num = scn.nextInt();
		}catch (InputMismatchException ex){
			System.out.println("Error" + ex);
			
		}finally {
			System.out.println("Adios");
		}
	}

}
