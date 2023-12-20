package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fich2 {

	public static void main(String[] args) {
		// 1º creo wl objeto file
		File f = new File("C:\\Users\\alici\\eclipse-workspace\\Programacion\\src\\ficheros\\texto");

		// 2º compruebo si el fichero e de una linea o mas
		// si es de unalineausamos file Reader, si no, BufferReader
		// comprobar si exite el fichero
		if (f.exists()) {
			FileReader fileReader = null;
			try {
				fileReader = new FileReader(f);
				//1ERA FORMA DE HACERLO
				/*
				int lectura = fileReader.read();
				System.out.println((char)lectura);
				lectura = fileReader.read();
				System.out.println((char)lectura);
*/
				//se puede hacer asi perpo lo suyo es usar algun tipo de condicion
				//2ª FORMA DE HACERLO
				/*for(int i = 0 ; i < f.length() ; i++) {
					System.out.println((char)fileReader.read());
				} */
				
				//3ª FORMA DE HACERLO
				/*int lectura = 0;
				do {
					lectura = fileReader.read();
					System.out.print((char)lectura);
					}while(lectura != -1); */
				
				//4ª FORMA DE HACERLO
				int lectura =0;
				while ((lectura = fileReader.read()) != -1) {
					System.out.print((char)lectura);
				}
				
			} catch (FileNotFoundException e) {
				System.out.println("No se ha encontrado el fichero");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("No se encuentra el fichero");

		}

	}

}
