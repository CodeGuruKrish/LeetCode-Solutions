package BinaryTree;

public class BinaryTree {
	
	Node root;
	
	boolean isBST(Node root)
	{
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isBST(Node root2, int minValue, int maxValue) {
		
		if (root2 == null)
			return true;
		
		if(root2.data < minValue || root2.data > maxValue)
			return false;
		
		return(isBST(root2.left, minValue, root2.data-1) && isBST(root2.right, root2.data+1, maxValue));
	}
}
