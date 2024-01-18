package basicprograms;

public class Basic {
	public int addnumbers(int a, int b) {
		int sum=a+b;
		return sum;
	}
	public int subnumbers(int a,int b) {
		int sub=a-b;
		return sub;
	}
	public int multiply(int a,int b) {
		int mul=a*b;
		return mul;
	}
	public int division(int a,int b) {
		int div=b/a;
		return div;
	}
	public static void main(String[]args) {
		int num1=23;
		int num2=45;
		Basic obj=new Basic();
		int addition=obj.addnumbers(num1, num2);
		int subraction=obj.subnumbers(num1, num2);
		int multiplication=obj.multiply(num1, num2);
		int division=obj.division(num1, num2);
		System.out.println(addition);
		System.out.println(subraction);
		System.out.println(multiplication);
		System.out.println(division);
	}

}
