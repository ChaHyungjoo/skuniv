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
		
		//1. 선언
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//3. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//4. DB접속
			conn = DriverManager.getConnection(url, user, password);
			
			//5. 쿼리 작성
			ps = conn.prepareStatement("update book set author=? where author='aaa'");
			ps.setString(1, str);
			
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
		UpdateExam ue = new UpdateExam();
		int resultCount = ue.updateBook("abc");
		
		System.out.println(resultCount+" 건 업데이트 되었습니다.");

	}

}
