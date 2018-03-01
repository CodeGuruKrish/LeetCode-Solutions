package ArraysAndString;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MaxSum {

	public static void main(String[] args) {
		
		int[] maxArray = {-1,-2,-3,0,4,6,7,-20,8,9,7,7,10};
		
		//{2,-1, 80}
		
		int result = findMaxSum(maxArray);
		
		System.out.println( "The Max Sum is: " +result);
		
	}

	private static int findMaxSum(int[] maxArray) {
		
		ArrayList<Integer> maxArr = new ArrayList<>();
		
		if (maxArray.length == 0)
		 	return 0;
		 	
		int globalMax = 0;
		int currentMax = 0;

		for(int i=0;i< maxArray.length;i++)
		{
			if(maxArray[i] > 0)
			{
				currentMax = currentMax + maxArray[i];
				if(currentMax > globalMax)
				{
					globalMax = currentMax;
				}
				
				maxArr.add(maxArray[i]);
			}
			else
			{
				 currentMax = 0;
				 maxArr.clear();
			}	
		}
		
		for(Integer i : maxArr)
		{
			System.out.println("Array elemets : " + i);
		}
					

		return globalMax;
	}
}