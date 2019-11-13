
public class Queue {
	private Node head;//remove 
	private Node tail;//add things here
	
	public Queue(){
		head = null;
		tail = null;
	}
	public boolean isEmpty(){
		return (head == null);
	}
	public int peek(){
		return head.getData();
	}
	public void add(int data){
		Node newNode = new Node(data);
		if(tail != null){
			tail.next = newNode;
		}
		tail = newNode;
		if(head == null)
			head = newNode;
		
	}
	public int remove(){
		int data = head.getData();
		head = head.next;
		
		if(head == null)
			tail = null;
		return data;
	}
	public void PrintQueue(){
		Node current = head;
		do {
			System.out.println(current.getData());
			current = current.next;
		} while (current != tail.next);
	}
	
	

}
