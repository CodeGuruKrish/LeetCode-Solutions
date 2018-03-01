package ArraysAndString;

import java.util.HashSet;

import Heap.MaxHeap;;

public class MaximizeArray {
	
	public static void main(String[] args) {
		
		// Given two arrays get the result array with the maximum numbers on both the input arrays. Mind that the
		// size of the result array should be the same as the given array
		// https://practice.geeksforgeeks.org/problems/maximize-the-array/0
		
		int inputArray1[] = {7, 4, 8, 0, 1};
		int inputArray2[] = {9, 7, 2, 3 ,6};
		
		int[] maximizedArray = maxmimizeArray(inputArray1, inputArray2);
		
		for(int i:maximizedArray)
			System.out.println(i);
	}

	private static int[] maxmimizeArray(int[] inputArray1, int[] inputArray2) {

		MaxHeap heap = new MaxHeap();
		HashSet<Integer> set = new HashSet<Integer>();
		int[] outputArray = new int[inputArray1.length];
		
		for(int input: inputArray1)
		{
			set.add(input);
		}
		
		for(int input: inputArray2)
		{
			set.add(input);
		}
		
		// Add to heap
		for(Integer curr : set)
		{
			heap.insertElement(curr);
		}
		
		for(int i=0; i<inputArray1.length; i++)
		{
			outputArray[i] = heap.poll();
		}
		
		return outputArray;
	}

	
}
