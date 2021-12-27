package variable;

public class Staticlocalvariable {
static int a =123;
public void m2() {
int a= 56;
System.out.println(a);
System.out.println(Staticlocalvariable.a);
}

public static void main (String[]args) {
	
	Staticlocalvariable obj = new Staticlocalvariable ();
	obj.m2();

}
}
