package day02;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10;
		int n2 = 30;
		int temp;
		
		if(n1>n2)
		{
			System.out.println("n1 = "+n1);
			System.out.println("n2 = "+n2);
		}
		else
		{
			temp=n1;
			n1=n2;
			n2=temp;
			System.out.println("n1 = "+n1);
			System.out.println("n2 = "+n2);
		}

	}

}
