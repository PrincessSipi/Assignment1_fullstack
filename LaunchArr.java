import java.util.Scanner;
import java.util.Arrays;
public class LaunchArr
{
	public static void main(String [] args)
	{
		int [] a = new int[5];
		System.out.println(a.length);
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.println("Please enter the marks of " + i);
			a[i] = scan.nextInt();
		}
		System.out.println("a = " +Arrays.toString(a));
		//System.out.println("The student marks are as follows");
		// for(int i = 0; i < a.length; i++)
		//{
		//	System.out.print(a[i] + " ");
		//}
	}
}