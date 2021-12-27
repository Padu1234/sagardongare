package constractor;

public class Consractorusingthis {
	int a;
	boolean b;

	public Consractorusingthis(int a, boolean b ) {
		this.a=a;
		this.b=b;
		System.out.println("top constractor is working");
	}
		public Consractorusingthis() {
		
	this (12,false); 
	System.out.println("down constractor is running");
	
		}
		public static void main (String[]args) {
			Consractorusingthis obj= new Consractorusingthis(45,false);
			
		
	}
}
