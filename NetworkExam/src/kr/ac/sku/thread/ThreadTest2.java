package kr.ac.sku.thread;

public class ThreadTest2 extends Thread {

	public static void main(String[] args) {
		MyThread2 cha = new MyThread2("Â÷ÇüÁÖ");
		cha.start();
		
		MyThread2 cho = new MyThread2("Á¶°æ¹Î");
		cho.start();
		
		MyThread2 ahn = new MyThread2("¾ÈÁ¤¹Î");
		ahn.start();
		
	}

}
