package variable;

public class Localvariable {
int a =32;
	public void m1 () {
		
		int a =59; // non static variable                                                                                                                                            
		System.out.println(a);
		System.out.println(this.a);
		
		
	
	}
	
	public static void main (String[]args) {
		
		Localvariable obj= new Localvariable();
		
		obj.m1();
	}
	
}
