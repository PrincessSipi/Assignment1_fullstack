import java.util.Scanner;



class UnderAgeException extends Exception
{
	UnderAgeException(String msg)
	{
		super(msg);
	}
}

class OverAgeException extends Exception
{
	OverAgeException(String msg)
	{
		super(msg);
	}
}

class LicenceApplication
{

	private int age;
	public void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age to check eligibility");
		age = scan.nextInt();
	}

	public void verify() throws OverAgeException, UnderAgeException
	{
		if(age >= 18 && age <= 60)
		{
			System.out.println("You're eligible");
		}
		else if(age < 18)
		{
			throw new UnderAgeException("You're not eligible");
		}
		else if(age > 60)
		{
			throw new OverAgeException("You're not eligible");
		}
	}
}

class RTO
{
	void initiate()
	{
		LicenceApplication la = new LicenceApplication();
		try
		{
			la.input();
			la.verify();
		}
		catch(UnderAgeException a)
		{
			System.out.println(a.getMessage());
			try
			{
				la.input();
				la.verify();
			}
			catch(UnderAgeException b)
			{
				System.out.println(b.getMessage());
				System.out.println("You're under age, please try when you turn 18");
				System.exit(0);
			}
			catch(OverAgeException c)
			{
				System.out.println(c.getMessage());
				System.out.println("You're over the age limit for eligibility");
				System.exit(0);
			}
		}
		catch(OverAgeException oae )
		{	
			System.out.println(oae.getMessage());
			try
			{
				la.input();
				la.verify();
			}
			catch(UnderAgeException b)
			{
				System.out.println(b.getMessage());
				System.out.println("You're under age, please try when you turn 18");
				System.exit(0);
			}
			catch(OverAgeException c)
			{
				System.out.println(c.getMessage());
				System.out.println("You're over the age limit for eligibility");
				System.exit(0);
			}	
		}
		
	}
}

public class ExceptionExample11
{
	public static void main(String [] args)
	{
		RTO r = new RTO();
		r.initiate();
	}
}