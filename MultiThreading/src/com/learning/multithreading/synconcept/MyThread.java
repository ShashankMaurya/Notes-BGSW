package com.learning.multithreading.synconcept;

public class MyThread extends Thread {

	String name;
	DisplayMsg dm;

	MyThread(String name, DisplayMsg dm) {
		this.name = name;
		this.dm = dm;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		dm.showMessage(name);
	}

}
