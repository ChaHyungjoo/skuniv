package netWork;

import java.net.*;
import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

class ChatThread extends Thread{
	private Socket sock;
	private String id;
	private BufferedReader br;
	private HashMap<String, OutputStream> hm;
	private HashMap<String, OutputStream> hm2;
	private boolean initFlag = false;

	public ChatThread(Socket sock, HashMap hm){
		this.sock = sock;
		this.hm = hm;
		try {
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			id = br.readLine();
			broadcast(id+"���� �����Ͽ����ϴ�.");
			System.out.println("������ ������� ���̵�� "+id+"�Դϴ�.");
			synchronized (hm) {
				hm.put(this.id, pw);
			}
			initFlag = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

	@Override
	public void run() {
		try {
			String line = null;
			while((line=br.readLine())!=null){
				if(line.equals("/quit")) break;
				if(line.indexOf("/to")==0){
					sendmsg(line);
				}else broadcast(id+": "+line);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			synchronized (hm) {
				hm.remove(id);
			}
			broadcast(id+" ���� ���� �����Ͽ����ϴ�.");
			try {
				if(sock!=null) sock.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void sendmsg(String msg){
		int start = msg.indexOf(" ")+1;
		int end = msg.indexOf(" ", start);
		if(end!=-1){
			String to = msg.substring(start, end);
			String msg2 = msg.substring(end+1);
			Object obj = hm.get(to);
			if(obj!=null){
				PrintWriter pw = (PrintWriter) obj;
				pw.println(id+" ���� ������ �ӼӸ��� �����̽��ϴ�: "+msg2);
				pw.flush();
			}
		}
	}
	
	public void broadcast(String msg){
		synchronized(hm){
			Collection collention = hm.values();
			Iterator iter = collention.iterator();
			while(iter.hasNext()){
				PrintWriter pw = (PrintWriter) iter.next();
				pw.println(msg);
				pw.flush();
			}
		}
	}
	
//	public void broadcast(String msg){
//		synchronized(hm){
//			StringTokenizer st = new StringTokenizer(msg, ",");
//			Object obj = null;
//			while(st.hasMoreTokens()){
//				obj = hm2.get(st.nextToken());
//			}
//			Collection collention = hm.values();
//			Collection collention2 = hm2.values();
//			Iterator iter = collention.iterator();
//			
//			while(iter.hasNext()){
//				if(!hm.containsKey(hm2)){
//					PrintWriter pw = (PrintWriter) iter.next();
//					pw.println(msg);
//					pw.flush();
//				}
//			}
//		}
//	}
	
//	public void exceptyou(String msg){
//		StringTokenizer st = new StringTokenizer(msg, " ");
//		Object obj = null;
//		while(st.hasMoreTokens()){
//			obj = hm.remove(st.nextToken());
//		}
//		synchronized(hm){
//			Collection collention = hm.values();
//			Iterator iter = collention.iterator();
//			while(iter.hasNext()){
//				PrintWriter pw = (PrintWriter) iter.next();
//				pw.println(msg);
//				pw.flush();
//			}
//		}
//	}
	
}

public class ChatServer {

	public static void main(String[] args) {
		try{
			ServerSocket server = new ServerSocket(10001);
			System.out.println("������ ��ٸ��ϴ�.");
			HashMap<String, OutputStream> hm = new HashMap<>();
			while(true){
				Socket sock = server.accept();
				ChatThread chatthread = new ChatThread(sock, hm);
				chatthread.start();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
