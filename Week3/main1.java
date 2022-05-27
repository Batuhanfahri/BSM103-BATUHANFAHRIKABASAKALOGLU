
public class main1 {
	public static void main (String[]args) {
		
		Cat kedi1 = new Cat();
		System.out.println(kedi1.age+ "," +kedi1.color+ "," +kedi1.name);
		
		Cat kedi2 = new Cat("Duman",3);
		System.out.println(kedi2.age+ "," +kedi2.color+ "," +kedi2.name);
	
		Cat kedi3 = new Cat("Pamuk","beyaz",2);
		System.out.println(kedi3.age+ "," +kedi3.color+ "," +kedi3.name);
		
		Cat kedi4 = new Cat(1,"Tarcin","turuncu");
		System.out.println(kedi4.age+ "," +kedi4.color+ "," +kedi4.name);
		
		Cat kedi5 = new Cat("siyah",2,"Zeytin");
		System.out.println(kedi5.age+ "," +kedi5.color+ "," +kedi5.name);
		
		
	}

}
