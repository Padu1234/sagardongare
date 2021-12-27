package mathods;

public class Callingnonstaticinsidestatic {
	
	public void m1() {
		System.out.println("non stating method is running");
	}
	public static void m2() {
		Callingnonstaticinsidestatic ob=new Callingnonstaticinsidestatic();
		ob.m1();
	}
		
		public static void main (String[]args) {
	m2();
		
		}
		
}