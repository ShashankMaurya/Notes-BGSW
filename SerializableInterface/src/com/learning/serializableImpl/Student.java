package com.learning.serializableImpl;

import java.io.Serializable;

public class Student implements Serializable { // Interfaces with no methods to implement is called as MARKER INTERFACE

	private static final long serialVersionUID = -2807671695332436370L;

	int id;
	String name;
	double collegeFees;
	transient int privateID = 100; // "transient" values does not get transmitted/serialized/encrypted

	Student(int id, String name, double collegeFees, int privateID) {
		this.id = id;
		this.name = name;
		this.collegeFees = collegeFees;
		this.privateID = privateID;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID: " + this.id + "\t\tName: " + this.name + "\t\tFees: " + this.collegeFees + "\t\tPrivateID: "
				+ this.privateID;
	}

}
