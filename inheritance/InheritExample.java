class Animal
{  
	void eat()
	{
	System.out.println("eating...");
	}  
}  

class Dog extends Animal
{  	//Single Inheritance
	void bark()
	{
	System.out.println("barking...");
	}  
}  

public class InheritExample
{  
	public static void main(String args[])
	{  
	Dog d=new Dog();  
	d.bark();  
	d.eat();  
	}
}