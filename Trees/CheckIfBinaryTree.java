package Trees;

public class CheckIfBinaryTree {

	public static void main(String[] args) {

		TreeNode rootNode = new TreeNode(10);

		TreeNode firstLeft = new TreeNode(10);

		TreeNode firstRight = new TreeNode(10);

		TreeNode secondLeftLeft = new TreeNode(3);

		TreeNode secondLeftRight = new TreeNode(7);

		TreeNode secondRightLeft = new TreeNode(13);

		TreeNode secondRightRight = new TreeNode(17);


		rootNode.left = firstLeft;
		rootNode.right = firstRight;

		firstLeft.left = secondLeftLeft;
		firstLeft.right = secondLeftRight;

		firstRight.left = secondRightLeft;
		firstRight.right = secondRightRight;

		if(checkIfBinaryTree(rootNode, Integer.MIN_VALUE, Integer.MAX_VALUE))
			System.out.println("Its binary");
		else
			System.out.println("Not binary");
	}
	
	

	private static boolean checkIfBinaryTree(TreeNode rootNode, int min, int max) {

		if(rootNode == null)
			return true;

		if(rootNode.data < min || rootNode.data > max)
		{
			return false;
		}
		
		return(checkIfBinaryTree(rootNode.left, min, rootNode.data-1) && 
				checkIfBinaryTree(rootNode.right, rootNode.data+1, max));
	}

}
