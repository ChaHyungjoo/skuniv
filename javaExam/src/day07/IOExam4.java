package day07;

import java.io.*;
import java.util.*;

public class IOExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStreamReader ir = new InputStreamReader(System.in);
		FileWriter fw = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		
		try {
			System.out.println("문자열을 입력하세요: ");
			br = new BufferedReader(ir);
			pw = new PrintWriter("test.txt");
			String line = null;
			while((line = br.readLine())!=null){
				if("quit".equals(line)) break;
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
