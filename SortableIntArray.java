// An array of integers
import java.util.*;

public class SortableIntArray {
	private int[] arrayContents;
	
	// Creates an array of random numbers.
	
	
	public void sort()
	{

		int smallestSoFar=Integer.MAX_VALUE;
		int smallestIndex = 0;
			for(int i= 0; i<arrayContents.length;i++)
			{
				for(int j = i; j<arrayContents.length;j++)
				{
					if(arrayContents[i] < smallestSoFar)
					{
						smallestIndex = j;
						smallestSoFar = arrayContents[i];
					}
				}
				
				if(arrayContents[i] > arrayContents[i+1])
				{
					int temp = arrayContents[i];
					arrayContents[i] = arrayContents[i+1];
					arrayContents[i+1] = temp;
	//				sorted = false;
				}
			}
	
	}
	
	public String toString()
	{
		return Arrays.toString(arrayContents);
	}
	
	public static void main (String[] args)
	{
		SortableIntArray array = new SortableIntArray();		//10, 100
		array.sort();
		System.out.println(array);
	}
}
