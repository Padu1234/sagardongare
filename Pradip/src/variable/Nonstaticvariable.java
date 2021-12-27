package variable;

public class Nonstaticvariable {
 int a=12;
 int c   =12;
 
 int b =a-c;
public void m2 (){
	
	System.out.println(b);	
}
public static void main (String[]args) {
	Nonstaticvariable obj = new Nonstaticvariable ();
	obj.m2();
	Nonstaticvariable a = new Nonstaticvariable ();
a.a=40;

Nonstaticvariable d = new Nonstaticvariable ();
d.a=4100;


	System.out.println(a.a);
	
	System.out.println(d.a);
	
}
}
