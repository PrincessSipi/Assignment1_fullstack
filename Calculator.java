class Calc{
	//Methods
	// what the object knows (properties) variables
	// what the object does behaviour - methods

	int num1, num2;

	public void add(){
		num1 = 10;
		num2 = 20;
		int c = num1 + num2;
		System.out.println(c); 
		
	}

	// Method overloading
	public void add(int a, int b){
		int c = a + b;
		System.out.println(c); //local variable
		
	}
	

	public int addition(int a, int b){
		int c = a + b;
		return c;
		
	}
}


public class Calculator {
	public static void main(String [] args){
		Calc calc = new Calc();
		Calc calc1 = new Calc();
		Calc calc2 = new Calc();
		calc.add();
		calc1.add(2, 5);
		int result = calc2.addition(10, 5);
		System.out.println(result);
		
	}
}