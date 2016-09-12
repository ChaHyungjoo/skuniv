package kr.ac.sku.thread;

public class MyThread extends Thread {

	@Override
	public void run() {
		for(int i=0; i<3; i++){
			System.out.println("³ª´Â À½¾ÇÀ» µè´Â´Ù.");
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
