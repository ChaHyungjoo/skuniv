package netWork;

import java.io.*;
import java.net.*;

public class EchoServer {

	public static void main(String[] args) {
		Socket sock = null;
		try {
			ServerSocket server = new ServerSocket(10001); //Server�� ServerSocket ����
			System.out.println("������ ��ٸ��ϴ�.");
			sock = server.accept(); //Ŭ���̾�Ʈ�� ���� �ϱ⸦  ��ٸ�
			InetAddress inetaddr = sock.getInetAddress();
			System.out.println(inetaddr.getHostAddress()+"�� ���� ���� �Ͽ����ϴ�.");
			OutputStream out = sock.getOutputStream();
			InputStream in = sock.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line = null;
			while((line = br.readLine())!=null){
				System.out.println("Ŭ���̾�Ʈ�� ���� ���۹��� ���ڿ�: "+ line);
				pw.println(line);
				pw.flush();
			}
			pw.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
