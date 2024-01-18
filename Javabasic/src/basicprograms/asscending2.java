package basicprograms;

public class asscending2 {
	public static void main(String[]args) {
		int[] a= {5,6,8,3,2};
		int minsum=5;
		for(int i=1;i<a.length;i++) {
			if(a[i]<minsum)
			{
				minsum=a[i];
			}
			
		}
		System.out.println(minsum);
	}

}
