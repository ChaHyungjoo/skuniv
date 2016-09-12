package kr.ac.sku.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertExam2 {
	
	public boolean insertBook(String title, String author){
		boolean resultFlag = false;
		//�ʿ��� ��ü�� ���� ����!!
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//0. ����̹� �ε�(Ŭ������ �޸𸮿� �ø��°� - ��Ű���� �����ؼ� �����)
			Class.forName("oracle.jdbc.driver.OracleDriver");
							
			//1. DB����
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "sku";
			String password = "sku";
			conn = DriverManager.getConnection(url, user, password);
			if(conn!=null){
				System.out.println("^.^");
			}
			else System.out.println("-_-");
			
			//2. ���� �ۼ�
//			String sql = "insert into book values(book_seq.nextval, '"+title+"', '"+author+"', sysdate)";
			String sql = "insert into book values(book_seq.nextval, ?, ?, sysdate)";
					
			ps = conn.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, author);
					
			//3. ���� ����
			//insert, update, delete�� ���ڸ� ���� �޾ƾ� �ǹǷ� executeUpdate()�� ���
			//select�� ����� ���� �޾ƾ� �ǹǷ� executeQuery()�� ��ü�� �޾ƾ��Ѵ�
			int resultCount = ps.executeUpdate();
			
			//4. ��� Ȯ��
			if(resultCount==1)
				resultFlag = true;
	
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
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
		
				
		return resultFlag;
	}

	public static void main(String[] args) throws Exception {
		
		InsertExam2 ie = new InsertExam2();
		boolean result = ie.insertBook("����Ŭ", "aaa");
		if(result){
			System.out.println("^^");
		}
		else System.out.println("-_-");
		

	}

}
