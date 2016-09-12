package day07;

import java.io.IOException;

public class IOExam5 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		int c = 0;
		while((c=System.in.read())!=-1){
			System.out.println((char)c);
		}

	}

}
