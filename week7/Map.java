import java.util.HashMap;
import java.util.*;
public class Map {

	public static void main(String[] args) {
		HashMap<Double,String> taGpa = new HashMap<Double,String>();
		taGpa.put(3.6, "Jared");
		taGpa.put(4.0, "Alyssa");
		taGpa.put(2.9, "Steve");
		taGpa.put(3.6, "Stef");
		taGpa.put(2.9, "Rob");
		
		System.out.println("Who got a 3.6? " + taGpa.get(3.6)); 
	}

}
