public class Runner
{
	public static void main(String [] args)
	{
		Queue queue = new Queue();
		queue.enQueue(5);
		queue.enQueue(3);
		queue.enQueue(4);	
		queue.enQueue(8);
		queue.enQueue(1);

		queue.show();
		queue.deQueue();

		queue.show();
		queue.deQueue();

		queue.show();
	}
}