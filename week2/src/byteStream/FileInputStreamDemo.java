package byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File("c://java_ws//stream//abc.txt"));
			System.out.println("File is opened");
			int i;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			fis.close();
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
		catch (IOException e) {
			System.out.println(e);
		}
		/*
		 * finally { try { fis.close(); } catch(IOException e) { System.out.println(e);
		 * } }
		 */
	}
}
