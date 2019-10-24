package week5_1;

public class Node {

	private int data;
	private Node link;
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node link) {
		this.link = link;
	}

	public Node()
	{
		link = null;
		data =0;
	}
	 
	public Node(int newdata)
	{
		setData(newdata);
		link = null;
	}
	
	public Node(int newdata, Node linkValue)
	{
		setData(newdata);
		link = linkValue;
	}
	
	
	
	

}
