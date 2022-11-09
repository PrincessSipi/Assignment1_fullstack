import java.util.HashSet;
import java.util.LinkedHashSet;

public class CollectEx5
{

	public static void main(String ... args)
	{
		HashSet hs = new HashSet();
		hs.add("Hello");
		hs.add("Me");

		System.out.println(hs);

		HashSet hs3 = new HashSet();
		hs3.add("Stick");
		hs3.add("Grass");
		hs3.add("Soil");

		HashSet hs1 = new HashSet();
		hs1.add(100);
		hs1.add(50);
		hs1.add(150);
		hs1.add(25);
		hs1.add(75);
		hs1.add(125);
		hs1.add(175);
		hs.addAll(hs3);

		if(hs1.contains(125))
		{
			System.out.println("In HashSet 125 is present");
		}
		else
		{
			System.out.println("Data not available");
		}

		System.out.println(hs1);
		System.out.println(hs);


		if(!hs1.contains(30))
		{
			System.out.println("In HashSet 30 is not present");
		}
		else
		{
			System.out.println("Data available");
		}

		LinkedHashSet lhs2 = new LinkedHashSet();
		lhs2.add(35);
		lhs2.add(40);
		lhs2.add(42);
		lhs2.add(20);
		lhs2.add(15);
		lhs2.add(75);

		System.out.println(lhs2);
		//System.out.println(hs2.ceiling(20));
		//System.out.println(hs2.floor(19));
		//System.out.println(hs2.lower(20));

	}
}