package bank_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bank_jdbc.*;

public class BankDAO {
	
	public boolean MakeAccount(BankVO vo){
		boolean resultFlag = false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = BankDBUtil.getConnection();
			String sql = "insert into bankbook values(?, ?, ?, sysdate)";	
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getAccnum());
			ps.setInt(3, vo.getBalance());
			int resultCount = ps.executeUpdate();

			if(resultCount==1) resultFlag = true;
	
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BankDBUtil.close(conn, ps);
		}	
		return resultFlag;
	}
	
	public boolean SearchAccount(BankVO vo){
		boolean resultFlag = false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = BankDBUtil.getConnection();
			String sql = "select accountnum from bankbook where accountnum=?";	
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getAccnum());
			int resultCount = ps.executeUpdate();

			if(resultCount==1)
				resultFlag = true;
			else resultFlag = false;
	
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			BankDBUtil.close(conn, ps);
		}	
		
		return resultFlag;
	}
	
	public String CheckBalance(BankVO vo){
		ResultSet rs = null;
		String result = null;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = BankDBUtil.getConnection();
			String sql = "select balance from bankbook where accountnum=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getAccnum());
			rs = ps.executeQuery();
			if(rs.next()) result = rs.getString(1);
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			BankDBUtil.close(conn, ps);
		}
		
		return result;
	}
	
	public boolean DepWith(BankVO vo){
		boolean resultFlag = false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = BankDBUtil.getConnection();
			String sql = "update bankbook set balance=? where accountnum=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, vo.getBalance());
			ps.setString(2, vo.getAccnum());
			int resultCount = ps.executeUpdate();

			if(resultCount==1) resultFlag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BankDBUtil.close(conn, ps);
		}
		return resultFlag;
	}
	
	public String CheckName(BankVO vo){
		ResultSet rs = null;
		String result = null;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = BankDBUtil.getConnection();
			String sql = "select name from bankbook where accountnum=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getAccnum());
			rs = ps.executeQuery();
			if(rs.next()) result = rs.getString(1);
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			BankDBUtil.close(conn, ps);
		}
		
		return result;
	}
	
	public boolean WriteHistory(BankVO vo){
		boolean resultFlag = false;
		Connection conn = null;
	    PreparedStatement ps = null;
	    try {
	    	conn = BankDBUtil.getConnection();
	    	ps = conn.prepareStatement("insert into history values((select count(*)+1 from history), ?, ?, ?, ?, ?, sysdate)");
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getAccnum());
			ps.setString(3, vo.getIomoney());
			ps.setInt(4, vo.getMoney());
			ps.setInt(5, vo.getBalance());
			int resultCount = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BankDBUtil.close(conn, ps);
		}
		
		return resultFlag;
	}
	
}
