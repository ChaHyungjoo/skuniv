package kr.ac.sku.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import kr.ac.sku.common.DBUtil;

public class ConnExam {

	public static void main(String[] args) throws Exception {
	/*	
		//0. ����̹� �ε�(Ŭ������ �޸𸮿� �ø��°�-��Ű���� �����ؼ� �����)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//1. DB����
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "sku";
		String password = "sku";
		Connection conn = DriverManager.getConnection(url, user, password);
		if(conn!=null){
			System.out.println("^.^");
		}
		else System.out.println("-_-");*/
		
		Connection conn = DBUtil.getConnection();
		if(conn!=null){
			System.out.println("^.^");
		}
		else System.out.println("-_-");
		
		
		
		

	}

}
