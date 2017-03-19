package com.praveen.sample.test;

public class Demo implements Runnable {

	private Thread t;
	private String threadName;

	public Demo(String threadName) {
		this.threadName = threadName;
		//System.out.println("Constructor Thread Name -> " + threadName);
	}

	public void run() {
		
		//System.out.println("Running Thread -> " + threadName);
		for (long i=0;i<1000;i++) {
			for (long j=0;j<10000000;j++) {
				
			}
		}
		//System.out.println("Thread -> " + threadName + " , exiting.");
		App.s2 = System.currentTimeMillis();
	}

	public void start() {
		//System.out.println("Starting Thread -> " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}
