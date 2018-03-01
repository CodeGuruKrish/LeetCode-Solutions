package Trees;

public class LowestCommonAncestor {

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

		System.out.println("LCA = " + findLCA(rootNode, 3, 17));
	}

	private static int findLCA(TreeNode root, int left, int right) {

		if(root == null)
			return 0;
		
		System.out.println(root.data);

	
		if(root.data>left && root.data>right)
		{
			findLCA(root.left, left, right);
		}
		
		if(root.data<left && root.data<right)
		{
			findLCA(root.right, left, right);
		}

		return root.data;
	}
}