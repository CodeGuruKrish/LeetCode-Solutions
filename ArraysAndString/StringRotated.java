package ArraysAndString;

public class StringRotated {

	public static void main(String[] args) {

		String first = "waterbottle";

		String second = "erbottlewat";

		if(checkIfRotated(first, second))
			System.out.println("Rotated");
		else
			System.out.println("Not Rotated");
	}

	private static boolean checkIfRotated(String first, String second) {

		if(first.length() == 0 || second.length() == 0)
			return false;

		if(first == null || second == null)
			return false;

		if(first.length() != second.length())
		{
			return false;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(second).append(second);
		
		return sb.toString().toLowerCase().contains(first.toLowerCase());
	}
}