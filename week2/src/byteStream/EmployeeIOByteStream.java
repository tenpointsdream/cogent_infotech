package byteStream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EmployeeIOByteStream {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("c://java_ws//stream//employee.txt");
			fos = new FileOutputStream("c://java_ws//stream//newemployee.txt");
			int i;
			while ((i=fis.read())!=-1) {
				fos.write(i);
			}
			System.out.println("Copied all the data to the new file");
		}catch(FileNotFoundException e) {
			System.err.println(e);
		}catch(IOException e) {
			System.err.println(e);
		}finally {
			try {
				fis.close();
				fos.close();
			}catch(IOException e) {
				System.err.println(e);
			}
		}
	}
}
