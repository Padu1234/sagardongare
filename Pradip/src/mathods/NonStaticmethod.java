package mathods;

public class NonStaticmethod {

	
	public void m1() {
		
		System.out.println("non static method is running");
	}
	
	public static void main (String[]args) {
		NonStaticmethod obj = new NonStaticmethod();
		
		obj.m1();
	}
	


}
