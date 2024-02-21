package com.learning.multithreading;

public class UsingMultiThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsingMultiThread[] arr = new UsingMultiThread[5];

		for (int i = 0; i < 5; i++) {
			arr[i] = new UsingMultiThread();
			arr[i].start();

//			System.out.println("Thread Name: "+arr[i].getName());
		}
	}

	public void run() {
		System.out.println("Thread Name: " + this.getName());  // use this.setName("Mango"); to set new Thread name
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
