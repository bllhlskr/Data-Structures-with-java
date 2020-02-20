package queue;

import java.util.Stack;

public class Queue {

	private static  int[] queueArray;
	private static  int size;
	private static  int front;
	private static  int rear;
	private static  int count;

	public Queue() {
		size = 10;
		queueArray = new int[size];
		front = 0;
		rear = size - 1;
		count = 0;
	}
	
	public Queue(int newSize) {
		if (newSize <= 0)
			size = 10;
		else
			size = newSize;
		queueArray = new int[10];
		front = 0;
		rear = size - 1;
		count = 0;
	}

	public static boolean isEmpty() {
		return (count == 0);
	}

	public boolean isFull() {
		return (count == size);
	}

	public void initializeQueue() {
		front = 0;
		rear = size - 1;
		count = 0;
	}

	public int getFront() {
		assert (!isEmpty());
		return queueArray[front];
	}

	public int getRear() {
		assert (!isEmpty());
		return queueArray[rear];
	}

	public void addQueue(int newElement) {
		if (!isFull()) {
			rear = (rear + 1) % size;
			count++;
			queueArray[rear] = newElement;
		} else
			System.out.println("Queue is full!");
	}

	public void deleteQueue() {
		if (!isEmpty()) {
			count--;
			front = (front + 1) % size;
		} else
			System.out.println("Queue is empty!");
	}

	public void outputQueue() {
		if (count != 0)
			for (int i = front; i <= rear; i++)
				System.out.println(queueArray[i]);
	}
	
	public void reverseQueue() {
		
		
		if(isEmpty()){
			System.out.println("queue is empty");
		}else{
			Stack<Integer> stack = new Stack<>(); 
			while (!isEmpty()) { 
				stack.add(getFront()); 
				deleteQueue(); 
			} 
			while (!stack.isEmpty()) { 
				addQueue(stack.peek()); 
				stack.pop(); 
			} 
			

		}
			
	}
	
	public static void main(String[] args) {
		Queue a = new Queue();
		a.addQueue(5);
		a.addQueue(9);
		a.addQueue(8);
		System.out.println("queue:");
		a.outputQueue();
		System.out.println("front: " + a.getFront());
		System.out.println("rear:" + a.getRear());
		a.addQueue(6);
		System.out.println("queue:");
		a.outputQueue();
		a.deleteQueue();
		System.out.println("queue after delete:");
		a.outputQueue();
		System.out.println("********");
		a.reverseQueue();
		a.outputQueue();

	}
}
