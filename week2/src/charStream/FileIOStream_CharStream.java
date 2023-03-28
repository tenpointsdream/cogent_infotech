package charStream;

import java.io.FileReader;
import java.io.FileWriter;

public class FileIOStream_CharStream {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("c://java_ws//stream//abc.txt");
			fw = new FileWriter("c://java_ws//stream//msg.txt");
			
			int ch;
			while((ch=fr.read())!=-1) {
				fw.write(ch);
			}
			System.out.println("Copied");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
