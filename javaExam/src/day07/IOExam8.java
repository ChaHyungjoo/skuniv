package day07;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class IOExam8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataOutputStream dos = null;
		
		try {
			dos = new DataOutputStream(new FileOutputStream("data.txt"));
			dos.writeInt(10);
			dos.writeByte(4);
			dos.writeBoolean(false);
			dos.writeChar('a');
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				dos.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		

	}

}
