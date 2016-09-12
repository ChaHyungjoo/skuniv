package day03;

import java.util.*;

class Calc{
	
	int num1;
	int num2;
	int result;
	
	/*
	public int sum(int num1, int num2){
		result = num1+num2;
		return result;
	}
	public int sub(int num1, int num2){
		result = num1-num2;
		return result;
	}
	public int mul(int num1, int num2){
		result = num1*num2;
		return result;
	}
	public int div(int num1, int num2){
		result = num1/num2;
		return result;
	}
	*/
	public void setNum1(int num1){
		this.num1 = num1;
	}
	public void setNum2(int num2){
		this.num2 = num2;
	}
	
}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc = new Calc();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요: ");
		calc.setNum1(sc.nextInt());
		System.out.print("두번째 숫자를 입력하세요: ");
		calc.setNum2(sc.nextInt());
		
		
		/*
		System.out.print("두번째 숫자를 입력하세요: ");
		Scanner sc2 = new Scanner(System.in);
		int n2 = sc2.nextInt();
		*/
		
		
		
		
		
		
		

	}

}
