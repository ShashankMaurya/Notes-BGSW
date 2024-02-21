package com.learning.multithreading;

public class ThreadJoin extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadJoin obj = new ThreadJoin();
		ThreadJoin obj1 = new ThreadJoin();
		ThreadJoin obj2 = new ThreadJoin();

		obj.start();
		try {
			obj.join();  // this will allow the execution of this Thread to complete, before triggering the rest two threads 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj1.start();
		obj2.start();
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("i : " + i);
		}
	}

}
