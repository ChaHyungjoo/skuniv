package p0712;

import java.util.*;

import org.omg.Messaging.SyncScopeHelper;


public class Prob01 {
	public static char[] reverse(String str){
		int n = str.length();
		char[] c = new char[n];
		for(int i=0;i<n;i++){
			c[i] = str.charAt((n-1)-i);
		}
		return c;
	}
	public static void printCharArray(char[] array){
		int n = array.length;
		for(int i=0;i<n;i++){
			System.out.print(array[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
		char[] c = reverse(sc.next());
		System.out.print("거꾸로 출력: ");
		printCharArray(c);
		

	}

}
