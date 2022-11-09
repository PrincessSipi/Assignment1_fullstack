class Calc
{
	public int add(int ... nums) // var-args in action
	{
		int sum =0;
		for(int num : nums)
		{
			sum += num;
		}
		return sum;
	}

	/*public int add(int nums [])
	{
		int sum =0;
		for(int num : nums)
		{
			sum += num;
		}
		return sum;
	}
	**/

	/*public int add(int x, int y, int z)
	{
		return x + y + z;
	}
	**/
}


public class VarArgExample
{
	public static void main(String ... args)
	{
		Calc obj = new Calc();

		int nums [] = {6, 5, 7, 8, 9};		

		int result = obj.add(nums);
		System.out.println(result);

		//int result2 = obj.add(6,6,7);
		//System.out.println(result2);
	}
}
