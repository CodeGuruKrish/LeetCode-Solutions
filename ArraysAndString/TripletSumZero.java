package ArraysAndString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class TripletSumZero {
	
	public static void main(String[] args) {
		
		int[] inputArray = {0, -1, 2, -3, 1};
		
		ArrayList<ArrayList<Integer>> outputArray = findZeroTriplets(inputArray);
		for(int i=0;i<outputArray.size();i++){
			System.out.println(outputArray.get(i));
		}
	}

	private static ArrayList<ArrayList<Integer>> findZeroTriplets(int[] inputArray) {
		
		ArrayList<ArrayList<Integer>> outputList = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<inputArray.length-2;i++){
			LinkedHashSet<Integer> hmap = new LinkedHashSet<Integer>();
			for(int j=i+1;j<inputArray.length-1;j++){
				if(hmap.contains(-(inputArray[i] + inputArray[j])) && (hmap.toArray()[hmap.size()-1] == inputArray[i] + inputArray[j])){
					ArrayList<Integer> list = new ArrayList<Integer>();
					list.add(inputArray[i]);
					list.add(inputArray[j]);
					list.add(-(inputArray[i]+inputArray[j]));
					outputList.add(list);
					
					System.out.println("Size of list : " + list.size());
				}
				else
				{
					hmap.add(inputArray[j]);
				}
			}
		}
		
		return outputList;
	}
}