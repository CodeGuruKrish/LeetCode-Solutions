package ArraysAndString;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String testString = "aaaabbbbcccddeeaaa";
		
		String out = removeDuplicates(testString);
		
		System.out.println("Output String : " + out);
	}

	private static String removeDuplicates(String testString) {

		Set globalTracker = new LinkedHashSet<Character>();
		
		char[] inputStringArray = testString.toCharArray();
		
		for(char current : inputStringArray)
		{
			
			if(!globalTracker.contains(current))
			{
				globalTracker.add(current);
			}			
		}
		
		StringBuilder stringBuilder = new StringBuilder();
		
		Iterator<Character> it = globalTracker.iterator();
		
		while(it.hasNext())
		{
			stringBuilder.append(it.next());
		}
		
		return stringBuilder.toString();
	}
}
