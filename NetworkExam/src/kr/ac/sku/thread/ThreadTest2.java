package kr.ac.sku.thread;

public class ThreadTest2 extends Thread {

	public static void main(String[] args) {
		MyThread2 cha = new MyThread2("������");
		cha.start();
		
		MyThread2 cho = new MyThread2("�����");
		cho.start();
		
		MyThread2 ahn = new MyThread2("������");
		ahn.start();
		
	}

}
