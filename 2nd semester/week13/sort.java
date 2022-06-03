package selectionsort;
class sort {

	public static void main(String[] args) {
		int []array = {25,80,56,62,31,48,22,35,75,83,92};
		sort ob = new sort();
		ob.selesort(array);
		ob.print(array);

	}
	void sort(int[]array,int left,int right) {
		if(left<right) {
			int middle = (left+right)/2;
			sort(array,left,middle);
			sort(array,middle+1,right);
			merge(array,left,middle,right);
			
		}
	}
	void merge(int[] array, int left, int middle, int right) {
		int number1=middle+1;
		int number2= right-middle;
		int[] l = new int[number1];
		int[] r = new int[number2];
			
	}
	void insertsort(int[]array) {
		for(int i = 1; i < array.length;i++) {
			int key = array[i];
			int j = i-1;
			while(j>=0&&array[j]>key) {
				array[j+1] = array[j];
				j--;
				}
			array[j+1]=key;
		}
		
	}
	
	
	
	void bubblesort(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if(array[j]>array[j+1]) {
					int tmp = array[j];
					array[j]=array[j+1];
					array[j+1]= tmp;
				}
			}
		}
	}
	
	void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	System.out.println();
	}
	void selesort(int array[]) {
		for(int i = 0;i <array.length-1;i++) {
			int min_i = i;
			for(int j =i+1;j<array.length;j++) {
				if(array[j]<array[min_i])
					min_i=j;
				
			}  
			//4
		int tmp=array[min_i];
		array[min_i]=array[i];
		array[i]=tmp;
		}
	}

}    