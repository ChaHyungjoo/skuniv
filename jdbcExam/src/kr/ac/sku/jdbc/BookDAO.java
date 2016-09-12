package kr.ac.sku.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.ac.sku.common.DBUtil;
public class BookDAO {
	public List<BookVO> getBookList(){
		List<BookVO> bookList = new ArrayList<>();
		//1. ����
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement("select * from book");
			rs = ps.executeQuery();
			while(rs.next()){
				BookVO vo = new BookVO();
				vo.setBookNo(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setAuthor(rs.getString(3));
				vo.setRegDate(rs.getString(4));
				bookList.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			//2. ��������
			DBUtil.close(conn, ps, rs);
		}
		return bookList;
	}
	
	public BookVO getBook(int bookno){
		BookVO vo = new BookVO();
		//1. ����
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			//3. DB����
			conn = DBUtil.getConnection();
			//4. ���� �ۼ�
			ps = conn.prepareStatement("select * from book where bookno=?");
			ps.setInt(1, 5);
			//5. ���� ����
			rs = ps.executeQuery();
			//6. ��� Ȯ��
			if(rs.next()){
				vo.setBookNo(rs.getInt(1));
				vo.setTitle(rs.getString("title"));
				vo.setAuthor(rs.getString(3));
				vo.setRegDate(rs.getString(4));
				
//				System.out.println(rs.getInt(1));
//				System.out.println(rs.getString("title"));
//				System.out.println(rs.getString(3));
//				System.out.println(rs.getString(4));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			//2. ��������
			DBUtil.close(conn, ps, rs);
		}
		return vo;
	}
	
	public boolean insertBook(BookVO vo){
		boolean resultFlag = false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "insert into book values(book_seq.nextval, ?, ?, sysdate)";	
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getAuthor());
			int resultCount = ps.executeUpdate();

			if(resultCount==1)
				resultFlag = true;
	
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, ps);
		}	
		return resultFlag;
	}
	
	public int delBook(int bookNo){
		int resultCount = 0;
		Connection conn = null;
	    PreparedStatement ps = null;
	    try {
	    	conn = DBUtil.getConnection();
	    	ps = conn.prepareStatement("delete from book where bookno=?");
			ps.setInt(1, bookNo);
			resultCount = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, ps);
		}
	    System.out.println(resultCount+" �� �����Ǿ����ϴ�.");
	    return resultCount;
	    }
	
	public int updateBook(BookVO vo){
		int resultCount = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement("update book set author=? where author='aaa'");
			ps.setString(1, vo.getAuthor());
			resultCount = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, ps);
		}
		System.out.println(resultCount+" �� ������Ʈ �Ǿ����ϴ�.");
		return resultCount;
	}
}

