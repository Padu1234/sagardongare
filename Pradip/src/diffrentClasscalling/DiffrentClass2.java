package diffrentClasscalling;

public class DiffrentClass2 {
public static void m3() {
	
	System.out.println("static method m3 is running");
	
}

public void m4 () {
	System.out.println("non static m4");
	
}
public static void main (String[]args) {
	
	Diffrentclass1.m1();
	
	Diffrentclass1 obj= new Diffrentclass1();
	obj.m2();
	DiffrentClass2 obj1 = new DiffrentClass2();
	obj1.m4();
}


}
