package com.learning.comparatorconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.learning.comparatorconcept.StudentAttributes.StudentAge;
import com.learning.comparatorconcept.StudentAttributes.StudentID;
import com.learning.comparatorconcept.StudentAttributes.StudentName;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> list = new ArrayList<>();
		
		list.add(new Student(1, "Anee", 25));
		list.add(new Student(2, "Bee", 2));
		list.add(new Student(3, "Zee", 50));
		list.add(new Student(4, "Ciaz", 5));
		list.add(new Student(5, "Dee", 255));
		
//		TODO: PASS THE REFERENCE OF THE CLASS ON WHO'S BASIS YOU HAVE TO SORT THE DATA
		
		Collections.sort(list, new StudentName());
//		Collections.sort(list, new StudentID());
//		Collections.sort(list, new StudentAge());
		
		for(Student s : list)
			System.out.println(s);
	}

}
