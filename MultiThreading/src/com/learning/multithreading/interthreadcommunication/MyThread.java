package com.learning.multithreading.interthreadcommunication;

public class MyThread extends Thread {

	int total;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Child Method");

		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				total += i;
			}
			this.notify();
		}

	}
}
