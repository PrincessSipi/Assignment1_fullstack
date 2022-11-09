import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.function.*;

public class Demo1
{
	public static void main(String [] args)
	{
		List<Integer> nums = Arrays.asList(6,5,2,8,1,7,6,3,1,8,9,6,5);
		/*
		Predicate<Integer> predicate = new Predicate<>()
		{
			@Override
			public boolean test(Integer n)
			{
				if(n % 2 == 1)
					return true;
				else
					return false;
			}
		};
		*/

		//Predicate<Integer> predicate =  n -> n % 2 == 1; // implementing the predicate interface to use with filter()

		/*
		Function<Integer, Integer> func = new Function<Integer, Integer>()
		{
			@Override
			public integer apply(Integer n)
			{
				return n * 2;
			}

		};
		*/	
		//Function<Integer, Integer> func = n -> n * 2;	// implementing the function interface to use with map()
		
		/*
		BinaryOperator<Integer>bin = new BinaryOperator<>()
		{
			@Override
			public Integer apply(Integer s, Integer e)
			{
				System.out.println(s + " + " + e);
				return s + e;
			}
		};
		*/
		
		//BinaryOperator<Integer>bin = (s,e) -> s + e; // implementing the BinaryOperator interface for use with reduce()
			

		//Stream<Integer> stream = nums.stream(); // creates a new stream

		//Stream<Integer> stream1 = stream.filter(predicate);
		/*
		Stream<Integer> stream1 = stream.filter(n -> n % 2 == 1);
		Stream<Integer> stream2 = stream1.map( n -> n * 2);
		int result = stream2.reduce(0,(s,e) -> s + e);

		System.out.println(result);
		*/
		

		// Intermediate and terminate functions.
 
		int result = nums.stream()
			.filter(n -> n % 2 == 1)
			.map( n -> n * 2)
			.reduce(0,(s,e) -> s + e);
		
		System.out.println(result);

		//stream2.forEach(i -> System.out.println(i)); //consumer object parameter using Lambda
	
		
	}
}