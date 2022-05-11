
public class carMain {
public static void main (String[]args) {
		
		Car araba1 = new Car("Renault","gri",2020);
		System.out.println(araba1.model+ "," +araba1.color+ "," +araba1.brand);
		
		Car araba2 = new Car(2022,"BMW");
		System.out.println(araba2.model+ "," +araba2.color+ "," +araba2.brand);
	
		Car araba3 = new Car("beyaz","AUDI");
		System.out.println(araba3.model+ "," +araba3.color+ "," +araba3.brand);
		
		Car araba4 = new Car(2021,"siyah");
		System.out.println(araba4.model+ "," +araba4.color+ "," +araba4.brand);
		
		Car araba5 = new Car(2023,"Rangerover","mavi");
		System.out.println(araba5.model+ "," +araba5.color+ "," +araba5.brand);
		
}
}
