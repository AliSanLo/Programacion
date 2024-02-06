package practica;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class posicion {

	public static void main(String[] args) {
		File f = new File ("file.ddr");

		RandomAccessFile ra = null;
		try {
			ra = new RandomAccessFile(f, "rw");
			ra.writeInt(5);
			ra.writeBoolean(false);
			ra.writeChars("Prueba");
			
			
			ra.seek(4);;
			boolean datoBool = ra.readBoolean();
			System.out.println(datoBool);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
