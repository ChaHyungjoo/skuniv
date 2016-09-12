package kr.ac.sku.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import kr.ac.sku.common.DBUtil;

public class ConnExam {

	public static void main(String[] args) throws Exception {
	/*	
		//0. 드라이버 로딩(클래스를 메모리에 올리는것-패키지를 포함해서 써야함)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//1. DB접속
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
