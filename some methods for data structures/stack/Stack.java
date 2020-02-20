package stack;

public  class Stack {
	public static int[] stackArray;
	public static int size;
	public static int top;

	public Stack() {
		size = 10;
		stackArray = new int[10];
		top = 0;
	}

	public Stack(int newSize) {
		if (newSize <= 0)
			size = 10;
		else
			size = newSize;
		stackArray = new int[size];
		top = 0;
	}

	public static  void initializeStack() {
		top = 0;
	}

	public static boolean isEmpty() {
		return (top == 0);
	}

	public static boolean isFull() {
		return (top == size);
	}

	public static boolean push(int newItem) {
		if (!isFull()) {
			stackArray[top] = newItem;
			top++;
			return true;
		} else
			return false;
	}

	public static int pop() {
		if (!isEmpty()) {
			top--;
			return stackArray[top];
		} else
			return 0;
	}

	public static int top() {
		assert (top == 0);
		return stackArray[top - 1];
	}

	public static void outputStack() {
		if (top != 0)
			for (int i = top - 1; i >= 0; i--)
				System.out.println(stackArray[i]);
	}
	
	public static int findMinimum() {
		int max = 0;
		if(isEmpty()){

			System.out.println("stack is empty");
		}else{

			for (int i = top - 1; i >= 0; i--){
				if(stackArray[i]>max){
					max = stackArray[i];
				}

			}
			    
			
		}
		return max;
		
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		System.out.println("--Before pushing elements--");
		s.outputStack();
		System.out.println();
		s.push(110);
		s.push(15);
		s.push(160);
		s.push(802);
		s.push(50);
		System.out.println("--After pushing elements--");
		s.outputStack();
		System.out.println("Top: " + s.top);
		System.out.println("halis kara "+ findMinimum());
		
	}
}