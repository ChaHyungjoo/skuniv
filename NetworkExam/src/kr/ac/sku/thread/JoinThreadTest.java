package kr.ac.sku.thread;

public class JoinThreadTest {

	public static void main(String[] args) {
		MyThread m = new MyThread();
		m.start();
		
		try {
			m.join();  // �����尡 �� ���������� main�� ��ٸ��� ���ش�
						//join�� ������ ���������� ��ٸ�, wait�� notify�� �ִ°����� ��ٸ�(wait-notify ���� ���)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main ����!!");
		
		
	}

}
