package kr.ac.sku.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteExam2 {
	public int delBook(int bookNo){
		int resultCount = 0;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "sku";
		String password = "sku";
		
		//1. ����
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//3. ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//4. DB����
			conn = DriverManager.getConnection(url, user, password);
			
			//5. ���� �ۼ�
			ps = conn.prepareStatement("delete from book where bookno=?");
			ps.setInt(1, bookNo);
			
			//6. ���� ����
			resultCount = ps.executeUpdate();
			
			//7. ��� Ȯ��
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			//2. ������ ��ü �ݾ��ֱ�
			if(ps!=null){
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return resultCount;
	}

	public static void main(String[] args) {
		
		DeleteExam2 de = new DeleteExam2();
		int resultCount = de.delBook(3);
		
		System.out.println(resultCount+" �� �����Ǿ����ϴ�.");
		

	}

}
