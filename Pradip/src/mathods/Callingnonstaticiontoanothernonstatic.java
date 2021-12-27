package mathods;

public class Callingnonstaticiontoanothernonstatic {

	public void m1() {
		System.out.println("methid 1 is running");
	}
		public void m2 () {
	m1();
	int a =12;
	int b=12;
	int c= a/b ;
	
	System.out.println(c);
		}
		
		public static void main (String[]args) {
			
			Callingnonstaticiontoanothernonstatic obj1 = new Callingnonstaticiontoanothernonstatic();
			
 obj1.m2();
			
			
			
		
	}
}
