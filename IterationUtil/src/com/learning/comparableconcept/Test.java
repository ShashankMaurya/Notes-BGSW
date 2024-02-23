package com.learning.comparableconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(111, "Anee");
		Student s2 = new Student(222, "Bee");
		Student s3 = new Student(333, "Ciaz");

		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);

		Collections.sort(list);

		for (Student s : list)
			System.out.println(s);
	}

}
