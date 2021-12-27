package array;

import java.util.Arrays;

public class CompairArray {
public static void main (String[]args) {
	int []a= {1,2,3,4,5,6};
	int[]b= {1,2,4,4,5,6,4,};
	int []c = {1,2,3,4,5,6};
	int[]d= {1,2,3,4,6,5};
	
	
	System.out.println(Arrays.equals(a, b));
	System.out.println(Arrays.equals(a, c));
	System.out.println(Arrays.equals(a, d));
	System.out.println(Arrays.equals(b, b));
}
}
