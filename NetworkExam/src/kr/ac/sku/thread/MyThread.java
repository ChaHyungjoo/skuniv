package kr.ac.sku.thread;

public class MyThread extends Thread {

	@Override
	public void run() {
		for(int i=0; i<3; i++){
			System.out.println("���� ������ ��´�.");
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
