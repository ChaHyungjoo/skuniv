package kr.ac.sku.thread;

public class WaitThreadTest {

	public static void main(String[] args) {
		MyThread4 m = new MyThread4(500);
		m.start();
		
		System.out.println(m.total);
		
		try {
			synchronized (m) {
				m.wait();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(m.total);
		System.out.println("main Á¾·á");
	}

}
