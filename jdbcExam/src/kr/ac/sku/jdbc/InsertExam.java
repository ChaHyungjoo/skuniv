package kr.ac.sku.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertExam {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//0. ����̹� �ε�(Ŭ������ �޸𸮿� �ø��°� - ��Ű���� �����ؼ� �����)
		Class.forName("oracle.jdbc.driver.OracleDriver");
						
		//1. DB����
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "sku";
		String password = "sku";
		Connection conn = DriverManager.getConnection(url, user, password);
		if(conn!=null){
			System.out.println("^.^");
		}
		else System.out.println("-_-");
		
		//2. ���� �ۼ�
		String title = "test1";
		String author = "aaa";
//		String sql = "insert into book values(book_seq.nextval, '"+title+"', '"+author+"', sysdate)";
		String sql = "insert into book values(book_seq.nextval, ?, ?, sysdate)";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, title);
		ps.setString(2, author);
		
		//3. ���� ����
		//insert, update, delete�� ���ڸ� ���� �޾ƾ� �ǹǷ� executeUpdate()�� ���
		//select�� ����� ���� �޾ƾ� �ǹǷ� executeQuery()�� ��ü�� �޾ƾ��Ѵ�
		int resultCount = ps.executeUpdate();
				
				//4. ��� Ȯ��
				if(resultCount==1){
					System.out.println("�Է� ����^^");
				}
				else System.out.println("�Է� ���ФФ�");
				
				ps.close();
				conn.close();  
				

	}

}
