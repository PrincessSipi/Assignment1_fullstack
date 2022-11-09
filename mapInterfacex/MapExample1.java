import java.util.*;


public class MapExample1
{
	public static void main(String [] args)
	{
		HashMap hp = new HashMap();
		hp.put(null,0);
		hp.put(null, null);
		hp.put(null, "ABC");
		/*hp.put();
		hp.put();
		hp.put();
		*/
		Set mapData = hp.keySet();

		Iterator itr = mapData.iterator();
		while(itr.hasNext())
		{
			Map.Entry data = (Map.Entry)itr.next();
			System.out.println(data.getKey() + ": "+ data.getValue());
		}
	}
}