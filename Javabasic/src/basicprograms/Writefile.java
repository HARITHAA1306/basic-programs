package basicprograms;
import java.io.FileWriter;
import java.io.IOException;

public class Writefile {
	public static void main(String[]args) {
		try {
			FileWriter f=new FileWriter("D:/java/basic.txt");
			f.write("Harithaa");
			f.close();
			System.out.println("finish writing");
		}catch(IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}

}
