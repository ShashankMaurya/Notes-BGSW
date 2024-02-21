package com.learning.multithreading;

public class InterruptThreads extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterruptThreads interruptThreads = new InterruptThreads();
		interruptThreads.start();
		interruptThreads.interrupt();

	}

	@Override
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
