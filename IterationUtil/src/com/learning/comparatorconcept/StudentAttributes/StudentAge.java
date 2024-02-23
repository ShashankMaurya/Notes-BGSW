package com.learning.comparatorconcept.StudentAttributes;

import java.util.Comparator;

import com.learning.comparatorconcept.Student;

public class StudentAge implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.age > o2.age ? 0 : -1;
	}

}
