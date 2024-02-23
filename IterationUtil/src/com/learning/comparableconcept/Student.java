package com.learning.comparableconcept;

public class Student implements Comparable<Student> {

	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Student s) { // TODO: this fixates the fact on HOW EXACTLY TO SORT THE DATA because Student
										// object has got multiple parameters
		// TODO Auto-generated method stub
//		if (id > s.id)
//			return 0;
//		return -1;
		return (id > s.id) ? 0 : -1;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID: " + this.id + "\t\tName: " + this.name;
	}

}
