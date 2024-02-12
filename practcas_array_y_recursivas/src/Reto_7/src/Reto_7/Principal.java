package Reto_7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Crear una aplicación de listado. Para ello el sistema deberá mostrar por
		 * consola de forma recursiva todas las carpetas, subcarpetas y ficheros de una
		 * ruta concreta (por ejemplo, la carpeta del directorio de tu perfil), nada más
		 * arrancar la aplicación
		 */
		String ruta = "/home/alisanlo/eclipse-workspace/Sockets/";

		listarDirectorio(new File(ruta));
	}

	public static void listarDirectorio(File directorio) {
		// Verifica si el objeto File es un directorio
		if (directorio.isDirectory()) {
//para sacara una lista con los directorios
			File[] listaArchivos = directorio.listFiles();

			/*
			 * hay que verificar si la lista esta vacía para realizaar una iteracion sobre
			 * la lista creada con la cuaL imprimiremos le resultado, utilizando si es
			 * necesario el metodo creado
			 */
			if (listaArchivos != null) {
				for (File archivo : listaArchivos) {

					System.out.println(archivo.getName());

					if (archivo.isDirectory()) {
						listarDirectorio(archivo);
					}
				}
			}
		} else {
			// EN el caso de que File no sea un directorio, solo se impirimira su nombre
			System.out.println(directorio.getName());
		}

	}

}
