package kr.ac.sku.thread;

public class DaemonThread extends Thread {

	@Override
	public void run() {
		while(true){
			System.out.println("���󽺷��� ����.");
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
