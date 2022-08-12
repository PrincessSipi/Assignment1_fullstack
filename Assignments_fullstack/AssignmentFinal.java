public class AssignmentFinal 
{
	public static void main(String [] args)
	{
		int n = 9;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if( i>= (n-1)/2 && j == (n-1)/2 || i == (n-1)/4 && j == (n-1)/2) 
				{
					System.out.print("*");
				//System.out.println("i is " + i + " when j is " + j);
				}
				else
				{
					System.out.print(" ");
				}		
						

			}
			System.out.print("  ");
			for(int j = 0; j < n; j++)
			{
				if(i == j || j == n-1 || j == 0) 
				{
					System.out.print("*");
				//System.out.println("i is " + i + " when j is " + j);
				}
				else
				{
					System.out.print(" ");
				}		
						

			}
			System.out.print("  ");
			for(int j = 0; j < n; j++)
			{
				if(j == 0 ||i == 0 && j != n-1 ||i == (n-1)/2 && j != n-1 || i == n-1 && j != n-1) 
				{
					System.out.print("*");
				//System.out.println("i is " + i + " when j is " + j);
				}
				else
				{
					System.out.print(" ");
				}		
						

			}
			System.out.print("  ");
			for(int j = 0; j < n; j++)
			{
				if(i == n-1 && j > 0 && j != n-1 && j != n-2 || j == 0 && i < n-1 && i != 0 || j == n-2 && i != n-1 && i != 0) 
				{
					System.out.print("*");
				//System.out.println("i is " + i + " when j is " + j);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");		
			
			for(int j = 0; j < n; j++)
			{
				if(j > (n-1)/2 && i == j || j == 0 || i == (n-1)/2 && j <= (n-1)/2 || i == 0 && j != 1 && j < (n-1)/2 || j == (((n-1)/2)+1) && i < (n-1)/2 && i > 0) 
				{
					System.out.print("*");
				//System.out.println("i is " + i + " when j is " + j);
				}
				else
				{
					System.out.print(" ");
				}		
						

			}
			System.out.print("  ");
			for(int j = 0; j < n; j++)
			{
				if(i == 0 && j > 1 && j < n-2 ||i == n-1 && j > 1 && j< n-2 || j == 0 && i != 0 && i != n-1 || j == n-1 && i != 0 && i != n-1) 
				{
					System.out.print("*");
				//System.out.println("i is " + i + " when j is " + j);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j = 0; j < n; j++)
			{
				if(i == j || j == n-1 || j == 0) 
				{
					System.out.print("*");
				//System.out.println("i is " + i + " when j is " + j);
				}
				else
				{
					System.out.print(" ");
				}		
						

			}
		
		System.out.println(" ");
			
		}
			
	
	}
}

// i>= (n-1)/2 && j == (n-1)/2 || i == (n-1)/4 && j == (n-1)/2 letter i q1 solution
//i == j || j == n-1 || j == 0 letter N
//j == 0 ||i == 0 && j != n-1 ||i == (n-1)/2 && j != n-1 || i == n-1 && j != n-1 letter E
//i == n-1 && j > 0 && j != n-1 && j != n-2 || j == 0 && i < n-1 && i != 0 || j == n-2 && i != n-1 && i != 0 letter U
//j > (n-1)/2 && i == j || j == 0 || i == (n-1)/2 && j <= (n-1)/2 || i == 0 && j != 1 && j < (n-1)/2 || j == (((n-1)/2)+1) && i < (n-1)/2 && i > 0 letter R
//i == 0 && j > 1 && j < n-2 ||i == n-1 && j > 1 && j< n-2 || j == 0 && i != 0 && i != n-1 || j == n-1 && i != 0 && i != n-1 letter O
