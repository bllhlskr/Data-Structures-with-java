
public class StackTest {
	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push(5);
		s.push(15);
		s.push(12);
		s.printStack();
		s.pop();
		System.out.println();
		s.printStack();
		System.out.println();
		s.peek();
		System.out.println();
		
		Queue q = new Queue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.PrintQueue();
		q.remove();
		System.out.println();
		q.PrintQueue();
	}

}
