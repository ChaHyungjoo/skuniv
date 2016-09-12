package netWork;
import java.io.*;
import java.net.*;
import java.util.*;

class InputThread extends Thread{
	private Socket sock = null;
	private BufferedReader br = null;
	
	public InputThread(Socket sock, BufferedReader br){
		this.sock = sock;
		this.br = br;
	}

	@Override
	public void run() {
		try {
			String line = null;
			while((line = br.readLine())!=null){
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null) br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if(sock!=null) sock.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
	
public class ChatClient {

	public static void main(String[] args) {
		if(args.length!=2){
			System.out.println("사용법: java ChatClient id 접속할서버ip");
			System.exit(1);
		}
		Socket sock = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		boolean endflag = false;
		try {
			sock = new Socket(args[1], 10001);
			pw = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			pw.println(args[0]);
			pw.flush();
			InputThread it = new InputThread(sock, br);
			it.start();
			String line = null;
			while((line = keyboard.readLine())!=null){
				pw.println(line);
				pw.flush();
				if(line.equals("/quit")){
					endflag = true;
					System.out.println("클라이언트의 접속을 종료합니다.");
					break;
				}
				if(line.equals("/info")){
				System.out.println("<<사용법>>");
				System.out.println("1.귓속말: /to 상대 보낼내용");
//				System.out.println("2.대화상대 제외: a,b,c(상대이름) ... 엔터 후 대화");
				System.out.println("2.종료: /quit");
			}
			}
		} catch (Exception e) {
			if(!endflag) e.printStackTrace();
		}finally {
			try {
				if(pw!=null) pw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if(br!=null) br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if(sock!=null) sock.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
