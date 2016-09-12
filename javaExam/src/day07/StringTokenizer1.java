package day07;

import java.util.StringTokenizer;

public class StringTokenizer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tel = "010-1111-2222";
		
		StringTokenizer st = new StringTokenizer(tel, "#-");
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		

	}

}
