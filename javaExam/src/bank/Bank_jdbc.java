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
	public String msg = "계좌 번호가 올바르지 않습니다.";
	
	class Account{
		public String accnum;
		public String name;
		public int balance;
	}

	public void CreateAccount(){
		Account ac = new Account();
		System.out.println("<계좌 생성>");
		System.out.print("이름을 입력하세요: ");
		vo.setName(sc.next());
		System.out.print("계좌 번호를 입력하세요(예: XX): ");
		vo.setAccnum(sc.next());
		vo.setBalance(0);
		if(dao.MakeAccount(vo)) System.out.println("계좌 생성이 완료되었습니다.");
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
		System.out.print("입금하실 계좌 번호를 입력하세요(예: XX): ");
		String accnum = SearchAccount();
		vo.setAccnum(accnum);
		String name = SearchName(vo.getAccnum());
		vo.setBalance(Integer.parseInt(dao.CheckBalance(vo)));
		if(accnum!=msg){
			System.out.print("입금하실 금액을 입력하세요: ");
			money = sc.nextInt();
			vo.setMoney(money);
			vo.setIomoney("입금");
			System.out.println(vo.getIomoney());
			vo.setBalance(vo.getBalance()+vo.getMoney());
			WriteHistory(name, accnum, vo.getIomoney(), money, vo.getBalance());
			dao.WriteHistory(vo);
			if(dao.DepWith(vo)) System.out.println(money+"(원)이 입급 되었습니다.");
		}else System.out.println(msg);
	}
	
	public void Withdraw() throws Exception{
		System.out.print("출금하실 계좌 번호를 입력하세요(예: XX): ");
		String accnum = SearchAccount();
		vo.setAccnum(accnum);
		String name = SearchName(vo.getAccnum());
		vo.setBalance(Integer.parseInt(dao.CheckBalance(vo)));
		if(accnum!=msg){
			System.out.print("출금하실 금액을 입력하세요: ");
			money = sc.nextInt();
			if(money<=vo.getBalance()){
				vo.setMoney(money);
				vo.setIomoney("출금");
				vo.setBalance(vo.getBalance()-money);
				WriteHistory(name, accnum, vo.getIomoney(), money, vo.getBalance());
				dao.WriteHistory(vo);
				if(dao.DepWith(vo)) System.out.println(money+"(원)이 출금 되었습니다.");
			}
			else{
				throw new BankException("잔액이 부족합니다.");
			}
		}else System.out.println("msg");
	}
	
	public void CheckBalance(){
		System.out.print("확인하실 계좌 번호를 입력하세요(예: XX): ");
		String accnum = SearchAccount();
		vo.setAccnum(accnum);
		vo.setBalance(Integer.parseInt(dao.CheckBalance(vo)));
		if(accnum!=msg){
			System.out.println("현재 잔액은 "+vo.getBalance()+"(원) 입니다.");
		}else System.out.println(msg);
	}
	
	public void ActiveBank(Bank_jdbc bank) throws Exception{
		int n;
		Scanner sc = new Scanner(System.in);	
		System.out.print("업무를 선택해주세요(1.계좌 생성 / 2.입금 / 3.출금 / 4.잔액 확인 / 5.종료): ");
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
				System.out.println("종료합니다.");
				System.exit(1);
			}
			
			System.out.print("업무를 선택해주세요(1.계좌 생성 / 2.입금 / 3.출금 / 4.잔액 확인 / 5.종료): ");
			n = sc.nextInt();
		}
	}
	
	public static void main(String[] args) throws Exception{
		Bank_jdbc bank = new Bank_jdbc();
		bank.ActiveBank(bank);
		
	}
}
