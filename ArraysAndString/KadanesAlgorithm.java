package ArraysAndString;

public class KadanesAlgorithm {
	
	public static void main(String args[])
	{
		
		int[] sampleArray = {-1,-2,-3,0,4,6,7,-20,9,9,9};
		
		int maxSum = findMaxSum(sampleArray);
		
		System.out.println("Max sum : " + maxSum);
	}

	private static int findMaxSum(int[] sampleArray) {
		
		
		int currentMax = 0; 
		int runningSum = 0;
		
		for ( int i : sampleArray)
		{
			if (i > 0)
			{
				runningSum = runningSum + i;
				if(runningSum > currentMax)
				{
					currentMax = runningSum;
				}
			}
			else
			{
				runningSum = 0;
			}
			
			System.out.println("currentMax : " + currentMax);
		}
		
		return runningSum;
	}

}
