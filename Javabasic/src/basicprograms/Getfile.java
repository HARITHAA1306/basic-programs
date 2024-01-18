package basicprograms;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Getfile {
	public static void main(String[]args) {
		try {
			File a=new File("D:/java/basic.txt");
			Scanner b=new Scanner(a);
			while( b.hasNextLine()) {
				String c=b.nextLine();
				System.out.println(c);
							}
		}catch(FileNotFoundException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}

}
