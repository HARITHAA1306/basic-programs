package basicprograms;

public class Lunch  {
	public void sambar(String sambar) {
		System.out.println(sambar);
	}
	public void sambar(int amount) {
		System.out.println(amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lunch l=new Lunch();
		l.sambar("sambar");
		l.sambar(25);

	}
}