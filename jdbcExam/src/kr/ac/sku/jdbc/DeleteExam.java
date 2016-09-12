package kr.ac.sku.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteExam {

	public static void main(String[] args) throws Exception {
		
		//0. 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//1. DB접속
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "sku";
		String password = "sku";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
		if(conn!=null) System.out.println("^^");
		else System.out.println("ㅠㅠ");
		
		//2. 쿼리 작성
		String title = "test1";
		String sql = "delete from book where title=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, title);
		
		//3. 쿼리 실행
		int resultCount = ps.executeUpdate();
		
		//4. 결과 확인
		if(resultCount>0){
			System.out.println("삭제 성공^^");
		}
		else System.out.println("삭제 실패ㅠㅠ");
		
		ps.close();
		conn.close();  
		
		

	}

}
