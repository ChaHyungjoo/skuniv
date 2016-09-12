package kr.ac.sku.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateExam {
	public int updateBook(String str){
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
			ps = conn.prepareStatement("update book set author=? where author='aaa'");
			ps.setString(1, str);
			
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
		UpdateExam ue = new UpdateExam();
		int resultCount = ue.updateBook("abc");
		
		System.out.println(resultCount+" �� ������Ʈ �Ǿ����ϴ�.");

	}

}
