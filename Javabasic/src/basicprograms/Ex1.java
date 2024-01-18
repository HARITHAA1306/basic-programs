package basicprograms;
import java.util.HashSet;

public class Ex1 {
	public static void main(String[]args) {
		HashSet<String>c=new HashSet<String>();
		c.add("black");
		c.add("pink");
		System.out.println(c.contains("pink"));
	}

}
