package com.learning.multithreading;

public class PriorityThreads extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityThreads t1 = new PriorityThreads();
		PriorityThreads t2 = new PriorityThreads();
		PriorityThreads t3 = new PriorityThreads();
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.setName("Anee");
		t2.setName("Bee");
		t3.setName("Ciaz");
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		t3.setPriority(MIN_PRIORITY);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);

	}

	public void run() {
		System.out.println(this.getName());
	}
	
}
