package kr.ac.sku.thread;

public class JoinThreadTest {

	public static void main(String[] args) {
		MyThread m = new MyThread();
		m.start();
		
		try {
			m.join();  // 쓰레드가 다 끝날때까지 main이 기다리게 해준다
						//join은 무조건 끝날때까지 기다림, wait은 notify가 있는곳까지 기다림(wait-notify 같이 사용)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main 종료!!");
		
		
	}

}
