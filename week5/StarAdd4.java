import java.util.ArrayList;
public class StarAdd {
	public static void main(String[]args) {
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("bursa");
		words.add("istanbul");
		words.add("izmir");
		words.add("ankara");
		
		System.out.println("dongu oncesi "+words);
		System.out.println("liste uzunlugu: "+words.size());
		
		for(int index=1;index<words.size()+1;index+=2) {
			words.add(index,"*");
			
		}
		System.out.println("dongu sonrasi "+words);
		System.out.println("liste uzunlugu: "+words.size());
		
		for(int index=words.size()-1; index>=0;index-=2) {
			words.remove(index);
			
		}
		System.out.println("silme sonrasi "+words);
		System.out.println("silme sonrasi liste uzunlugu: "+words.size());
		
		
	}

}