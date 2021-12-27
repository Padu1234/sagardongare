package arguments;

public class Argumentsandreturntype {

	public boolean ArgsandReturn (int a , int b) {
		 int c= a+b;
		 
		 if(c==20)
			 return true;
		 return false;
	}
	public static void main (String[]args) {
		
		Argumentsandreturntype obj = new Argumentsandreturntype ();
		System.out.println(obj.ArgsandReturn (10,10));
		Argumentsandreturntype obj1 = new Argumentsandreturntype ();
		System.out.println(obj1.ArgsandReturn (10,90));
		
		
		
		
	}
}