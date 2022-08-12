public class AssignmentFinala 
{
	public static void main(String [] args)
	{
		int n = 7;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(i); // Question 2
				
			}
			System.out.print("  ");
			for(int j = 0; j < n; j++)
			{
				if(j+i <= (n-1)/2 || j-i >= (n-1)/2 ||i == 0 || j== 0 || j == n-1 ) 
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
				if(i+j >= n+(n-1)/2|| i-j > (n-1)/2) // Question 4
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
				if(j+i <= (n-1)/2 || i-j >= (n-1)/2 ||i == 0 || i == n-1) //Question 5
				{
					System.out.print("*");
				//System.out.println("i is " + i + " when j is " + j);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	
	}
}

//System.out.print(i); q2
// j+i <= (n-1)/2 || j-i >= (n-1)/2 ||i == 0 || j== 0 || j == n-1 Assignment1 solution q3
//j+i <= (n-1)/2 || i-j >= (n-1)/2 ||i == 0 || i == n-1 Assignment1 solution q5
//i+j >= n+(n-1)/2|| i-j > (n-1)/2 Assignment1 solution q4
