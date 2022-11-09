import java.util.*;


public class CollectEx6
{
	public static void main(String [] args)
	{
		List l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		

		for(int i = 0; i<=l.size()-1; i++)
		{
			System.out.println(l.get(i));
		}

		// for each loop
		
		System.out.println("*****************************");

		for(Object o: l)
		{
			System.out.println(o);
		}


		System.out.println("*****************************");
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(200);
		ll.add("iNeuron");
		ll.add("Bengaluru");

		Iterator itr1 = ll.iterator();
		
		/*		
		while(itr1.hasNext())
		{
			try
			{
				//System.out.println(itr1.next());
				LinkedList o =(LinkedList)itr1.next();
				System.out.println(o);
			}
			catch(classCastExeption e)
			{
				e.printStackTrace();
			}
		}
		*/

		
		System.out.println("************ListIterator*****************");
		LinkedList ll1 = new LinkedList();
		ll1.add(100);
		ll1.add(200);
		ll1.add("iNeuron");
		ll1.add("Bengaluru");

		ListIterator ltr = ll1.listIterator(ll1.size());

		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}


		System.out.println("************descendingIterator*****************");
		LinkedList ll2 = new LinkedList();
		ll2.add(100);
		ll2.add(200);
		ll2.add("iNeuron");
		ll2.add("Bengaluru");

		Iterator ditr = ll2.descendingIterator();

		while(ditr.hasNext())
		{
			System.out.println(ditr.next());
		}

		

	}
}