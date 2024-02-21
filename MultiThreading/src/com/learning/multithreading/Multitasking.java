package com.learning.multithreading;

class SimpleThread extends Thread {

	public void run() {  // compulsory implementation, always void
		System.out.println("Hello");
	}

}


//  new (start()) --> ready (run()) --> running --> dead (only after run() is completed)
//  ready <-- running (by calling the yield())

public class Multitasking{
	public static void main(String[] args) {
		
		SimpleThread simpleThread = new SimpleThread();
		simpleThread.start();  // start() activates the activity_lifecycle and the run() is triggered in a separate Thread 
		
	}
}