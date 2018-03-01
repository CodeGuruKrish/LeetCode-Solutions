package Trees;

public class NaryNode {
	
	char ch;
	boolean eow;
	NaryNode next;
	
	public NaryNode(char character, boolean eoword, NaryNode nextChar) {
		
		this.ch = character;
		this.eow = eoword;
		this.next = nextChar;
	}
	
	public char getCh() {
		return ch;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}
	public boolean isEow() {
		return eow;
	}
	public void setEow(boolean eow) {
		this.eow = eow;
	}
	public NaryNode getNext() {
		return next;
	}
	public void setNext(NaryNode next) {
		this.next = next;
	}
}
