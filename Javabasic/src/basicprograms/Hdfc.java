package basicprograms;

public class Hdfc implements Banking{

	public void savings() {
		System.out.println("savings acc");
	}
	public void cureent() {
		System.out.println(" current acc");
	}
	public void joint() {
		System.out.println("joint acc");
	}
	
	public static void main(String[]args) {
		Hdfc obj = new Hdfc();
		obj.cureent();
		obj.savings();
		obj.joint();
	}
}
