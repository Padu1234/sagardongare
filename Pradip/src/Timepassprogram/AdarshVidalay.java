package Timepassprogram;

public class AdarshVidalay {
int maths;
int physics;
int chem;


public  AdarshVidalay(int maths, int physics, int chem) {
	
	
	
	this.maths=maths;
	this.physics=physics;
	this.chem=chem;
}
	public void m1() {
		System.out.println("maths;"+maths);
		System.out.println("physics"+physics);
		System.out.println("chem"+chem);
	}
	
	public static void main (String[]args) {
		AdarshVidalay teena =new AdarshVidalay (56,67,67);
		AdarshVidalay meena =new AdarshVidalay (97,68,60);
		AdarshVidalay reena =new AdarshVidalay (56,67,87);
		teena.m1();
		meena.m1();
		reena.m1();
		
	}
	
	
	
	
}

