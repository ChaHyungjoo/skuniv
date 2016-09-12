package netWork;

import java.io.*;
import java.net.*;

public class EchoServer {

	public static void main(String[] args) {
		Socket sock = null;
		try {
			ServerSocket server = new ServerSocket(10001); //Server는 ServerSocket 생성
			System.out.println("접속을 기다립니다.");
			sock = server.accept(); //클라이언트가 접속 하기를  기다림
			InetAddress inetaddr = sock.getInetAddress();
			System.out.println(inetaddr.getHostAddress()+"로 부터 접속 하였습니다.");
			OutputStream out = sock.getOutputStream();
			InputStream in = sock.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line = null;
			while((line = br.readLine())!=null){
				System.out.println("클라이언트로 부터 전송받은 문자열: "+ line);
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
