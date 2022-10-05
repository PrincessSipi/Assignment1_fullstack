public class LaunchFE
{
	public static void main(String [] args)
	{
		// 2d for each loop
		int arr[][] = {{10, 20, 30, 40}, {50, 60, 70, 80}};

		for(int ar[] : arr)
		{
			for(int element : ar)
			{
			System.out.print(element + " ");
			}
		System.out.println();
		}
	}
}