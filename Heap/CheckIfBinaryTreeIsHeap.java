package Heap;

import Trees.TreeNode;

public class CheckIfBinaryTreeIsHeap {

	public static void main(String[] args) {

		TreeNode rootNode = new TreeNode(50);

		TreeNode firstLeft = new TreeNode(25);

		TreeNode firstRight = new TreeNode(30);

		TreeNode secondLeftLeft = new TreeNode(20);

		TreeNode secondLeftRight = new TreeNode(15);

		TreeNode secondRightLeft = new TreeNode(10);

		TreeNode secondRightRight = new TreeNode(5);


		rootNode.left = firstLeft;
		rootNode.right = firstRight;

		firstLeft.left = secondLeftLeft;
		firstLeft.right = secondLeftRight;

		//firstRight.left = secondRightLeft;
		firstRight.right = secondRightRight;


		//printElements(rootNode);

		if(CheckIfHeap(rootNode))
		{
			System.out.println("Its a heap");
		}
		else
		{
			System.out.println("Its not a heap");
		}

	}

	private static int countNodes(TreeNode rootNode)
	{

		if(rootNode == null)
			return 0;

		return(1 + countNodes(rootNode.left) + countNodes(rootNode.right));
	}

	private static boolean checkIfCompleteTree(TreeNode rootNode, int index, int nodeNumber)
	{
		if(rootNode == null)
			return true;
		
		if(index >= nodeNumber)	
		{
			return false;
		}
		
		return(checkIfCompleteTree(rootNode.left, 2*index+1, nodeNumber) && checkIfCompleteTree(rootNode.right, 2*index+2, nodeNumber));
	}

	private static boolean isHeapUtil(TreeNode rootNode)
	{
		//base case
		if(rootNode.left == null && rootNode.right == null)
			return true;

		// If only child is left child
		if(rootNode.right == null)
		{
			//  check heap property at Node
			//  No recursive call , because no need to check last level
			return rootNode.getData() >= rootNode.left.getData();
		}
		else
		{
			if(rootNode.left.getData() <= rootNode.getData() && rootNode.right.getData() <= rootNode.getData())
			{
				return (isHeapUtil(rootNode.left) && isHeapUtil(rootNode.right));
			}
			else
			{
				return false;
			}
		}
	}

	private static boolean CheckIfHeap(TreeNode rootNode) {

		// Check if children elements are lesser than parent 
		// If single child element - It should be on left
		// If child element are two then it should be on the left parent

		int nodeCount = countNodes(rootNode);


		return (checkIfCompleteTree(rootNode, 0, nodeCount) && isHeapUtil(rootNode));
	}

	private static void printElements(TreeNode rootNode) {

		// Preorder traverse 
		if(rootNode != null)
		{
			System.out.println(rootNode.getData());
			printElements(rootNode.left);
			printElements(rootNode.right);
		}

	}

}
