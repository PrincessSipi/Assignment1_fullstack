import java.util.*;

class Gen<T>
{
	T obj;
	Gen(T obj)
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

public class GenericsExample1
{
	public static void main(String [] args)
	{
		System.out.println();
		Gen<Integer> g = new Gen<Integer>(10);
		g.show();
		System.out.println(g.getObj());
		
		System.out.println();
		Gen<String> g1 = new Gen<String>("Yeah!!");
		g1.show();
		System.out.println(g1.getObj());
		
		System.out.println();
		Gen<Character> g2 = new Gen<Character>('C');
		g2.show();
		System.out.println(g2.getObj());

		
	}
}