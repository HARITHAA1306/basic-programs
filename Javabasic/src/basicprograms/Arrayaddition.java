package basicprograms;
import java.util.Arrays;

public class Arrayaddition {
	public static void main(String[]args) {
		int[] num= {10,11,12,13,14,15};
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
			
		}
		System.out.println("sum of all the elements" +sum);
	}
}
