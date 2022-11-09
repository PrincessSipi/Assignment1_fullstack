import java.util.*;


public class CollectEx
{
	public static void main(String [] args)
	{
		ArrayList a1 = new ArrayList();
		a1.add("Malaika");
		a1.add('c');
		a1.add(4);
		a1.add(25.5);

		System.out.println(a1);

		ArrayList a2 = new ArrayList();
		a2.add(10);
		a2.add(20);
		a2.add(30);
		a2.add(40);

		System.out.println(a2);

		a2.addAll(a1);
		System.out.println(a2);
		
		System.out.println(a2.contains(20));
		System.out.println(a2.get(4));
		boolean a = a2.isEmpty();
		System.out.println(a);

		int b = a2.size();
		System.out.println(b);

		System.out.println(a2.getClass());

		ArrayList a3 = new ArrayList();

		a3.add("Bengaluru");
		a3.add("India");
		a3.add(14);
		a3.add(25.5);

		System.out.println();
		System.out.println(a3);
		a3.clear();
		System.out.println(a3);
		boolean c = a3.isEmpty();
		System.out.println(c);

		System.out.println();
		a3.ensureCapacity(5);
		a3.add("Bengaluru");
		a3.add("India");
		a3.add(14);
		a3.add(25.5);
		a3.add(1, 45);
		System.out.println(a3);

		int d = a3.size();
		System.out.println(d);
		a3.trimToSize();
		System.out.println(a3);

		ArrayList a4 = new ArrayList();

		a4.add(100);
		a4.add(200);
		System.out.println();
		System.out.println(a4);
		a4.addAll(1, a3);
		System.out.println(a4);
		


		
	}
}