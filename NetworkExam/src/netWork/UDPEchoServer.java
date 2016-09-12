package netWork;

import java.net.*;

public class UDPEchoServer {

	public static void main(String[] args) {
		if(args.length!=1){
			System.out.println("����: java  UDPEchoServer port");
			System.exit(1);
		}
		int port = 0;
		try {
			port = Integer.parseInt(args[0]);
		} catch (Exception e) {
			System.out.println("port ��ȣ�� ���� ������ �Է��Ͽ� �ּ���.");
			System.exit(1);
		}
		DatagramSocket dsock = null;
		try {
			System.out.println("���� ������ �Դϴ�.");
			dsock = new DatagramSocket(port);
			String line = null;
			while(true){
				byte[] buffer = new byte[1024];
				DatagramPacket recievePacket = new DatagramPacket(buffer, buffer.length);
				dsock.receive(recievePacket);
				String msg = new String(recievePacket.getData(),0,recievePacket.getLength());
				System.out.println("���� ���� ���ڿ�: "+msg);
				if(msg.equals("quit")) break;
				DatagramPacket sendPacket = new DatagramPacket(recievePacket.getData(), recievePacket.getData().length,recievePacket.getAddress(),recievePacket.getPort());
				dsock.send(sendPacket);
			}
			System.out.println("UDPEchoServer�� �����մϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(dsock!=null) dsock.close();
		}

	}

}
