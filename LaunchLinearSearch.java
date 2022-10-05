public class LaunchLinearSearch
{
	public static void main(String [] args)
	{
		// linear search algorithm
		int arr[] = {10, 20, 30, 40};
		int key = 50;

		for(int i = 0; i < arr.length; i++)
		{
			if(key == arr[i])
			{
				System.out.println("Key found in collection at index  " + i);
				System.exit(0); // if key found terminate search
			}
		
		}
		System.out.println("Key not found");
		
		
	}
}