package day07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class IOExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			//���Ϸκ��� ���پ� �Է¹޴� ��ü ����
			br = new BufferedReader(new FileReader("src/day07/IOExam2.java"));
			//���Ͽ� ��� �ϱ����� ��ü ����
			pw = new PrintWriter(new FileWriter("IOExamCopy.txt"));
			String line = null;
			while((line = br.readLine())!=null){
				pw.print(line);
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			pw.close();
			try {
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
