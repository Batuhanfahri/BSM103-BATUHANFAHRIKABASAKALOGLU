
public class Car {
	int model;
	String brand;
	String color;
	
	public Car(String brand, String color, int model) {
		this.model = model;
		this.brand = brand;
		this.color = color;
		
	}
	
	public Car(int model,String brand) {
		this.model = model;
		this.brand = brand;
		
		
	}
	
	public Car(String color, String brand) {
		this.brand = brand;
		this.color = color;
	
	
	}
	
	public Car (int model,String color) {
		this.model = model;
		this.color = color;
		 
				
	}
	
	public Car(int model,String brand, String color) {
		this.model = model;
		this.brand = brand;
		this.color = color;
	}

}


