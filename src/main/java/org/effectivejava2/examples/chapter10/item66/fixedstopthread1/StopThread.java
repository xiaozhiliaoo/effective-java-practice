// Properly synchronized cooperative thread termination - Page 261
package org.effectivejava2.examples.chapter10.item66.fixedstopthread1;

import java.util.concurrent.TimeUnit;

public class StopThread {
	private static boolean stopRequested;

	private static synchronized void requestStop() {
		stopRequested = true;
	}

	private static synchronized boolean stopRequested() {
		return stopRequested;
	}

	public static void main(String[] args) throws InterruptedException {

		Thread backgroundThread = new Thread(new Runnable() {
			public void run() {
				int i = 0;
				while (!stopRequested()) {
					//A Task is Excuting
					i++;
					System.out.println(i);
				}
			}
		});
		backgroundThread.start();

		TimeUnit.SECONDS.sleep(5);
		requestStop();
//		backgroundThread.stop();
	}
}
