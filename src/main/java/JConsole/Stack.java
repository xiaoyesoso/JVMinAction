package JConsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stack {

	public static void createBusyThread(){
		Thread thread = new Thread(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				while(true);
			}
		},"testBusyThread");
		thread.start();
	}
	
	public static void createLockThread(final Object lock){
		Thread thread = new Thread(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				synchronized (lock) {
					try {
						lock.wait();
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}
		},"testLockThread");
		thread.start();
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		createBusyThread();
		br.readLine();
		Object lock = new Object();
		createLockThread(lock);
	}

}
