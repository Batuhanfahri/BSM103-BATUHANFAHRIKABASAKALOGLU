import java.util.*;
public class QueueExample {

	public static void main(String[] args) {
		String data [] = {"java","php","python","C","c++"};
		
		Queue <String> q = new LinkedList<>();
		
		for(String word:data)
			q.add(word);
		
		System.out.println("queue = " +q);
		System.out.println("peek = " +q.peek());
		
		
		
		
		
		

	}

}
