package Trees;

public class BuildMirror {

	public static void main(String[] args) {
		TreeNode rootNode1 = new TreeNode(10);

		TreeNode firstLeft1 = new TreeNode(5);

		TreeNode firstRight1 = new TreeNode(20);
		
		TreeNode firstRight1right = new TreeNode(200);

		rootNode1.left = firstLeft1;
		rootNode1.right = firstRight1;
		firstRight1.right = firstRight1right;

		TreeNode rootNode2 = buildmirror(rootNode1);

		//System.out.println(rootNode2.data);

		printTree(rootNode2);
	}

	private static void printTree(TreeNode rootNode2) {

		if(rootNode2!=null)
		{
			printTree(rootNode2.left);
			System.out.println(rootNode2.data);
			printTree(rootNode2.right);
		}
	}

	private static TreeNode buildmirror(TreeNode rootNode1) {

		if(rootNode1 == null)
			return null;

		TreeNode rootNode2 = new TreeNode(rootNode1.data);

		rootNode2.right = buildmirror(rootNode1.left);
		rootNode2.left = buildmirror(rootNode1.right);

		return rootNode2;
	}
}
