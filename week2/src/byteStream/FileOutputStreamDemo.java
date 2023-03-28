package byteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try{
			fis = new FileInputStream("c://java_ws//stream/abc.txt");
			fos = new FileOutputStream("c://java_ws//stream//abc2.txt");
			int i;
			while((i=fis.read())!=-1) {
				fos.write(i);
			}
			System.out.println("Data copied");

		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				fis.close();
				fos.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
