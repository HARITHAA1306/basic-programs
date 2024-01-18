package basicprograms;

public class Maxsum {
		public static void main(String[]args) {
			int[] a= {5,6,8,3,2};
			int maxsum=8;
			for(int i=1;i<a.length;i++) {
				if(a[i]<maxsum)
				{
					maxsum=a[i];
				}
				
			}
			System.out.println(maxsum);
		}

	}


