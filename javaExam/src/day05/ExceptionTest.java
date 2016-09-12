package day05;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2;
		double b;
		double[] arr = new double[1];
		try{
			b = 100/a; //exception 惯积 饶 酒贰 内靛绰 荐青窍瘤 臼澜
			
			arr[0] = b;
			System.out.println("劳剂记 贸府 饶");
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException 贸府 肺流 备泅");
		}catch(NullPointerException e){
			System.out.println("NullPointerException 贸府 肺流 备泅");
		}/*catch(Exception e){
			e.printStackTrace();
			System.out.println(e);
			System.out.println("葛电 抗寇 贸府");
		}*/
		finally{
			System.out.println("亲惑贸府");
		}
		
		
		System.out.println("Some more codes");

	}

}
