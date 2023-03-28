package week2_0328;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileIOStreamCL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileReader fr = null;
		FileWriter fw = null;
		if (args.length == 0) {
			System.out.println("No argument provided!");
			sc.close();
			return;
		}
		else if (args.length == 1) {
			System.out.println("No destination provided");
			sc.close();
			return;
		}
		String sr = args[0];
		String dest = args[1];
		String decision = "";
		;
		if (!(new File("c://java_ws//week2//src//week2_0328//" +sr).exists())) {
			System.out.println("No source file found");
			sc.close();
			return;
		}
		
		if ((new File("c://java_ws//week2//src//week2_0328//" +dest).exists())) {
			System.out.println("Both files exists!");
			System.out.println("Would you like to overwrite it? (yes/no)");
			decision = sc.next();
		}
		else {
			System.out.println("Destination file does not exist");
			System.out.println("Creating new destination file");
			System.out.println("Would you like to copy the content from the source file? (yes/no)");
			decision = sc.next();
		}
		if (decision.equals("yes")) {
			try {
				fr = new FileReader("c://java_ws//week2//src//week2_0328//" +sr);
				fw = new FileWriter("c://java_ws//week2//src//week2_0328//" +dest);
				int ch;
				while((ch=fr.read())!=-1) {
					fw.write(ch);
				}
				System.out.println("File copied");
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					fr.close();
					fw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		else {
			try {
				fw = new FileWriter("c://java_ws//week2//src//week2_0328//" +dest);
				System.out.println("Created empty file of " + dest);
				fw.close();
			}catch(Exception e) {
				e.printStackTrace();			
			}
		}
		sc.close();
	}
}
