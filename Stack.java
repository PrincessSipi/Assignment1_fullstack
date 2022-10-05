class Stack {
	private static int arr [];
	private static int top;
	private int capacity;

	// creating a stack
	Stack(int size){
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	// add elements into the stack
	public void push(int x){
		if(isFull()){
			System.out.println("Overflow \n Program Terminated\n");
			System.exit(1);
		}
		System.out.println("Inserting" + x);
		arr[++top] = x;
	}

	// Remove element from stack
	public int pop(){
		if(isEmpty()){
			System.out.println("STACK EMPTY");
			System.exit(1);
		}
		return arr[top--];
	}

	// utility function to return the size of the stack
	public int size(){
		return top + 1;

	}

	// check if the stack is empty
	public Boolean isEmpty(){
		return top == -1;
	}

	// check if the stack is full
	public Boolean isFull(){
		return top == capacity - 1;
	}

	// print the contents of the stack
	public  static void printStack(){
		for(int i = 0; i <= top; i++){
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args){

		Stack stack = new Stack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

		stack.pop();
		System.out.println("\n After popping out");

		Stack.printStack();

	}
}