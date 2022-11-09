import java.util.*;

public class MapExample2
{
	public static void main(String [] args)
	{
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(10, "sachin");
		lhm.put(18, "kohli");
		lhm.put(17, "dhoni");
		lhm.put(19, "dravid");
		lhm.put(45, "rohit");
		
		Set mapData = lhm.entrySet(); // to get the k,v data from Map
		Set s = lhm.keySet(); // to get keys from Map
		Collection c = lhm.values();  // to get values from Map

		System.out.println(lhm); //lhm.toString() will be called
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
		System.out.println(lhm);
	}
}