package basicprograms;
import java.util.Scanner;


public class Ex9 {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
	    float m=s.nextFloat();
		if((m>90)&&(m<=100)) {
			System.out.println("A");
		}
		else if((m>=80)&&(m<=89)) {
			System.out.println("B");
		}
		else if((m>=70)&&(m<=79)) {
			System.out.println("C");
		}
		else if((m>=60)&&(m<=69)) {
			System.out.println("D");
		}
		else if((m>=50)&&(m<=59)) {
			System.out.println("E");
		}
		else {
			System.out.println("Fail");
		}
	}
}
		
	
