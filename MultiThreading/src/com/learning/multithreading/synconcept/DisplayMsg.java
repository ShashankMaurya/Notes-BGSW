package com.learning.multithreading.synconcept;

public class DisplayMsg {

	synchronized void showMessage(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.println(" name: " + name);
		}
	}

//	void showMessage(String name) {
//		synchronized (this) {
//			for (int i = 0; i < 5; i++) {
//				System.out.println(" name: " + name);
//			}
//		}
//
//	}
	
//	TODO: SYNCHRONIZED can also be used as a block. it completes the execution of the particular object before executing the next object

}
