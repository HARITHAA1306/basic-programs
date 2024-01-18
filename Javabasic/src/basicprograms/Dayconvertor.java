package basicprograms;
import java.util.Scanner;

public class Dayconvertor {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("days");
		int day=s.nextInt();
		int yrs=day/365;
		int months=day/30;
		int week=day/7;
		System.out.println("year"+yrs);
		System.out.println("months"+months);
		System.out.println("days"+week);
	}

}
