package DynamicProgramming;

public class FindSquareRoot {

	private static int globalRoot = 0;
	private static Boolean switcher = false;
	
	public static void main(String[] args) {

		int input = 19;

		//System.out.println("Root : "+ findSquareRoot(input, input/2)); 
		System.out.println("Liner Root : " + findSqureRootLinear(input));
	}

	private static int findSquareRoot(int input, int checkValue) 
	{
		System.out.println("checkValue now : " + checkValue);
		
		if(input == 1)
			return 1;
		
		if (checkValue * checkValue == input)
		{
			globalRoot = checkValue;
		}
		else if(checkValue * checkValue > input)
		{
			findSquareRoot(input, checkValue/2);
		}
		else
		{
			findSquareRoot(input, checkValue+1);
		}

		System.out.println("Function called now!");

		return globalRoot;
	}
	
	
	private static int findSqureRootLinear(int input)
	{
		int absoluteInput = Math.abs(input);
		int start = 1;
		int end = absoluteInput/2;
		
		if(absoluteInput == 0)
			return 0;
		
		if(absoluteInput >= 1 && absoluteInput < 4)
			return 1;
		
		while(start <= end)
		{
			if(end * end  > absoluteInput)
			{
				if(switcher)
					return end-1;
				end = end / 2;
			}
			else if(end * end < absoluteInput)
			{
				end = end + 1;
				switcher = true;
			}
			
			if(end * end == absoluteInput)
			{
				return end;
			}
		}
		
		return 0;
		
	}
}
