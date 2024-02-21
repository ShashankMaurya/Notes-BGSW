package com.learning.multithreading;

public class InterfaceThreads implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread = new Thread(new InterfaceThreads()); // passing class' object into the Thread's constructor to associate the Thread with the particular class
		thread.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run()");

	}

}
