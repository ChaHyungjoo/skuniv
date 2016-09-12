package kr.ac.sku.thread;

public class MyThread4 extends Thread {
	
	int total;
	int count;
	public MyThread4(int count) {
		this.count = count;
	}
	
	@Override
	public void run() {
		for(int i=0; i<count; i++){
			total+=i;
		}
		synchronized (this) {
			notify();  //wait하고있는것을 깨워준다
		}
		
		System.out.println("계산 스레드 종료. "+total);
		
	}

}
