package practica;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InaccessibleObjectException;

public class fich4 {

	public static void main(String[] args) {
		File f = new File("file.ddr");
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try {
			fos = new FileOutputStream(f, true);
			fis = new FileInputStream(f);
			String texto = "ESTO ES UNA PRUEBA CON FICHEROS BINARIOS";

			byte[] bytes = texto.getBytes();
			fos.write(bytes);
			
			int valor = fis.read();
			while(valor != -1) {
				System.out.print((char) valor);
				valor = fis.read();
				
			}
			
			
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
		}

	}

}
