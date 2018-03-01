package ArraysAndString;

public class KMP {

	public static void main(String[] args) {
		String text = "ABABDABACDABABCABAB";
		String pattern = "ABABCABAB";
		if(kmp(text, pattern))
			System.out.println("True");
		else
			System.out.println("False");
	}

	private static boolean kmp(String text, String pattern) {
		int[] prefix = prefix(pattern);
		int j=0,i=0;
		while(i<text.length() && j<pattern.length()){
			if(text.charAt(i) == pattern.charAt(j)){
				i++;
				j++;
			}
			else if(j!=0){
				j = prefix[j-1];
			}
			else{
				i++;
			}
		}
		
		if(j==pattern.length())
			return true;
		else
			return false;
	}

	private static int[] prefix(String pattern) {
		int[] temp = new int[pattern.length()];
		temp[0] = 0;
		int j=0, i=1;
		while(i<pattern.length()){
			if(pattern.charAt(i)==pattern.charAt(j)){
				temp[i] = j+1;
				i++;
				j++;
			}
			else if(j!=0){
				j = temp[j-1];			
			}
			else
			{
				temp[i] = 0;
				i++;
			}
		}
		return temp;
	}

}
