import java.util.ArrayList;
public class Fruits {

	public static void main(String[] args) {
    
		ArrayList<String> list = new ArrayList<String>();
		list.add("ananas");
		list.add("mango");
		list.add("cilek");
		
		System.out.println(list);
		
		for(String fruit:list)
			System.out.println(fruit);
	}

}
