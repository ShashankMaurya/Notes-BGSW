package com.learning.multithreading.synconcept;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DisplayMsg d1 = new DisplayMsg();
		
		MyThread t1 = new MyThread("Anne", d1);
		t1.start();

		MyThread t2 = new MyThread("Bee", d1);
		t2.start();
		
		MyThread t3 = new MyThread("Ciaz", d1);
		t3.start();
	}

}
