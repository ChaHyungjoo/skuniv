package p0712;

public class Prob02 {
	
	public class base{
		public void services(String state){
			if("state".equals("��"))
				day();
			else
				night();
		}
	}
	public void day(){
		System.out.println("��");
	}
	public void night(){
		System.out.println("night");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
