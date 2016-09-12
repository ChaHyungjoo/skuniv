package day07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class IOExam9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream("data.txt"));
			
			System.out.println(dis.read());
	        System.out.println(dis.readInt());
	        System.out.println(dis.readBoolean());
	        System.out.println(dis.readByte());
	        //System.out.println(dis.readChar());
			
			
		} catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}

	}

}
