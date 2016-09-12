package bank;

import bank.BankException;
import bank_jdbc.*;

import java.sql.ResultSet;
import java.util.*;

public class Bank_jdbc extends Exception {
	BankDAO dao = new BankDAO();
	BankVO vo = new BankVO();
	Scanner sc = new Scanner(System.in);
	public int money;
	public String msg = "���� ��ȣ�� �ùٸ��� �ʽ��ϴ�.";
	
	class Account{
		public String accnum;
		public String name;
		public int balance;
	}

	public void CreateAccount(){
		Account ac = new Account();
		System.out.println("<���� ����>");
		System.out.print("�̸��� �Է��ϼ���: ");
		vo.setName(sc.next());
		System.out.print("���� ��ȣ�� �Է��ϼ���(��: XX): ");
		vo.setAccnum(sc.next());
		vo.setBalance(0);
		if(dao.MakeAccount(vo)) System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
	}
	
	public String SearchName(String accnum){
		vo.setAccnum(accnum);
		String name = dao.CheckName(vo);
		
		return name;
	}
	
	public String SearchAccount(){
		String accnum = sc.next();
		vo.setAccnum(accnum);
		if(dao.SearchAccount(vo)){
			return accnum;
		}
		else return msg;
	}
	
	public void WriteHistory(String name, String accnum, String io,  int money, int balance){
		vo.setName(name);
		vo.setAccnum(accnum);
		vo.setIomoney(io);
		vo.setMoney(money);
		vo.setBalance(balance);
	}
	
	public void Deposit(){
		System.out.print("�Ա��Ͻ� ���� ��ȣ�� �Է��ϼ���(��: XX): ");
		String accnum = SearchAccount();
		vo.setAccnum(accnum);
		String name = SearchName(vo.getAccnum());
		vo.setBalance(Integer.parseInt(dao.CheckBalance(vo)));
		if(accnum!=msg){
			System.out.print("�Ա��Ͻ� �ݾ��� �Է��ϼ���: ");
			money = sc.nextInt();
			vo.setMoney(money);
			vo.setIomoney("�Ա�");
			System.out.println(vo.getIomoney());
			vo.setBalance(vo.getBalance()+vo.getMoney());
			WriteHistory(name, accnum, vo.getIomoney(), money, vo.getBalance());
			dao.WriteHistory(vo);
			if(dao.DepWith(vo)) System.out.println(money+"(��)�� �Ա� �Ǿ����ϴ�.");
		}else System.out.println(msg);
	}
	
	public void Withdraw() throws Exception{
		System.out.print("����Ͻ� ���� ��ȣ�� �Է��ϼ���(��: XX): ");
		String accnum = SearchAccount();
		vo.setAccnum(accnum);
		String name = SearchName(vo.getAccnum());
		vo.setBalance(Integer.parseInt(dao.CheckBalance(vo)));
		if(accnum!=msg){
			System.out.print("����Ͻ� �ݾ��� �Է��ϼ���: ");
			money = sc.nextInt();
			if(money<=vo.getBalance()){
				vo.setMoney(money);
				vo.setIomoney("���");
				vo.setBalance(vo.getBalance()-money);
				WriteHistory(name, accnum, vo.getIomoney(), money, vo.getBalance());
				dao.WriteHistory(vo);
				if(dao.DepWith(vo)) System.out.println(money+"(��)�� ��� �Ǿ����ϴ�.");
			}
			else{
				throw new BankException("�ܾ��� �����մϴ�.");
			}
		}else System.out.println("msg");
	}
	
	public void CheckBalance(){
		System.out.print("Ȯ���Ͻ� ���� ��ȣ�� �Է��ϼ���(��: XX): ");
		String accnum = SearchAccount();
		vo.setAccnum(accnum);
		vo.setBalance(Integer.parseInt(dao.CheckBalance(vo)));
		if(accnum!=msg){
			System.out.println("���� �ܾ��� "+vo.getBalance()+"(��) �Դϴ�.");
		}else System.out.println(msg);
	}
	
	public void ActiveBank(Bank_jdbc bank) throws Exception{
		int n;
		Scanner sc = new Scanner(System.in);	
		System.out.print("������ �������ּ���(1.���� ���� / 2.�Ա� / 3.��� / 4.�ܾ� Ȯ�� / 5.����): ");
		n = sc.nextInt();
		while(true)
		{
			switch(n){
			case 1:
				bank.CreateAccount();
				break;	
			case 2:
				bank.Deposit();
				break;
			case 3:
				bank.Withdraw();
				break;
			case 4:
				bank.CheckBalance();
				break;
			case 5:
				System.out.println("�����մϴ�.");
				System.exit(1);
			}
			
			System.out.print("������ �������ּ���(1.���� ���� / 2.�Ա� / 3.��� / 4.�ܾ� Ȯ�� / 5.����): ");
			n = sc.nextInt();
		}
	}
	
	public static void main(String[] args) throws Exception{
		Bank_jdbc bank = new Bank_jdbc();
		bank.ActiveBank(bank);
		
	}
}
