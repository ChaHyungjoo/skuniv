package day05;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2;
		double b;
		double[] arr = new double[1];
		try{
			b = 100/a; //exception �߻� �� �Ʒ� �ڵ�� �������� ����
			
			arr[0] = b;
			System.out.println("�ͼ��� ó�� ��");
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException ó�� ���� ����");
		}catch(NullPointerException e){
			System.out.println("NullPointerException ó�� ���� ����");
		}/*catch(Exception e){
			e.printStackTrace();
			System.out.println(e);
			System.out.println("��� ���� ó��");
		}*/
		finally{
			System.out.println("�׻�ó��");
		}
		
		
		System.out.println("Some more codes");

	}

}
