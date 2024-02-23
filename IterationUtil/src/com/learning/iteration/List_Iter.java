package com.learning.iteration;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Iter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();

		list.add(111);
		list.add(222);
		list.add(333);

		ListIterator<Integer> iter = list.listIterator();
		
		System.out.println(list);

		while (iter.hasNext()) 
			System.out.println(iter.next());
		
		while (iter.hasPrevious())   // Will move reverse from where the cursor left off from next(). TODO: SINGLE CURSOR CONCEPT
			System.out.println(iter.previous());

	}

}
