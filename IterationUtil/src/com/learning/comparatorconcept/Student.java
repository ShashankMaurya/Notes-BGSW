package com.learning.comparatorconcept;

public class Student {

	public int id;
	public String name;
	public int age;

	Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID: " + this.id + "\t\tName: " + this.name + "\t\tAge: " + this.age;
	}
}
