public class Launch
{
	public static void main(String [] args)
	{
		Rectangle1 r = new Rectangle1();
		Square1 s = new Square1();
		Circles1 c = new Circles1();

		Geometry g = new Geometry();
		g.permit(r);
		g.permit(s);
		g.permit(c);

	}
}