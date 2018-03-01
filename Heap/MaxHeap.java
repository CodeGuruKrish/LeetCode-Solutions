package Heap;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;

/**
 * Insert element 
 * Delete element
 * getMin(Peek)
 * 
 * @author Hithesh
 *
 */

public class MaxHeap {

	ArrayList<Integer> heapArray = new ArrayList<Integer>();
	
	public void insertElement(int input)
	{
		heapArray.add(input);
		heapifyUpwards();
	}
	
	public void deleteElement(int input)
	{
		//heapArray.remove(0);
		//heapArray.remove(index)
		
		heapifyDownwards();
	}
	
	public int poll()
	{
		if(heapArray.size() == 0)
			throw new IllegalArgumentException();
		
		int temp = heapArray.get(0);
		heapArray.set(0, heapArray.get(heapArray.size()-1));
		heapArray.remove(heapArray.size()-1);
		
		heapifyDownwards();
		
		return temp;
		
	}
	
	public int peek()
	{
		if(heapArray.size() == 0)
			throw new IllegalArgumentException();
		
		return heapArray.get(0);
	}
	
	private void heapifyUpwards(){
		
		int index = heapArray.size()-1;
		
		while(hasParent(index) && heapArray.get(parent(index)) < heapArray.get(index))
		{
			swap(parent(index), index);
			index = parent(index);
		}
	}
	
	private void heapifyDownwards(){
		
		int index = 0;
		
		while(hasLeftChild(index))
		{
			
			int bigChildIndex = leftChild(index);
			//System.out.println("bigChildIndex first:" + bigChildIndex);
			
			if(hasRightChild(index) && heapArray.get(rightChild(index)) > heapArray.get(leftChild(index)))
			{
				bigChildIndex = rightChild(index);
			}
				
			if(heapArray.get(index) > heapArray.get(bigChildIndex))
			{
				break;
			}
			else
			{
				swap(index, bigChildIndex);
			}
			
			index = bigChildIndex;
			//System.out.println("bigChildIndex last:" + bigChildIndex);
			
			//System.out.println("INdex  : " + index);
		}
	}
	
	private void swap(int parent, int index) {

		int temp = heapArray.get(index);
		heapArray.set(index, heapArray.get(parent));
		heapArray.set(parent, temp);
	}
	
	private int parent(int index)
	{
		if (index % 2 == 0)
			return (index/2)-1;
		else
			return index/2;
	}
	
	
	private int leftChild(int index)
	{
		return index*2+1;
	}
	
	
	private int rightChild(int index)
	{
		return index*2 + 2;
	} 
	
	private boolean hasLeftChild(int index)
	{
		 return leftChild(index) < heapArray.size()-1;

	}
	
	private boolean hasRightChild(int index)
	{
		return rightChild(index) < heapArray.size()-1;
	}
	
	private boolean hasParent(int index)
	{
		if(parent(index) >= 0)
		{
			return true;
		}
		
		return false;
	}
	
}
