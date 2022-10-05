class Alien{

	// what the object knows (properties) variables
	// what the object does behaviour - methods

	int age;

	public void show(){
		int num;
		num = 2;
		System.out.println(age); // instance variable
		
	}

	void disp(){
		System.out.println(age); // instance variable
		
	}
	
}

class Test {

}

public class Variables {
	public static void main(String [] args){
		Alien alien = new Alien();
		alien.show();
		
	}
}