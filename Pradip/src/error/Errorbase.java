package error;

public class Errorbase {
	
	public void m1() {
		System.out.println("M1 running");
		m2();
	}
	
	public void m2 () {
		
		m1();
		System.out.println("M2 is running");
	}
	public static void main (String []args) {
		
		Errorbase obj=new Errorbase ();
		obj.m1();
	}

}
