package homeworks;

public class ReferanceMystery2 {

	public static void main(String[] args) {
int a = 7;
int b = 9;
Basicpoint p1 = new Basicpoint();
Basicpoint p2 = new Basicpoint();
addToTwice(a, p1);
System.out.println(a+" "+b + " " +p1.x+" "+p2.x);
addToTwice(b, p2);
System.out.println(a+" "+b + " " +p1.x+" "+p2.x);
	}
public static void addToTwice(int a, Basicpoint p1){
	a = a + a ;
	p1.x = a;
	System.out.println(a+" "+p1.x);
}
}
