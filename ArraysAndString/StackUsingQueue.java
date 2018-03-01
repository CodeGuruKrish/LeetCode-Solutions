package ArraysAndString;

import java.util.LinkedList;

public class StackUsingQueue {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		
		System.out.println(ll.peekFirst());
	}
}