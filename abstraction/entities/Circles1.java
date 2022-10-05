import java.util.Scanner;

class Circles1 extends Shapes
{
	float rad;
	final float pi = 3.14f;
	
	void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the radius of the circle");
		rad = scan.nextFloat();
				
	}

	void compute()
	{
		area = pi * rad * rad;
	}
}