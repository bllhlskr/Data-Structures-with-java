public class LinkedList {
	private Node first;
	private Node last;

	public LinkedList() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertAtFront(int itemName) {
		Node newFirst = new Node(itemName);
		Node current = first;
		if(first== null) {
			first = newFirst;
		}else {
			first = newFirst;
			first.link=current;
			
			
		}
	}

	public boolean removeFromFront() {
		if(first == null) {
			return false;
		}else {
			first = first.link;
			return true;
		}
	   
	}

	public void insertAtBack(int itemName) {
		Node newLast = new Node(itemName);
		if(last== null) {
			last.item = itemName;
		}else {
			last.link = newLast;
		}
	}

	public boolean removeFromBack() {
		if(last == null) {
			return false;
		}else {
			Node current = first;
			while(current.getLink() != null) {
				current  = current.getLink();
			}
			current.setLink(null);
			last=current;
			
		}
		return true;
	}

	public int size() {
		int count = 0;
		Node current = first;
		while (current != null) {
			count++;
			current = current.getLink();
		}
		return count;
	}

	public void outputList() {
		Node current = first;
		while (current != null) {
			System.out.println(current.getItem());
			current = current.getLink();
			
		}
	}

	private Node find(int target) {
		Node position = first;
		int itemAtPosition;
		while (position != null) {
			itemAtPosition = position.getItem();
			if (itemAtPosition == target)
				return position;
			position = position.getLink();
		}
		return null; // target was not found
	}

	public boolean contains(int item) {
		return (find(item) != null);
	}

	public void Insertion(int value) {		
		Node newNode = new Node(value);		
		if(first == null){
			first = newNode;
		}else{
			Node current = first;
			while(current.getLink() != null){
				current = current.link;
			}
			current.link = newNode;
		}	
	}

	
	public static void main(String[] args) {
		//After completing functions, test your code
	}
}