package kr.ac.sku.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.sku.common.DBUtil;

public class SelectExam {

	public static void main(String[] args) {
		//1. 선언
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			//3. DB접속
			conn = DBUtil.getConnection();
			//4. 쿼리 작성
			ps = conn.prepareStatement("select * from book where bookno=?");
			ps.setInt(1, 5);
			//5. 쿼리 실행
			rs = ps.executeQuery();
			//6. 결과 확인
			if(rs.next()){
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString("title"));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			//2. 접속종료
			DBUtil.close(conn, ps, rs);
		}
		
		

	}

}
