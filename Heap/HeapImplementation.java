package Heap;

public class HeapImplementation {
	
	public static void main(String[] args) {
		
		MaxHeap heap = new MaxHeap();
		
		heap.insertElement(7);
		heap.insertElement(6);
		heap.insertElement(5);
		heap.insertElement(4);
		heap.insertElement(3);
		heap.insertElement(2);
		heap.insertElement(1);
		
		System.out.println(heap.poll());
		
		System.out.println(heap.peek());
	}

}
