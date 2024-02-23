package com.learning.comparatorconcept.StudentAttributes;

import java.util.Comparator;

import com.learning.comparatorconcept.Student;

public class StudentID implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (o1.id > o2.id) ? 0 : -1;
	}

}
