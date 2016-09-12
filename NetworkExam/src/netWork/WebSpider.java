package netWork;

import java.net.*;
import java.io.*;

public class WebSpider {

	public static void main(String[] args) {
		URL url = null;
		try {
			url = new URL("http://www.daum.net");
		} catch (MalformedURLException e) {
			System.out.println("잘못된 URL 형식입니다.");
			System.out.println(e);
			System.exit(1);
		}
		
		FileOutputStream fos = null;
		try {
			InputStream in = url.openStream();
			fos = new FileOutputStream("urltest.txt");
			byte[] buffer = new byte[512];
			int readcount=0;
			System.out.println("읽어오기 시작합니다.");
			while((readcount=in.read(buffer))!=-1){
				fos.write(buffer,0,readcount);
			}
			System.out.println("파일에 모두 저장하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos!=null) fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
