package ArraysAndString;

/**
 * https://www.geeksforgeeks.org/convert-number-to-words/
 * @author Hithesh
 */
public class ConvertNumberToWords {
	
	public static void main(String[] args) {
		
		for(int i=100; i<140; i++)
		{
			System.out.println(convertToWord(String.valueOf(i)));
		}
		
		//System.out.println(convertToWord("120"));

	}

	private static String convertToWord(String number) {
		
		StringBuilder sb = new StringBuilder();
		
		String[] tens = {"" ,"ten", "twenty" ,"thirty", "fourty", "fifty" , "sixty", "seventy", "eighty", "ninty"};
		
		String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		String[] twoDigits = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
 		
		String[] placers = {"thousand", "hundred"};
		
		char[] splitNumber = number.toCharArray();
		
		if (splitNumber.length == 1)
		{
			sb.append(ones[Integer.parseInt(Character.toString(splitNumber[0]))]);
		}
		else if(splitNumber.length == 2)
		{
			if(splitNumber[1] == 0)
			{
				sb.append(tens[Integer.parseInt(Character.toString(splitNumber[0]))]);
			}
			else
			{
				sb.append(twoDigits[Integer.parseInt(Character.toString(splitNumber[1]))]);
			}
		}
		else if(splitNumber.length == 3)
		{
			if(splitNumber[2]=='0')
			{
				String tenPlace = tens[Integer.parseInt(Character.toString(splitNumber[1]))];
				String hundredPlace = ones[Integer.parseInt(Character.toString(splitNumber[0]))];
				sb.append(hundredPlace).append(" ").append(placers[1]).append(" ").append(tenPlace);
			}
			else if(splitNumber[1]=='1')
			{
				String onePlace = ones[Integer.parseInt(Character.toString(splitNumber[2]))];
				String tenPlace = twoDigits[Integer.parseInt(Character.toString(splitNumber[2]))];
				String hundredPlace = ones[Integer.parseInt(Character.toString(splitNumber[0]))];
				sb.append(hundredPlace).append(" ").append(placers[1]).append(" ").append(tenPlace);
			}
			else
			{
				//System.out.println(splitNumber[2]);

				String onePlace = ones[Integer.parseInt(Character.toString(splitNumber[2]))];
				String tenPlace = tens[Integer.parseInt(Character.toString(splitNumber[1]))];
				String hundredPlace = ones[Integer.parseInt(Character.toString(splitNumber[0]))];
				sb.append(hundredPlace).append(" ").append(placers[1]).append(" ").append(tenPlace).append(" ").append(onePlace);
			}
		}
		
		return sb.toString();
	}
}
