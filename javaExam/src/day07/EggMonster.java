package day07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EggMonster {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String morningEgg;
		String lunchEgg;
		String dinnerEgg;
		int totalEgg;
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader keybd = new BufferedReader(ir);
		System.out.print("��ħ�� ���� ��� ����: ");
		morningEgg = keybd.readLine();
		System.out.println("��ħ�� ��� "+morningEgg+"��");
		System.out.print("���ɿ� ���� ��� ����: ");
		lunchEgg = keybd.readLine();
		System.out.println("���ɿ� ��� "+lunchEgg+"��");
		System.out.print("���ῡ ���� ��� ����: ");
		dinnerEgg = keybd.readLine();
		System.out.println("���ῡ ��� "+dinnerEgg+"��");
		
		totalEgg = Integer.parseInt(morningEgg)+Integer.parseInt(lunchEgg)+Integer.parseInt(dinnerEgg);
		
		System.out.println("���� ����� �� ����: "+totalEgg);
		if(totalEgg>10){
			System.out.println("����� ��� �ͽ��� �ƴϰ� ��� �����Դϴ�.");
		}else System.out.println("����� ��� �ͽ��Դϴ�.");
		

	}

}
