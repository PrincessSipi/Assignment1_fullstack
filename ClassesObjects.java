class Laptop{

	// what the object knows (properties) variables
	// what the object does behaviour - methods

	String cpu;
	int ram;
	int hdd;

	public void doSomething(){
		System.out.println("Compiling");
		System.out.println(ram);
	}

	
}

class Test {

}

public class ClassesObjects {
	public static void main(String [] args){
		Laptop laptop = new Laptop();
		laptop.ram = 16;
		laptop.doSomething();
	}
}