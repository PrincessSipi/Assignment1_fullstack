import java.util.*;

public class MapExample
{
	public static void main(String [] args)
	{
		HashMap hm = new HashMap();
		hm.put(10, "sachin");
		hm.put(18, "kohli");
		hm.put(17, "dhoni");
		hm.put(19, "dravid");
		hm.put(45, "rohit");
		
		Set mapData = hm.entrySet(); // to get the k,v data from Map
		Set s = hm.keySet(); // to get keys from Map
		Collection c = hm.values();  // to get values from Map

		System.out.println(hm); //hm.toString() will be called
		System.out.println(mapData);
		System.out.println(mapData.getClass().getName());
		
		System.out.println();
		System.out.println(s);
		System.out.println(s.getClass().getName());
		
		System.out.println();
		System.out.println(c);
		System.out.println(c.getClass().getName());

		System.out.println();
		Iterator itr = mapData.iterator();
		while(itr.hasNext())
		{
			Map.Entry data = (Map.Entry)itr.next();
			System.out.println(data.getKey() + ": " + data.getValue());
			if(data.getKey().equals(10))
			{
				data.setValue("SRT");
			}
		}
		System.out.println();
		System.out.println(hm);
	}
}