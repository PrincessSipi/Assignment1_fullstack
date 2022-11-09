class Animal
{  
	void eat()
	{
	System.out.println("eating...");
	}  
} 
 
class Dog extends Animal
{  // Hierarchical Inheritance
	void bark()
	{
	System.out.println("barking...");
	}  
}  

class Cat extends Animal
{  // Hierarchical Inheritance
	void meow()
	{
		System.out.println("meowing...");
	}  
} 

 
class InheritExample2
{  
	public static void main(String args[])
	{  
		Cat c=new Cat();  
		c.meow();  
		c.eat();  
		//c.bark(); //Error
	}
}