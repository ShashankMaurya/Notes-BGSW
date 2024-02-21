package com.learning.multithreading.threadpoolconcept;

public class ThreadPool implements Runnable {

	String name;

	public ThreadPool(String name) {
		this.name = name;
	}

	private void sleepMethod() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Started : " + Thread.currentThread().getName() + "\tname: " + name);
		sleepMethod();
		System.out.println("Thread ended : " + Thread.currentThread().getName() + "\tname: " + name);

	}

}
