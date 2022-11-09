import java.util.*;


public class GenericsExample
{
	public static void main(String [] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Navin Reddy");
		al.add("Govindra Singh");
		al.add("Akshata Reddy");
		al.add("Meena Abbas");
		//al.add(10); CE: Incompatible types int cannot be converted to String

		String firstName = al.get(0);
		String lastName  = al.get(1);
		System.out.println();

		System.out.println(firstName + " "+lastName);
		System.out.println();
		
		System.out.println(al);
		
		System.out.println();
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}
}