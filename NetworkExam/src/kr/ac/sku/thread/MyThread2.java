package kr.ac.sku.thread;

public class MyThread2 extends Thread {
	
	String name;
	public MyThread2(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=0; i<3; i++){
			System.out.println(name+"���� ������ �������� �����.");
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name+"������ ���� ������ ����!!");
	}
	
	
	
}
