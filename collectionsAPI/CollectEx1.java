import java.util.*;

public class CollectEx1
{

	public static void main(String [] args)
	{
		LinkedList ll = new LinkedList();
		ll.add(41);
		ll.add("Numa");
		ll.add('F');
		ll.add("Scotland");

		System.out.println(ll);

		ll.add(2, 70);
		System.out.println(ll);

		ll.addFirst(500);
		ll.addLast("London");

		System.out.println(ll);

		LinkedList ll1 = new LinkedList();
		ll1.add(700);
		ll1.add("Karma");
		ll1.offer("Bengaluru");

		System.out.println(ll1);


		
	}
}