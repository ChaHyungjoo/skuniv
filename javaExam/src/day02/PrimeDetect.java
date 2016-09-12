package day02;

import java.util.*;

public class PrimeDetect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.print("소수인지 판단할 숫자: ");
		
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
		if(isPrime==true) System.out.print(num+"은 소수입니다.");
		else System.out.print(num+"은 소수가 아닙니다.");
		
		

	}

}
