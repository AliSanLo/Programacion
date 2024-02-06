package ficheros;

import java.io.File;

public class fich1 {

	public static void main(String[] args) {
		File d = new File ("C:\\Users\\alici\\eclipse-workspace\\Programacion\\src");
		listasDirectorio(d);
			
	}

	private static void listasDirectorio(File d) {
		File [] fich =d.listFiles();
		System.out.println( "Contenido de : " + d.getAbsolutePath());
		for (File f : fich) {
			System.out.println(f);
		}
		
	}


}
