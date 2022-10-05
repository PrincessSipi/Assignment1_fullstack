abstract class Shapes
{
	float area;
	
	abstract void input();
	abstract void compute();
	void disp()
	{
		System.out.println("The area is " + area);
	}
}