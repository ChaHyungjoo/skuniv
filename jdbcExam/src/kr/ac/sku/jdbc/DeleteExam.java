package kr.ac.sku.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteExam {

	public static void main(String[] args) throws Exception {
		
		//0. ����̹� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//1. DB����
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "sku";
		String password = "sku";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
		if(conn!=null) System.out.println("^^");
		else System.out.println("�Ф�");
		
		//2. ���� �ۼ�
		String title = "test1";
		String sql = "delete from book where title=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, title);
		
		//3. ���� ����
		int resultCount = ps.executeUpdate();
		
		//4. ��� Ȯ��
		if(resultCount>0){
			System.out.println("���� ����^^");
		}
		else System.out.println("���� ���ФФ�");
		
		ps.close();
		conn.close();  
		
		

	}

}
