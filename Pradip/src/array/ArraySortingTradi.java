package array;

public class ArraySortingTradi {
public static void main (String[]args) {
	int [] a = {45,76,89,8,34,23,11,23,34,12,146,4566,65464};
	int empty;
	
	for (int i=0; i<a.length; i++)
	{
		for (int j= i+1; j<a.length; j++)
			
		{
			if (a[i]>a[j]) // asending always right
			{
				empty =a[i];
				a[i]=a[j];
				a[j]=empty;
			}
		}
	}
			
	
	for (int i=0; i<a.length; i++)
	System.out.print(a[i]+ "  ");
}
}
