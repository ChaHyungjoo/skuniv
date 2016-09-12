package kr.ac.sku.thread;

public class MyThread3 implements Runnable {
	String name;
	public MyThread3(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=0; i<3; i++){
			System.out.println(name+"에게 보여줄 페이지를 만든다.");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name+"페이지 생성 쓰레드 종료!!");
		

	}

}
