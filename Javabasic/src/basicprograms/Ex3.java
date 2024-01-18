package basicprograms;

public class Ex3 {
	public static void main(String[]args) {
		StringBuffer a=new StringBuffer("Harithaa");
		a.append("Ajay");
		System.out.println(a);
		a.insert(0, "S.");
		System.out.println(a);
		a.replace(3, 4, "A");
		System.out.println(a);
		a.delete(10, 11);
		System.out.println(a);
		a.reverse();
		System.out.println(a);
	}

}
