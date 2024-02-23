package com.learning.iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();

		list.add("Anee");
		list.add("Bee");
		list.add("Ciaz");

		Iterator<String> iter = list.iterator();
		String s;

		while (iter.hasNext()) {
			s = iter.next();

			if (s == "Anee")
				iter.remove();

//			System.out.println(s);
		}

		System.out.println(list);

	}

}
