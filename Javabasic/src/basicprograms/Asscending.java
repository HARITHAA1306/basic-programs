package basicprograms;

import java.util.Arrays;

public class Asscending {
	public static void main(String[]args) {
		int[] a= {5,3,7,9,1};
		int min=0;
		int max=0;
		Arrays.sort(a);
		min=a[0]+a[1]+a[2]+a[3];
		System.out.println(min);
		max=a[1]+a[2]+a[3]+a[4];
		System.out.println(max);
	}

}
