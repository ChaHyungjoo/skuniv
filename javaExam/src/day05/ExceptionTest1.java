package day05;

public class ExceptionTest1 {

	public void testMethod(int score) throws Exception{
		if(score>=1&&score<=100){
			System.out.println("�ϰ���� ���� ó��.");
		}
		else{
			//���Ƿ� Exception�� �߻� ��Ŵ.
			//throw new IllegalArgumentException();
			//throw new Exception();
			throw new MyException("aaa");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionTest1 et = new ExceptionTest1();
		//et.testMethod(101);
		try{
			et.testMethod(100);
		}
		catch(Exception e){
			e.printStackTrace();
			//System.out.println("�Է��� �� �ִ� ���� 1-100������ ����");
			//et.testMethod(90);
		}
		
		
	}

}
