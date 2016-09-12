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
		
		//1. 선언
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//3. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//4. DB접속
			conn = DriverManager.getConnection(url, user, password);
			
			//5. 쿼리 작성
			ps = conn.prepareStatement("delete from book where bookno=?");
			ps.setInt(1, bookNo);
			
			//6. 쿼리 실행
			resultCount = ps.executeUpdate();
			
			//7. 결과 확인
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			//2. 선언한 객체 닫아주기
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
		
		System.out.println(resultCount+" 건 삭제되었습니다.");
		

	}

}
