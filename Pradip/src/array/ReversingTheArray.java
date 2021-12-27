package array;

public class ReversingTheArray {
public static void main (String[]args) {
	
	int [] a = {34,54,45,21,32,53,56,87,12,32,78,90,3,2};
	
	 //before reversing
	System.out.println("Before Reversing");
	
	for (int i=0; i<a.length ; i++)
		System.out.print(a[i] + " ");
	
	
	 // after reversing 
	System.out.println("After Reversing");
	for (int i= a.length;i>=1; i--)
		System.out.print(a[i] + " ");
	
	
	
}
}
