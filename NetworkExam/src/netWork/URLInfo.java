package netWork;

import java.net.*;

public class URLInfo {

	public static void main(String[] args) {
//		if(args.length!=1){
//			System.out.println("����: java Webspider URL");
//			System.exit(1);
//		}
//		URL url = null;
//		try {
//			url = new URL(args[0]);
//		} catch (MalformedURLException e) {
//			System.out.println("�߸��� URL �����Դϴ�.");
//			System.out.println(e);
//			System.exit(1);
//		}
		
		URL url = null;
		try {
			url = new URL("http://www.daum.net/");
		} catch (MalformedURLException e) {
			System.out.println("�߸��� URL �����Դϴ�.");
			System.out.println(e);
			System.exit(1);
		}
		
		
		
		System.out.println("��������: "+url.getProtocol());
		System.out.println("ȣ��Ʈ �̸�: "+url.getHost());
		System.out.println("��Ʈ��ȣ: "+ url.getPort());
		System.out.println("�����̸�: "+ url.getPath());
		System.out.println("����� ����: "+ url.getQuery());
		

	}

}
