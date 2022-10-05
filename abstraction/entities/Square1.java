import java.util.Scanner;

class Square1 extends Shapes
{
	float len;
		
	void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter length of square");
		len = scan.nextFloat();
				
	}

	void compute()
	{
		area = len * len;
	}
}