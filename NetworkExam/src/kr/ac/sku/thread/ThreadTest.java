package kr.ac.sku.thread;

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println("main ����!!");
		for(int i=0; i<3; i++){
			System.out.println("main ���� �ϱ�!!");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//MyThread ���۽�Ű�� (���� �帧 �ϳ� �� �����!!);
		MyThread mt = new MyThread();
		mt.start();
		
		for(int i=0; i<5; i++){
			System.out.println("main ���� �ϱ�!!");
		}
	}

}
