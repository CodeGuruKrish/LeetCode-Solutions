package ArraysAndString;

public class NullifyMatrix {

	public static void main(String[] args) {
		int a[][] = {{1,0,1},{0,1,1},{1,1,1}}; 
		
		
		// Setting the a[0][j] and a[i][0] to zeroes as identifiers
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[0].length; j++)
			{
				if(a[i][j] == 0)
				{
					a[0][j] = 0;
					a[i][0] = 0;
				}
			}
		}
		
		for(int j=a[0].length-1; j>=0; j--)
		{
			for(int i=a.length-1; i>=0; i--)
			{
				a[i][j] = a[0][j] & a[i][0];
			}
		}
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[0].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
