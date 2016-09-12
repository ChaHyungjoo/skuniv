package day07;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;

public class IOExam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file =new File("aa.txt");
	    System.out.println(file.isDirectory());
	    System.out.println(file.getAbsolutePath());
	    System.out.println(file.canWrite());
	    System.out.println(file.exists());
	    System.out.println(file.length());
	    System.out.println(file.getName());
	    file.setReadOnly();//읽기전용
	    
	    URL url = null;
	    try {
			url = new URL("http://naver.com/");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	    
	    BufferedReader br = null;
	    try {
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			String str = null;
			while((str=br.readLine())!=null){
				System.out.println(str);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
