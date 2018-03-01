package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.ListUI;

import org.w3c.dom.Node;


/**
 * Add word
 * Delete word
 * Search for a word
 * Give me related five words
 * @author Hithesh
 */

public class Dictionary {

	public static List<NaryNode> root = new ArrayList<NaryNode>();

	public static void main(String[] args) {

		addWord("li");
		addWord("like");
		addWord("limber");
		addWord("lice");
		addWord("line");
		addWord("balls");
		System.out.println("Added words:");
		printNaryTree(root);

		System.out.println("");
		System.out.println("After deletion words:");
		deleteWord("like");
		printNaryTree(root);
		
		System.out.println("");
		System.out.println("Give me related words:");
		returnMeList("l");

	}

	private static void addWord(String word)
	{
		char[] breakDown = word.toCharArray();

		if(containsWord(word) == null)
		{
			addToNaryTree(breakDown, root);
		}
	}

	private static void addToNaryTree(char[] breakDown, List<NaryNode> root) {

		List<NaryNode> nodeList = new ArrayList<NaryNode>();

		for(int i=0; i<breakDown.length; i++)
		{
			// createNode

			NaryNode node = new NaryNode(Character.toLowerCase(breakDown[i]), false, null);
			nodeList.add(node);
		}

		// Handling the case for just one character 

		if(nodeList.size() == 1)
		{
			nodeList.get(0).eow = true;
			nodeList.get(0).next = null;
			nodeList.get(0).ch = breakDown[0];

			root.add(nodeList.get(0));
		}

		//Now reference each

		for(int j=0; j<nodeList.size()-1; j++)
		{	
			if(j==0){
				root.add(nodeList.get(j));
			}

			nodeList.get(j).next = nodeList.get(j+1);

			if(j == nodeList.size()-2)
			{
				nodeList.get(j+1).eow = true;
			}
		}
	}

	private static void printNaryTree(List<NaryNode> root) {

		for(NaryNode node : root)
		{
			printInIteration(node);
		}
	}

	private static void printInIteration(NaryNode node) {

		System.out.print(node.ch);

		if(node.eow != true)
		{
			printInIteration(node.next);
		}
		else
		{
			System.out.println("");	
		}
	}

	private static void deleteWord(String word){

		if(!root.isEmpty())
		{	
			Iterator<NaryNode> iter = root.iterator();
			NaryNode toBeDeleted = containsWord(word);

			while(iter.hasNext())
			{
				NaryNode nNode = iter.next();

				if(nNode == toBeDeleted)
					iter.remove();
			}
		}
	}

	private static NaryNode containsWord(String word)
	{
		char[] charArray = word.toCharArray();

		for(NaryNode node : root)
		{
			NaryNode tempNode = node;

			if(node.ch == charArray[0])
			{
				for(int i=0; i<charArray.length; i++)
				{
					if(node.ch == charArray[i])
					{
						if(node.eow && charArray.length == i+1)
						{
							return tempNode;
						}
						else if (node.eow && i < charArray.length)
						{
							break;
						}

						node = node.next;
					}
				}
			}
		}
		return null;
	}
	
	private static void returnMeList(String word)
	{
		List<String> list = new ArrayList<String>();
	
		for(NaryNode node : root){
			String str ="";
			if(node.ch == word.charAt(0)){
				while(node!=null){
					str =  str+node.ch;
					node = node.next;
				}
				list.add(str);
			}
		}
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}
