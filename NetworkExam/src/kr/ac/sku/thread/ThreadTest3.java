package kr.ac.sku.thread;

public class ThreadTest3 {

	public static void main(String[] args) {
		MyThread3 cha = new MyThread3("Â÷ÇüÁÖ");
		Thread t1 = new Thread(cha);
		t1.start();
		
		MyThread3 cho = new MyThread3("Á¶°æ¹Î");
		Thread t2 = new Thread(cho);
		t2.start();
		
		MyThread3 ahn = new MyThread3("¾ÈÁ¤¹Î");
		Thread t3 = new Thread(cha);
		t3.start();
	}

}
