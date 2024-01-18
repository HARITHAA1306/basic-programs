package basicprograms;
import java.util.Scanner;

public class Star2 {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows to be printed");
		int rows=s.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=rows;j>=i;j--) {
				System.out.print("");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
