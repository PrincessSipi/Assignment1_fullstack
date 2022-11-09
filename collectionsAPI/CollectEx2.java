import java.util.*;


public class CollectEx2
{
	public static void main(String ... args)
	{
		ArrayDeque ad = new ArrayDeque();
		ad.add(5);
		ad.add("Hello");
		ad.add('C');
		ad.add(25.10);

		ad.addFirst("Hiya");
		ad.addLast("Bye");
		
		System.out.println(ad);
		
		ArrayDeque ad1 = new ArrayDeque();
		ad1.add(200);
		ad1.add("Miya");
		ad1.add('D');
		ad1.add(25.10);
		ad.addAll(ad1);
		
		System.out.println(ad);

	}
}