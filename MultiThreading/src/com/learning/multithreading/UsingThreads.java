package com.learning.multithreading;

public class UsingThreads extends Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		UsingThreads usingThreads = new UsingThreads();
		usingThreads.start();

		for (int j = 0; j < 10; j++) {
			System.out.println("\tj loop: " + j);
			Thread.sleep(1000);
		}

	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i loop: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
