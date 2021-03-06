package netWork;

import java.text.SimpleDateFormat;
import java.net.*;
import java.io.*;
import java.util.*;

public class WebSpiderWithURLConnection {

	public static void main(String[] args) {
		URL url = null;
		try {
			url = new URL("http://www.naver.com");
		} catch (MalformedURLException e) {
			System.out.println("잘못된 URL 형식입니다.");
			System.out.println(e);
			System.exit(1);
		}
		FileOutputStream fos = null;
		try {
			URLConnection urlcon = url.openConnection();
			String contentType = urlcon.getContentType();
			long d1 = urlcon.getDate();
			Date d = new Date(d1);
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
			String sdate = format.format(d);
			System.out.println("Content Type: "+contentType);
			System.out.println("읽어온 시간: "+sdate);
			InputStream in = urlcon.getInputStream();
			fos = new FileOutputStream("urltest2.txt");
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
