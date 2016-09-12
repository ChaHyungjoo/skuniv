package day02;

import java.util.*;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("금액을 입력하세요: ");
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
				System.out.println(init+"원 "+num[i]+"매");
			}
			else
			{
				if(i%2!=0)
				{
					init=init/5;
					num[i] = price/init;
					System.out.println(init+"원 "+num[i]+"매");
				}
				else
				{
					init=init/2;
					num[i] = price/init;
					System.out.println(init+"원 "+num[i]+"매");
				}
			}
			price = price-init*num[i];
		}
		
		

	}

}
