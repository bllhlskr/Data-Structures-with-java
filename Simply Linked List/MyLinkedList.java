package edu.bau.sen2211.week4;

public class MyLinkedList {
	private MyNode root;
	private int size;

	public MyLinkedList() {
		this.root = null;
		size = 0;
	}

	public void addStudent(Student student) {
		MyNode node = new MyNode(student);
		if (root == null)
			root = node;
		else {
			MyNode currentNode = root;
			while (currentNode.next != null)
				currentNode = currentNode.next;

			currentNode.next = node;
		}

		size++;
	}

	public void searchGpa(double gpa) {
		MyNode currentNode = root;
		while (currentNode != null) {
			Student student = currentNode.getStudent();
			if (student.getGpa() > gpa)
				System.out.println(student);

			currentNode = currentNode.next;
		}
	}

	public void printData() {
		MyNode currentNode = root;
		while (currentNode != null) {
			Student student = currentNode.getStudent();
			System.out.println(student);
			currentNode = currentNode.next;
		}
	}

}
