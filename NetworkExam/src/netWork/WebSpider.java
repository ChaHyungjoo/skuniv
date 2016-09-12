package netWork;

import java.net.*;
import java.io.*;

public class WebSpider {

	public static void main(String[] args) {
		URL url = null;
		try {
			url = new URL("http://www.daum.net");
		} catch (MalformedURLException e) {
			System.out.println("�߸��� URL �����Դϴ�.");
			System.out.println(e);
			System.exit(1);
		}
		
		FileOutputStream fos = null;
		try {
			InputStream in = url.openStream();
			fos = new FileOutputStream("urltest.txt");
			byte[] buffer = new byte[512];
			int readcount=0;
			System.out.println("�о���� �����մϴ�.");
			while((readcount=in.read(buffer))!=-1){
				fos.write(buffer,0,readcount);
			}
			System.out.println("���Ͽ� ��� �����Ͽ����ϴ�.");
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
