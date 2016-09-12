package kr.ac.sku.thread;

public class DaemonThread extends Thread {

	@Override
	public void run() {
		while(true){
			System.out.println("데몬스레드 실행.");
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
