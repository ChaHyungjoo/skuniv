package day07;

import java.io.*;

public class IOExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String morningEgg;
		String lunchEgg;
		String dinnerEgg;
		
		try {
			BufferedReader keybd = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("��ħ�� ���� ��� ����: ");
			morningEgg = keybd.readLine();
			System.out.println("��ħ�� ��� "+morningEgg+"��");
			System.out.print("���ɿ� ���� ��� ����: ");
			lunchEgg = keybd.readLine();
			System.out.println("���ɿ� ��� "+lunchEgg+"��");
			System.out.print("���ῡ ���� ��� ����: ");
			dinnerEgg = keybd.readLine();
			System.out.println("���ῡ ��� "+dinnerEgg+"��");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
	}

}
