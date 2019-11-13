
public class Stack {
	private Node top;
	

	public boolean isEmpty(){
		return (top == null);
	}
	public int peek(){
		return top.getData();
	}
	public void push(int data){
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
	}
	public int pop(){
		int data = top.getData();
		top = top.next;
		return data;
	}
	public void printStack(){
		Node current = top;
		while (current != null){
			System.out.println(current.getData());
			current = current.next;
			}
	}
	
	

}
