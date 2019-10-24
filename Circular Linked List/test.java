package week5_1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircularLinkedList cl = new CircularLinkedList();
		//System.out.println("------------");
		cl.addBegin(4);
		cl.addBegin(2);
		cl.addEnd(8);
		cl.addEnd(12);
		cl.addAfter(10, 8);
		cl.addAfter(1, 4);
		cl.outputList();
	}

}
