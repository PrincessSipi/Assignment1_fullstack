import java.util.*;

class Demo<T extends Number>
{
	T obj;
 	Demo(T obj)
	{
		this.obj = obj;

	}

	public void show()
	{
		System.out.println("The type of object is: :" + obj.getClass().getName());
	}
	
	public T getObj()
	{
		return obj;
	}

}
class Trial<T extends Runnable>  //valid in generics you can extend an interface
{
	
}
/*
class Sample<T implements X> // invalid
{

}
*/

public class GenericsExample2
{
	public static void main(String [] args)
	{
		System.out.println();// valid
		Demo<Integer> d = new Demo<Integer>(10);
		d.show();
		System.out.println(d.getObj());

		System.out.println();// valid
		Demo<Double> d4 = new Demo<Double>(10.2);
		d4.show();
		System.out.println(d4.getObj());

		System.out.println();// valid
		Demo<Number> d5 = new Demo<Number>(10);
		d5.show();
		System.out.println(d5.getObj());
		
		/*
		System.out.println(); // invalid
		Demo<String> d1 = new Demo<String>("Yeah!!");
		d1.show();
		System.out.println(d1.getObj());
		
		System.out.println();// invalid
		Demo<Character> d2 = new Demo<Character>('C');
		d2.show();
		System.out.println(d2.getObj());
		*/

		Trial<Runnable> t1 = new Trial<Runnable>();  // valid
		Trial<Thread> t2 = new Trial<Thread>(); //valid
		//Trial<String> t3 = new Trial<String>(); // inavalid




		
	}
}