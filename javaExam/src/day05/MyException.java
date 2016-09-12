package day05;

public class MyException extends Exception {
	public MyException(){
		super("1-100사이의 값만 입력하세요~");
	}
	public MyException(String msg){
		super(msg);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
