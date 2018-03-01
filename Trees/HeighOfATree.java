package Trees;

public class HeighOfATree {
	
	public static void main(String[] args) {
		
		TreeNode rootNode = new TreeNode(10);
		
		TreeNode firstLeft = new TreeNode(5);
		
		TreeNode firstRight = new TreeNode(15);
		
		rootNode.left = firstLeft;
		rootNode.right = firstRight;
	    
	    System.out.println("height : " +  findHeight(rootNode));
	}

	private static int findHeight(TreeNode rootNode) {
	
		if(rootNode == null)
			return 0;
		
		int leftHeight = findHeight(rootNode.left) + 1;
		int rightHeight = findHeight(rootNode.right) + 1;
		
		return Math.max(leftHeight, rightHeight);
	}
}
