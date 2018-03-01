package Trees;

public class CheckSameTree {
		
	public static void main(String[] args) {
		
		TreeNode rootNode1 = new TreeNode(10);
		
		TreeNode firstLeft1 = new TreeNode(5);
		
		TreeNode firstRight1 = new TreeNode(20);

		rootNode1.left = firstLeft1;
		rootNode1.right = firstRight1;
		

		TreeNode rootNode2 = new TreeNode(10);
		
		TreeNode firstLeft2 = new TreeNode(5);
		
		TreeNode firstRight2 = new TreeNode(20);
		
		rootNode2.left = firstLeft2;
		rootNode2.right = firstRight2;
		
		if (checkIfEqual(rootNode1, rootNode2))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		
	}

	private static boolean checkIfEqual(TreeNode rootNode1, TreeNode rootNode2) {
		
		if(rootNode1 == null && rootNode2 == null)
		{
			return true;
		}
		
		if(rootNode1!=null && rootNode2!=null)
		{
			return (rootNode1.data == rootNode2.data && checkIfEqual(rootNode1.left, rootNode2.left) && 
			checkIfEqual(rootNode1.right, rootNode2.right));
		}
		
		return false;
	}
}
