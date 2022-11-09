import java.util.*;


public class MapExample3
{
	public static void main(String [] args)
	{
		HashMap hm = new HashMap();
		
		// creating a key
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);

		// Adding data to the HashMap
		hm.put(i1, "sachin");
		hm.put(i2, "Messi");

		System.out.println(hm);

		IdentityHashMap ihm = new IdentityHashMap();
		
		// creating a key
		Integer i3 = new Integer(10);
		Integer i4 = new Integer(10);

		// Adding data to the HashMap
		ihm.put(i1, "sachin");
		ihm.put(i2, "Messi");

		System.out.println(ihm);
	}
}