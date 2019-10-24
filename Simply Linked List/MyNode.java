package edu.bau.sen2211.week4;

public class MyNode {
	private Student student;
	public MyNode next;

	public MyNode(Student student) {
		this.student = student;
		next = null;
	}

	public Student getStudent() {
		return student;
	}

}
