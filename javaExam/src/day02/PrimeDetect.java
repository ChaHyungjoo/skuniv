package day02;

import java.util.*;

public class PrimeDetect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.print("�Ҽ����� �Ǵ��� ����: ");
		
		int divisor = 2;
		int num = stdin.nextInt();
		boolean isPrime = true;
		
		while(num>divisor)
		{
			if(num%divisor==0)
			{
				isPrime = false;
			}
			divisor++;
		}
		if(isPrime==true) System.out.print(num+"�� �Ҽ��Դϴ�.");
		else System.out.print(num+"�� �Ҽ��� �ƴմϴ�.");
		
		

	}

}
