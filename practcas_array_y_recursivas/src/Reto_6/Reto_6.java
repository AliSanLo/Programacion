

package Reto_6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Reto_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Reto 6. Realiza una aplicación de adivinación. Para ello se deberán seguir la
		 * siguiente secuencia de acciones: a. El sistema generará un número aleatorio
		 * (entre 0 y 20) b. Seguidamente el sistema irá pidiendo números al usuario de
		 * forma recurrente hasta que coincida con el aleatorio generado c. En cada
		 * número introducido, en caso de no coincidir mostrará el mensaje
		 * "Lo siento, inténtalo de nuevo". Cuando coincida el número introducido con el
		 * que introduce el usuario deberá mostrar el mensaje "Enhorabuena, has acertado
		 * el número en 5 intentos". d. Cuando se adivine el número se deberá escribir
		 * en un fichero llamado juego.txt el nombre del usuario y el número de intentos
		 * realizados con el siguiente formato: nombre, intentos (Borja,6)
		 */
		Scanner sc = new Scanner(System.in);

		int numRand = (int) Math.floor(Math.random() * 5+ 1); // genera un numero del 0 al 20 sin decimales

		System.out.println("Adivina el numerito: ");
		int num = sc.nextInt();
		int num2 = 0;
		int intentos = 0;
		DataOutputStream entradaDatos = null; 
		int i= 0;
		for ( i = 1; i < 5; i++) {

			if (num == numRand || num2 == numRand) {
				System.out.println("Enhorabuena, has acertado el número en " + i + " intentos");
				break;
			} else {
				System.out.println("Lo siento, inténtalo de nuevo");
				num2 = sc.nextInt();
				intentos++;
			}

		}
		System.out.println("Introduce tu nombre");
		String nombre = sc.next();
		try {
			// entrada de datos en el fichero
			File f = new File("C:/Users/Alicia/eclipse-workspace/programacion/src/user.txt");
			FileOutputStream entrada = new FileOutputStream(f);
			 entradaDatos = new DataOutputStream(entrada);
			entradaDatos.writeUTF(nombre);
			entradaDatos.writeInt(i);
			// salida de datos del fichero
			DataInputStream salidaDatos = new DataInputStream(new FileInputStream("C:/Users/Alicia/eclipse-workspace/programacion/src/user.txt"));
			System.out.println("Nombre: " + salidaDatos.readUTF());
			 System.out.println("Intentos: " + salidaDatos.readInt());

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (entradaDatos != null) {
					entradaDatos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}


	}

