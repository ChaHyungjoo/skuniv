package kr.ac.sku.thread;

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println("main 시작!!");
		for(int i=0; i<3; i++){
			System.out.println("main 할일 하기!!");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//MyThread 동작시키기 (수행 흐름 하나 더 만들기!!);
		MyThread mt = new MyThread();
		mt.start();
		
		for(int i=0; i<5; i++){
			System.out.println("main 할일 하기!!");
		}
	}

}
