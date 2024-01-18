package basicprograms;

public class Tiffen extends Snacks{
	public void idle() {
		System.out.println("Idle");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiffen t=new Tiffen();
		t.calories();
		t.chocolate();
		t.expirydate();
		t.hots();
		t.mfd();
		t.price();
		t.idle();
		t.sweets();

	}

}
