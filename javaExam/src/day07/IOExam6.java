package day07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOExam6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/day07/IOExam1.java");
		FileOutputStream fos = new FileOutputStream("aa.txt");
		
		int c = 0;
		int count = 0;
		while((c=fis.read())!=-1){
			count++;
			fos.write(c);
			
		}
		try {
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			fis.close();
		}
		System.out.println(count);

	}

}
