package netWork;

import java.net.*;

public class UDPEchoServer {

	public static void main(String[] args) {
		if(args.length!=1){
			System.out.println("사용법: java  UDPEchoServer port");
			System.exit(1);
		}
		int port = 0;
		try {
			port = Integer.parseInt(args[0]);
		} catch (Exception e) {
			System.out.println("port 번호는 양의 정수로 입력하여 주세요.");
			System.exit(1);
		}
		DatagramSocket dsock = null;
		try {
			System.out.println("접속 대기상태 입니다.");
			dsock = new DatagramSocket(port);
			String line = null;
			while(true){
				byte[] buffer = new byte[1024];
				DatagramPacket recievePacket = new DatagramPacket(buffer, buffer.length);
				dsock.receive(recievePacket);
				String msg = new String(recievePacket.getData(),0,recievePacket.getLength());
				System.out.println("전송 받은 문자열: "+msg);
				if(msg.equals("quit")) break;
				DatagramPacket sendPacket = new DatagramPacket(recievePacket.getData(), recievePacket.getData().length,recievePacket.getAddress(),recievePacket.getPort());
				dsock.send(sendPacket);
			}
			System.out.println("UDPEchoServer를 종료합니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(dsock!=null) dsock.close();
		}

	}

}
