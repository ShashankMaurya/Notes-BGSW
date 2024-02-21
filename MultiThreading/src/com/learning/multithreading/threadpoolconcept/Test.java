package com.learning.multithreading.threadpoolconcept;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService service = Executors.newFixedThreadPool(3);
//		ExecutorService service = Executors.newCachedThreadPool();  TODO: this takes care of the Pool_size (Dynamic pool size)

		for (int i = 0; i <= 5; i++) {
			Runnable runnable = new ThreadPool("i : " + i);
			service.execute(runnable);
		}
		service.shutdown();

	}

}
