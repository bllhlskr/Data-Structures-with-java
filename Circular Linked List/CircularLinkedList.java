package week5_1;

public class CircularLinkedList {

	private Node first;
	private Node last;
	
	public CircularLinkedList()
	{
		first =null;
		last = first;
	}
	
	public boolean isEmpty() 
	{
		if(first==null)
			return true;
		else 
			return false;
	}
	
	public void addBegin(int data)
	{
		if(first == null)
		{
			first =last =new Node(data);
		}
		else 
		{
			first = new Node(data,first);
			last.setLink(first);
		}
		
	}
	
	public void addEnd(int data)
	{
		if(first == null)
		{
			first = last = new Node(data);
		}
		else
		{
			last.setLink(new Node(data));
			last = last.getLink();
			last.setLink(first);
			
		}
	}
	
	public void addAfter(int data, int item)
	{
		if(isEmpty())
			System.out.println("list is empty");
		Node temp,current;
		current = first;
		
		do
		{
			if(current.getData() == item)
			{
				temp = new Node();
				temp.setData(data);
				temp.setLink(current.getLink());
				current.setLink(temp);
				
				if(current == last)
					last = temp;
				return;
			}
			
			current = current.getLink();
		} while(current != last.getLink());
		
		System.out.println(item + " not present in the list");
	}
	
	
	public void outputList()
	{
		Node current = first;
		
		do
		{
			System.out.println(current.getData());
			current = current.getLink();
		} while (current != last.getLink());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
