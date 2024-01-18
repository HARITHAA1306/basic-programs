package basicprograms;
import java.io.File;
import java.io.IOException;

public class Createfile {
	public static void main(String[]args) {
		try {
			File obj=new File("D:/java/basic.txt");
			if(obj.createNewFile()) {
				System.out.println("new file created"+obj.getName());
			}
			else {
				System.out.println("file exists");
			}
			
		}catch(IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}

}
