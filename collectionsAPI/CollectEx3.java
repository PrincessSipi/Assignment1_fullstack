import java.util.*;


public class CollectEx3
{

	public static void main(String ... args)
	{
		PriorityQueue pq = new PriorityQueue();
		pq.add("Hello");
		pq.add("Me");

		System.out.println(pq);

		PriorityQueue pq3 = new PriorityQueue();
		pq3.add("Stick");
		pq3.add("Grass");
		pq3.add("Soil");

		PriorityQueue pq1 = new PriorityQueue();
		pq1.add(100);
		pq1.add(200);
		pq1.add(300);
		pq1.add(400);
		pq1.add(2);
		pq1.add(35);
		pq1.add(60);
		pq.addAll(pq3);

		System.out.println(pq1);

	}
}