class Animal  // Multilevel inheritance
{  
	void eat()
	{
	System.out.println("eating...");
	}  
}  


class Dog extends Animal
{	  //Level 1 - Inheritance
	void bark()
	{	
		System.out.println("barking...");
	}  
}  


class BabyDog extends Dog
{  //Level 2 - Inheritance
	void weep()
	{
		System.out.println("weeping...");
	}  
}  


class InheritExample1
{  
	public static void main(String args[])
	{  
	BabyDog d=new BabyDog();  
	d.weep();  
	d.bark();  
	d.eat();  
	}
} 