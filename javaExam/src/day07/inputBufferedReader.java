package day07;

import java.io.*;

public class inputBufferedReader {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String name = null;
		String phoneNumber = null;
		String phoneList = null;
		
		FileOutputStream fos = new FileOutputStream("cc.txt");
		InputStreamReader ir = new InputStreamReader(System.in);
		
		try {
			PrintWriter pw = new PrintWriter(fos);
			BufferedReader br = new BufferedReader(ir);
			
			for(int count=1; count<=3;count++){
				System.out.println("�̸�: ");
				name = br.readLine();
				System.out.println("��ȭ��ȣ: ");
				phoneNumber = br.readLine();
				pw.println(name+"\t"+phoneNumber);
			}
			pw.close();
			System.out.println("�̸��� ��ȭ��ȣ�� ����Ǿ����ϴ�.");
			
			BufferedReader brr = new BufferedReader(new FileReader("cc.txt"));
			System.out.println("");
			System.out.println("������ ������ �����ϴ�.");
			while((phoneList=brr.readLine())!=null){
				System.out.println(phoneList);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
