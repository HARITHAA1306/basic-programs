package basicprograms;
import java.util.Scanner;


public class Addition {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("input 1");
		int num=s.nextInt();
		System.out.println("input 2");
		int sum=s.nextInt();
		int add=num+sum;
		int sub=num-sum;
		int mul=num*sum;
		int div=num/sum;
		int mod=num%sum;
		System.out.println("addition"+add);
		System.out.println("subratction"+sub);
		System.out.println("multiply"+mul);
		System.out.println("divide"+div);
		System.out.println("module"+mod);
	}

}
