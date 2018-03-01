package LinkedList;

public class DoublyLinkedList {
	
	public DoublyLinkedList next;
	public DoublyLinkedList random;
	Object data;
	
	public DoublyLinkedList(Object num)
	{
		next = null;
		random = null;
		data = num;
	}
	
	public DoublyLinkedList getNext() {
		return next;
	}
	public void setNext(DoublyLinkedList next) {
		this.next = next;
	}
	public DoublyLinkedList getRandom() {
		return random;
	}
	public void setRandom(DoublyLinkedList random) {
		this.random = random;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}
