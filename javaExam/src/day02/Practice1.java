package day02;

import java.util.*;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�ݾ��� �Է��ϼ���: ");
		Scanner stdin = new Scanner(System.in);
		
		int price = stdin.nextInt();
		int init = 50000;
		int i;
		int[] num = new int[8];
		
		for(i=0;i<8;i++)
		{
			if(i==0)
			{
				num[i]=price/init;
				System.out.println(init+"�� "+num[i]+"��");
			}
			else
			{
				if(i%2!=0)
				{
					init=init/5;
					num[i] = price/init;
					System.out.println(init+"�� "+num[i]+"��");
				}
				else
				{
					init=init/2;
					num[i] = price/init;
					System.out.println(init+"�� "+num[i]+"��");
				}
			}
			price = price-init*num[i];
		}
		
		

	}

}
