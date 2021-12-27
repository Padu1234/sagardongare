package practice;

import java.util.Arrays;

public class Arrey {

	public static void main(String[]args) {
		
		int []a= {7,7,8,0,2,3,4,5,6};
		int [] b= {1,2,3,4,5,6};
		
		Arrays.sort(a);
		for(int i=0; i<a.length ; i++)
		System.out.print(a[i] + " ");
		
		Arrays.sort(b);
		for(int i=0; i<b.length ; i++)
		System.out.print(b[i] + " ");
	}
	
	
}
