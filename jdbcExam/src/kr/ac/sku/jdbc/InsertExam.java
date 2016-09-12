package kr.ac.sku.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertExam {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//0. 드라이버 로딩(클래스를 메모리에 올리는것 - 패키지를 포함해서 써야함)
		Class.forName("oracle.jdbc.driver.OracleDriver");
						
		//1. DB접속
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "sku";
		String password = "sku";
		Connection conn = DriverManager.getConnection(url, user, password);
		if(conn!=null){
			System.out.println("^.^");
		}
		else System.out.println("-_-");
		
		//2. 쿼리 작성
		String title = "test1";
		String author = "aaa";
//		String sql = "insert into book values(book_seq.nextval, '"+title+"', '"+author+"', sysdate)";
		String sql = "insert into book values(book_seq.nextval, ?, ?, sysdate)";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, title);
		ps.setString(2, author);
		
		//3. 쿼리 실행
		//insert, update, delete는 숫자를 리턴 받아야 되므로 executeUpdate()을 사용
		//select는 결과를 많이 받아야 되므로 executeQuery()로 객체를 받아야한다
		int resultCount = ps.executeUpdate();
				
				//4. 결과 확인
				if(resultCount==1){
					System.out.println("입력 성공^^");
				}
				else System.out.println("입력 실패ㅠㅠ");
				
				ps.close();
				conn.close();  
				

	}

}
