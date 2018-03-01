package Trees;

public class printKthNodes {
	
	
	public static void main(String[] args) {
		
		TreeNode rootNode = new TreeNode(10);
		
		TreeNode firstLeft = new TreeNode(5);
		
		TreeNode firstRight = new TreeNode(15);
		
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
	    
	 
	    printKthNodes(rootNode, 2);
	    //printcolnumber(rootNode, 2,0);
	    
	}

	private static void printcolnumber(TreeNode rootNode, int level, int root) {
		// TODO Auto-generated method stub
		if(rootNode==null)
			return;
		if(Math.abs(root)==level){
			System.out.println(rootNode.data);
		}
		else
		{
		    printcolnumber(rootNode.left,level,root+1);
		    printcolnumber(rootNode.right,level,root-1);
		}
		
			
		
	}

	private static void printKthNodes(final TreeNode rootNode, final int i) {
		
		if(rootNode == null)
			return;
		
		if(i == 0)
		{
			System.out.println(rootNode.data);
		}
		else
		{
			printKthNodes(rootNode.left, i-1);
			printKthNodes(rootNode.right, i-1);
		}
	}
}
