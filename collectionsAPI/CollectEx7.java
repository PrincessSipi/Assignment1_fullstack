import java.util.*;


public class CollectEx7
{
	public static void main(String [] args)
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(35);
		al.add(40);
		al.add(45);

		/*for(int i = 0; i<al.size() ; i++)
		{
			System.out.println(al.get(i));
			//al.add(99) //structural modification - leads to infinity loop- not failFast
		}
		*/
		

		System.out.println("***************Iterator***************");
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			//al.add(99); iterator ensures FailFast when structural modification is about to happen
		}


		System.out.println("****************FailSafe***************");
		CopyOnWriteArrayList cal = new CopyOnWriteArrayList();
		cal.add(100);
		cal.add(200);
		cal.add(300);	
		
		Iterator itr1 = cal.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
			cal.add(420);
		}	
	}
}