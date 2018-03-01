package Trees;

public class CheckMirrorImageEquality {
	
public static void main(String[] args) {

	
	TreeNode rootNode1 = new TreeNode(10);
	
	TreeNode firstLeft1 = new TreeNode(20);
	
	TreeNode firstRight1 = new TreeNode(5);
	
	TreeNode firstRight1right = new TreeNode(6);

	rootNode1.left = firstLeft1;
	rootNode1.right = firstRight1;
	firstRight1.right = firstRight1right;
	

	TreeNode rootNode2 = new TreeNode(10);
	
	TreeNode firstLeft2 = new TreeNode(5);
	
	TreeNode firstRight2 = new TreeNode(20);
	
	TreeNode firstLeft2left = new TreeNode(6);
	
	rootNode2.left = firstLeft2;
	rootNode2.right = firstRight2;
	firstLeft2.left = firstLeft2left;

	
	if (checkIfMirrorEqual(rootNode1, rootNode2))
	{
		System.out.println("Equal");
	}
	else
	{
		System.out.println("Not Equal");
	}
}

private static boolean checkIfMirrorEqual(TreeNode rootNode1, TreeNode rootNode2) {
	if(rootNode1 == null && rootNode2 == null)
	{
		return true;
	}
	
	if(rootNode1!=null && rootNode2!=null)
	{
		return (rootNode1.data == rootNode2.data && checkIfMirrorEqual(rootNode1.left, rootNode2.right) && 
				checkIfMirrorEqual(rootNode1.right, rootNode2.left));
	}
	
	return false;
}

}
