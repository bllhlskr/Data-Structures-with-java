package edu.bau.sen2211.week4;

public class Student {
	private int id;
	private String fullName;
	private double gpa;

	public Student(int id, String fullName, double gpa) {
		this.id = id;
		this.fullName = fullName;
		this.gpa = gpa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Full Name: " + fullName + " with id: " + id + " and gpa: " + gpa;
	}

}
