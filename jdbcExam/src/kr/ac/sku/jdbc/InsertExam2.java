package kr.ac.sku.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertExam2 {
	
	public boolean insertBook(String title, String author){
		boolean resultFlag = false;
		//필요한 객체를 먼저 선언!!
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//0. 드라이버 로딩(클래스를 메모리에 올리는것 - 패키지를 포함해서 써야함)
			Class.forName("oracle.jdbc.driver.OracleDriver");
							
			//1. DB접속
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "sku";
			String password = "sku";
			conn = DriverManager.getConnection(url, user, password);
			if(conn!=null){
				System.out.println("^.^");
			}
			else System.out.println("-_-");
			
			//2. 쿼리 작성
//			String sql = "insert into book values(book_seq.nextval, '"+title+"', '"+author+"', sysdate)";
			String sql = "insert into book values(book_seq.nextval, ?, ?, sysdate)";
					
			ps = conn.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, author);
					
			//3. 쿼리 실행
			//insert, update, delete는 숫자를 리턴 받아야 되므로 executeUpdate()을 사용
			//select는 결과를 많이 받아야 되므로 executeQuery()로 객체를 받아야한다
			int resultCount = ps.executeUpdate();
			
			//4. 결과 확인
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
		boolean result = ie.insertBook("오라클", "aaa");
		if(result){
			System.out.println("^^");
		}
		else System.out.println("-_-");
		

	}

}
