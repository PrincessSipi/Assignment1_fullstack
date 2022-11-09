import java.util.*;


public class CollectEx4
{

	public static void main(String ... args)
	{
		TreeSet ts = new TreeSet();
		ts.add("Hello");
		ts.add("Me");

		System.out.println(ts);

		TreeSet ts3 = new TreeSet();
		ts3.add("Stick");
		ts3.add("Grass");
		ts3.add("Soil");

		TreeSet ts1 = new TreeSet();
		ts1.add(100);
		ts1.add(50);
		ts1.add(150);
		ts1.add(25);
		ts1.add(75);
		ts1.add(125);
		ts1.add(175);
		ts.addAll(ts3);

		System.out.println(ts1);

		TreeSet ts2 = new TreeSet();
		ts2.add(35);
		ts2.add(40);
		ts2.add(42);
		ts2.add(20);
		ts2.add(15);
		ts2.add(75);

		System.out.println(ts2.higher(20));
		System.out.println(ts2.ceiling(20));
		System.out.println(ts2.floor(19));
		System.out.println(ts2.lower(20));

	}
}