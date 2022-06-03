
public class Bianrysearch {

	public static void main(String[] args) {
		int[] numbers = {63,18,51,37,29,49,42,11,31};
		int[] numbers2 = {11,18,29,37,42,49,51,63,31};
		
		int index = indexOf2(numbers2,42);
		if(index != -1)
		System.out.println("Elemanýn indexi "+index);
		else
			System.out.println("eleman bulunamadý");
		int indexa = binarySearch(numbers,11);
		System.out.println(indexa);
		System.out.println(bian(numbers, 11));
	}
	public static int indexOf2(int []numbers,int target) {
		for (int i = 0; i < numbers.length && numbers[i]<=target; i++) {
			if(numbers[i]==target)
				return i;
			else
				i++;
		}
		return -1 ;
	}
	public static int binarySearch(int []numbers,int target) {
		int min = 0;
		int max = numbers.length-1;
		while(min<=max) {
			int mid =(max+min)/2;
			if(numbers[mid]==target)
				return mid;
			else if(numbers[mid]<target)
				min = mid+1;
			else
				max=mid-1;
			
		}
	return -1;
	
	}
	public static int bian(int []numbers,int target) {
		int min = 0;
		int max = numbers.length;
		for(int i = min; i<=max-1;i++) {
			int mid = (min+max)/2;
			if(numbers[mid]==target)
				return mid;
			else if(numbers[mid]<target)
				min++;
			else
				max = mid-1;
		}
		return -1;
	}
	

}
