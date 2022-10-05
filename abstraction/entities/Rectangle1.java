import java.util.Scanner;

class Rectangle1 extends Shapes
{
	float len;
	float brd;

	
	void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter length of rectangle");
		len = scan.nextFloat();
		System.out.println("Please enter breadth of rectangle");
		brd = scan.nextFloat();
		
	}

	void compute()
	{
		area = len * brd;
	}
}