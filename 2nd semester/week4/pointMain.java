package uygulama;

public class pointMain {

	public static void main(String[] args) {
	 
		Point p1=new Point(5,17);
		Point p2=new Point(2,11);
		
		System.out.println("p1("+p1.getX()+","+p1.getY()+")");
		System.out.println("orijine uzakligi="+p1.distanceFromOrigin());
		
		System.out.println("p2("+p2.getX()+","+p2.getY()+")");
		System.out.println("orijine uzakligi="+p2.distanceFromOrigin());
		
		p1.translate(2, 7);
		System.out.println("p1("+p1.getX()+","+p1.getY()+")");
		System.out.println("orijine uzakligi="+p1.distanceFromOrigin());
		System.out.println("p1="+p1);
		
		p2.translate(6, 4);
		System.out.println("p2("+p2.getX()+","+p2.getY()+")");
		System.out.println("orijine uzakligi="+p2.distanceFromOrigin());
		System.out.println("p2="+p2);
		
		

	}

}
