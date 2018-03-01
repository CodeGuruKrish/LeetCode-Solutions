package ArraysAndString;

import java.util.Stack;

public class ConvertToBinary {
	
	public static void main(String[] args) {
		
		int input = 6;
		
	 ConvertToBinary(input);
		
	}
	
	private static void ConvertToBinary(int input)
	{
		int q=input,rem,ans;
		Stack<Integer> s = new Stack<Integer>();
		while(q!=0){
			rem = q%2;
			q = q/2;
			s.push(rem);
		}
		
		while(!s.isEmpty())
			System.out.println(s.pop());
		
	}

}
