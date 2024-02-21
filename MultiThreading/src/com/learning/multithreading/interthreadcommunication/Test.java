package com.learning.multithreading.interthreadcommunication;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MyThread t1 = new MyThread();
		t1.start();

		synchronized (t1) {
			System.out.println("Main method");
			t1.wait();
			System.out.println("Total : " + t1.total);
		}

	}

}
