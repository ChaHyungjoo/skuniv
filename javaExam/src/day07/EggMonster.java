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
		System.out.print("아침에 먹은 계란 갯수: ");
		morningEgg = keybd.readLine();
		System.out.println("아침에 계란 "+morningEgg+"개");
		System.out.print("점심에 먹은 계란 갯수: ");
		lunchEgg = keybd.readLine();
		System.out.println("점심에 계란 "+lunchEgg+"개");
		System.out.print("저녁에 먹은 계란 갯수: ");
		dinnerEgg = keybd.readLine();
		System.out.println("저녁에 계란 "+dinnerEgg+"개");
		
		totalEgg = Integer.parseInt(morningEgg)+Integer.parseInt(lunchEgg)+Integer.parseInt(dinnerEgg);
		
		System.out.println("먹은 계란의 총 개수: "+totalEgg);
		if(totalEgg>10){
			System.out.println("당신은 계란 귀신이 아니고 계란 돼지입니다.");
		}else System.out.println("당신은 계란 귀신입니다.");
		

	}

}
