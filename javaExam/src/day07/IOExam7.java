package day07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOExam7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/day07/IOExam1.java");
		FileOutputStream fos = new FileOutputStream("bb.txt");
		
		int readCount = 0;
		int count = 0;
		byte[] buffer = new byte[512];
		while((readCount=fis.read(buffer))!=-1){
			count++;
			fos.write(buffer,0,readCount);
			
		}
		try {
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			fos.close();
			try {
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(count);

	}

}
