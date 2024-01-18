package basicprograms;
import java.util.Scanner;

public class Ex8 {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		float m=s.nextFloat();
		if(m>=35) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
