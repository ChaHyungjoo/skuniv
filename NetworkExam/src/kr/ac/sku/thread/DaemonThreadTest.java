package kr.ac.sku.thread;

public class DaemonThreadTest {

	public static void main(String[] args) {
		//데몬스레드는 다른스레드가 끝나면 같이 끝난다
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
