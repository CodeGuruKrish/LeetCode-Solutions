package ArraysAndString;

import java.util.HashMap;

public class TwoSum {
	
	// [9, 2 ,3 ,4 ,5 ,6 ,7.........n]  - 1 million elements
	// Give me two elements where sum is 11.
	
	// Approach - Bruteforce
	// Approach - Sorting - (nlogn + n)
	// Approach - HashMap - 0(N) memory
	
	public static void main(String[] args) {
		int[] array = {9, 2 ,3 ,4 ,5 ,6 ,7};
		int target = 11;
		
		HashMap<Integer, Integer> hmap = new HashMap<>();
		
		for(Integer i : array)
		{
			if(hmap.containsKey(i))
			{
				System.out.println("Pair is : " + i + " " + hmap.get(i));
				break;
			}
			else
			{
				hmap.put(target - i, i);
			}
		}		
	}
}
