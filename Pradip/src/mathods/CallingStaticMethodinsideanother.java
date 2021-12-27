package mathods;

public class CallingStaticMethodinsideanother {
	public static void m1() {
		int a =123;
		int b =123;
		int c=a+b;
		System.out.println(c);
	}
		public static void m2() {
		m1();
		
		System.out.println("static method is running");
		}
		
		public static void main (String []args) {
			m2();
			
			
			
		}
	}
	


