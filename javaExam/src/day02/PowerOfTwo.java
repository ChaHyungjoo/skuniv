package day02;

import java.util.*;


public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int result = 1;
		System.out.print("�¼�: ");
		int pow = stdin.nextInt();
		int n = pow;
		while(n>0)
		{
			result = 2*result;
			n--;
		}
		System.out.println("2�� "+pow+"�������� "+result+"�Դϴ�.");

	}

}
