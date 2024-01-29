package practica;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fich3 {

	public static void main(String[] args) {
		File f = new File("f.ddr");
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fos = new FileOutputStream(f);
			dos = new DataOutputStream(fos);
			fis = new FileInputStream(f);
			dis = new DataInputStream(fis);
					
			dos.writeInt(32);
			dos.writeUTF("Pepe");
			dos.writeInt(4);
			
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
			System.out.println(dis.readInt());

		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			
		}
	}

}
