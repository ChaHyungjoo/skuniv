package day06;

import java.util.regex.Pattern;

public class StringExam {
	public boolean checkProductNumber(String ProductNumber){
		if(Pattern.matches("[a-zA-Z]{2}[0-9]{4}", ProductNumber))
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringExam se = new StringExam();
		System.out.println(se.checkProductNumber("te3456"));
		System.out.println(se.checkProductNumber("t33456"));
		System.out.println(se.checkProductNumber("ar49786"));
		System.out.println(se.checkProductNumber("test56"));
		

	}

}
