package edu.bau.sen2211.week4;

public class TestMyLinkedList {
	public static void main(String[] args) {
		MyLinkedList linkedList = new MyLinkedList();

		linkedList.addStudent(new Student(1, "Carmen Martin", 3.62));
		linkedList.addStudent(new Student(2, "Elizabeth Arnold", 3.02));
		linkedList.addStudent(new Student(3, "Anthony Horton", 3.44));

		linkedList.printData();
		System.out.println("\n--Searching GPA--");
		linkedList.searchGpa(3.52);
	}
}
