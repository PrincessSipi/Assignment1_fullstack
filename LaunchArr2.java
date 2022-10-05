import java.util.Scanner;
import java.util.Arrays;

// requirement: to store marks of 3 classes' students each class with different number of students
public class LaunchArr2
{
	public static void main(String [] args)
	{
		int [][] arr2 = new int[3][];
		arr2[0] = new int[3];
		arr2[1] = new int[2];
		arr2[2] = new int[4];

		System.out.println(arr2.length);
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < arr2.length; i++)
		{
			for(int j = 0; j < arr2[i].length; j++)
			{
				System.out.println("Please enter the marks of class  " + i +" Students " + j);
				arr2[i][j] = scan.nextInt();
			}
		}
		//System.out.println("arr2 = " +Arrays.toString(arr));
		System.out.println("The student marks are as follows");
		for(int i = 0; i < arr2.length; i++)
		{
			 for(int j = 0; j < arr2[i].length; i++)
			 {
				System.out.print(arr2[i][j] + " ");
			 }
			 System.out.println();
		}
	}
}