package inheritance;

public class Childclass extends Parentclass {
	
	public static void m5() {
		System.out.println("Child class method m5");
	}
	public void m6() {
		
		System.out.println("Child Class Method M6");
	}
	public static void main (String[]args) {
		Childclass obj=new Childclass (); 
		
		obj.m2();
		obj.m6();
	}

}
