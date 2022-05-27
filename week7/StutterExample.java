import java.util.*;

public class StutterExample {

	public static void main(String[] args) {
      
		int data [] = {3,4,8,9,1};
        
		Stack<Integer> s = new Stack<Integer>();
		for(int n : data)
			s.push(n);
		System.out.println(s);
		stutter(s);
		System.out.println(s);
		

	}
	
	public static void stutter(Stack<Integer> s) {
		
		int size = s.size();
		  System.out.print("[");
		while(size>3) {
		 
		   System.out.print(s.peek() + "," + s.peek() + "," );
		   
		    s.pop();
		
		}	
		System.out.print("]");
		
	
	
	}
}