package LinkedList;

public class DeepCopyLinkedListRandomPointer {

	public static void main(String[] args) {


		DoublyLinkedList ll = new DoublyLinkedList(10);

		ll.next = new DoublyLinkedList(20);
		ll.next.next= new DoublyLinkedList(30);
		ll.next.next.next = new DoublyLinkedList(40);
		ll.next.next.next.next= new DoublyLinkedList(50);

		/**
		 * Random pointer map
		 * 10 -> 30
		 * 20 -> 40
		 * 30 -> 50
		 * 40 -> 10
		 * 50 -> 20
		 */
		// Setting the arbitrary nodes

		//System.out.println("Current ll val  : " + ll.next.next.data );

		ll.random = ll.next.next;
		ll.next.random = ll.next.next.next;
		ll.next.next.random = ll.next.next.next.next;
		ll.next.next.next.random = ll;
		ll.next.next.next.next.random = ll.next;


		//		while(ll != null)
		//		{
		//			//System.out.println(ll.data);
		//			ll = ll.next;
		//		}

//		while(ll != null)
//		{
//			System.out.println(ll.random.data);
//			ll = ll.next;
//		}

		DoublyLinkedList clonedll = clone(ll);
		
		
		while(clonedll != null)
		{
			System.out.println(clonedll.data);
			clonedll = clonedll.next;
		}
	}

	private static DoublyLinkedList clone(DoublyLinkedList ll) {
		
		DoublyLinkedList ll2 = new DoublyLinkedList(ll.data);
		DoublyLinkedList temp;
		while(ll2!=null){
			temp=ll2.next;
			
			ll2.next = new DoublyLinkedList(ll.data);
		
			ll2.next.next = temp;

			ll2 = temp;

		}
		
		
		
		
		
		
			
		
		
		
		return ll2;
	}
}
