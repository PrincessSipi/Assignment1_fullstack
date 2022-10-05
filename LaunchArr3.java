import java.util.Scanner;
import java.util.Arrays;

// requirement: to store marks of 3 schools, 2 classes and 3 students in each class.
public class LaunchArr3
{
	public static void main(String [] args)
	{
		int [][][] arr3 = new int[3][2][3];
		
		System.out.println(arr3.length);
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < arr3.length; i++)
		{
			for(int j = 0; j < arr3[i].length; j++)
			{
				for(int k = 0; k < arr3[i][j].length; k++)
				{
					System.out.println("Please enter the marks of school " + i + "class  " + i +" Students " + k);
				 	arr3[i][j][k] = scan.nextInt();
				}
			}
		}
		//System.out.println("arr3= " +Arrays.toString(arr));
		System.out.println("The student marks are as follows");
		for(int i = 0; i < arr3.length; i++)
		{
			 for(int j = 0; j < arr3[i].length; i++)
			 {
				for(int k = 0; k < arr3[i][j].length; k++)
				{
					System.out.print(arr3[i][j][k] + " ");
				}
			 }
			 System.out.println();
		}
	}
}