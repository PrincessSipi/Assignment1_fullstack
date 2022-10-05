import java.util.Scanner;
import java.util.Arrays;

// requirement: to store marks of 3 classes' students each class with 4 students
public class LaunchArr1
{
	public static void main(String [] args)
	{
		int [][] arr = new int[3][4];
		System.out.println(arr.length);
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.println("Please enter the marks of class  " + i +" Students " + j);
				arr[i][j] = scan.nextInt();
			}
		}
		//System.out.println("arr = " +Arrays.toString(arr));
		System.out.println("The student marks are as follows");
		for(int i = 0; i < arr.length; i++)
		{
			 for(int j = 0; j < arr[i].length; i++)
			 {
				System.out.print(arr[i][j] + " ");
			 }
		}
	}
}