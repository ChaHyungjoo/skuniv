package kr.ac.sku.thread;

public class DaemonThreadTest {

	public static void main(String[] args) {
		//���󽺷���� �ٸ������尡 ������ ���� ������
		MyThread m = new MyThread();
		m.start();
		
		MyThread3 m3 = new MyThread3("cha");
		Thread t = new Thread(m3);
		t.start();
		
		DaemonThread dt = new DaemonThread();
		dt.setDaemon(true);
		dt.start();

	}

}
