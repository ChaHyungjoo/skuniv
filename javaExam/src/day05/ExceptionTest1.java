package day05;

public class ExceptionTest1 {

	public void testMethod(int score) throws Exception{
		if(score>=1&&score<=100){
			System.out.println("하고싶은 일을 처리.");
		}
		else{
			//임의로 Exception을 발생 시킴.
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
			//System.out.println("입력할 수 있는 값은 1-100사이의 정수");
			//et.testMethod(90);
		}
		
		
	}

}
