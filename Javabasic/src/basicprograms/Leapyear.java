package basicprograms;

public class Leapyear {
	public static void main(String[]args) {
		 int year=2002;
		 if((year%100==0)&&(year%4!=0)&&(year%10==0)) {
			 System.out.println("is a leap year");
		 }
		 else {
			 System.out.println("not a leap year");
		 }
	}

}
