package kr.ac.sku.thread;

public class MyThread3 implements Runnable {
	String name;
	public MyThread3(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=0; i<3; i++){
			System.out.println(name+"���� ������ �������� �����.");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name+"������ ���� ������ ����!!");
		

	}

}
