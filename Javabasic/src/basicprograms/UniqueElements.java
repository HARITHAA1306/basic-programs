package basicprograms;

public class UniqueElements {
	public static void main(String[]args) {
		int[] a= {4,3,9,8,7,4,3,9,8,7};
		for(int i=0;i<a.length;i++) {
			boolean isUnique=true;
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					isUnique=false;
					break;
				}
			}
			if(isUnique) {
				System.out.println(a[i]+"");
			}
		}
	}

}
