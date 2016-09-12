package day07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���پ�... BufferedReader ��� ��ü�� ���پ� �Է¹޴� ����� ����.
		//Ű����� ���� �Է¹ް� �ʹ�.  System.in(Ű����) -> Inputstream
		
//		InputStreamReader ir = new InputStreamReader(System.in);
		FileReader fr = null;
		BufferedReader br = null;
		
		System.out.println("���ڿ� �Է�: ");
		String line = null;
		
		try {
			fr = new FileReader("src/day07/IOExam2.java");
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				System.out.println(line);
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}finally{
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println(line);
		
	}

}
