package basicprograms;
import java.util.HashMap;

public class Collections {
	public static void main(String[]args) {
		HashMap <Integer,String>color=new HashMap<Integer,String>();
		color.put(1,"Black");
		color.put(2,"Green");
		System.out.println(color);
		color.replace(2, "Yellow");
		System.out.println(color);
		color.remove(2);
		System.out.println(color);}

}
