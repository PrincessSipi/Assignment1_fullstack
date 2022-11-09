import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.function.*;

public class Demo
{
	public static void main(String [] args)
	{
		List<Integer> nums = Arrays.asList(6,5,2,8,1,7,6,3,1,8,9,6,5);

		/*
		int result = nums.parallelStream()
			.filter(n -> n%2 ==1)
			.map(n -> n*2)
			.reduce(0,(c,e) -> c + e);

			System.out.println(result);
		*/

		Stream<Integer> stream = nums.stream(); // creates a new stream
		
		//stream.forEach(n -> System.out.print(n+ " "));
		/*
		Consumer<Integer> consumer = new Consumer<>() // implementing using inner class
		{
			@Override
			public void accept(Integer i)
			{
				System.out.println(i);
			}
		};
		stream.forEach(consumer);
		*/

		//Consumer<Integer> consumer = i -> System.out.println(i); // using lambda expression
		//stream.forEach(consumer);

		stream.forEach(i -> System.out.println(i)); //even better
	
		
	}
}