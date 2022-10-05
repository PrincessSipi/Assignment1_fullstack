public class Assignment 
{
	public static void main(String [] args)
	{
		int n = 12;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(j+i == (n-1)/2 || i-j == (n-1)/2 || j-i == (n-1)/2 || i+j == n+(n-1)/2 || i == j || i + j == n-1 ||i == 0 || j== 0 || i == n-1 || j == n-1 ) 
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

//(i == n-1 || j == n-1 || i == 0 || j == 0) 
//j < i  prints right angled triangle
//j > i prints an inverted right angled triangle
//j >= n-1 prints column zero
//j >= (n-1)/2 prints half of the columns
//j == 0 prints column 0
//i == 0 prints row 0
//i >= n-1 prints the last row
//i < j && j <= (n-1)/2 prints half an inverted-right angled triangle
//j < i && j <= (n-1)/2 prints half a right angled triangle and the rest stars for the same number of columns
//j < i && i <= (n-1)/2 prints a small right angled triangle

//i == 0 || j== 0 || i == n-1 || j == n-1 prints a rectangle(empty)
//j== 0 || i == (n-1)/2 || j == n-1 prints H
//j== 0 || i == (n-1)/2 || j == n-1 || i == 0 rectangular A
//i == (n-1)/2 || i == 0 && j !=0 && j != n-1 || j == 0 && i != 0 || j == n-1 && i != 0 the letter A
//j < (n-1)/2 && i < j inverted wedge
//j == 0 || i == 0 && j < n-1 || j == n-1 && i > 0 && i != n-1 || i == n-1 && j != n-1 prints the letter D
//i==j diagonal line 1
//i+j == n-1 prints diagonal line 2
//i+j == n-1 || i == j || i == 0 || j == 0 || j == n-1 || i == n-1 rectangle with two diagonal lines inside
//n-1)/2 || i-j == (n-1)/2 || j-i == (n-1)/2 || i+j == n+(n-1)/2 prints a diamond
//n-1)/2 || i-j == (n-1)/2 || j-i == (n-1)/2 || i+j == n+(n-1)/2 || i == j || i + j == n-1 ||i == 0 || j== 0 || i == n-1 || j == n-1 diamond pattern inside rectangle

//j < i && i > (n-1)/2 || j > i && i < (n-1)/2 prints a filled K shape i < j && j < n/2 && i < n/2 ||i > j && j >= n/2 
//i == 0 || j== 0 || i == n-1 || i < j && j < n/2 && i < n/2 ||i > j && j >= n/2 somewhat assignment solution
//i < j && j <= (n-1)/2 || j > (n-1)/2 && i != j
//i > j && j >= (n-1)/2 prints a right angled triangle at the bottom of the pattern
//j >= i && i <= (n)/2 prints right angled wedge
// i < j && j < n/2 prints top inverted wedge
//i == 0 || j== 0 || i == n-1 prints 3 sides of an empty rectangle