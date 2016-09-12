package bank;

import bank.BankException;
import java.util.*;

public class Bank_console extends Exception {
	
	Scanner sc = new Scanner(System.in);
	Hashtable<String, Account> ht = new Hashtable<>();
	public int money;

	class Account{
		public String accnum;
		public String name;
		public int balance = 0;
	}

	public void CreateAccount(){
		Account ac = new Account();
		System.out.println("<계좌 생성>");
		System.out.print("이름을 입력하세요: ");
		ac.name = sc.nextLine();
		System.out.print("계좌 번호를 입력하세요(예: XX): ");
		ac.accnum = sc.nextLine();

		ht.put(ac.accnum, ac);
		System.out.println("계좌 생성이 완료되었습니다.");
		
//		Enumeration<String> key = ht.keys();
//		Enumeration<Account> value = ht.elements();
//		while(key.hasMoreElements()){
//			System.out.println("이름: "+value.nextElement().name+"\t\t계좌 번호: "+key.nextElement());
//		}
		
	}
	
	public String SearchAccount(){
		String accnum = sc.next();
		if(ht.containsKey(accnum)){
			return accnum;
		}
		else return "계좌 번호가 올바르지 않습니다.";	
	}
	
	public void Deposit(){
		System.out.print("입금하실 계좌 번호를 입력하세요(예: XX): ");
		String accnum = SearchAccount();
		if(ht.containsKey(accnum)){
			System.out.print("입금하실 금액을 입력하세요: ");
			money = sc.nextInt();
			ht.get(accnum).balance +=money;
			System.out.println(money+"(원)이 입급 되었습니다.");
		}else System.out.println("계좌 번호가 올바르지 않습니다.");
	}
	
	public void Withdraw() throws Exception{
		System.out.print("출금하실 계좌 번호를 입력하세요(예: XX): ");
		String accnum = SearchAccount();
		if(ht.containsKey(accnum)){
			System.out.print("출금하실 금액을 입력하세요: ");
			money = sc.nextInt();
			if(money<=ht.get(accnum).balance){
				ht.get(accnum).balance -=money;
				System.out.println(money+"(원)이 출금 되었습니다.");
			}
			else{
				throw new BankException("잔액이 부족합니다.");
			}
		}else System.out.println("계좌 번호가 올바르지 않습니다.");
	}
	
	public void CheckBalance(){
		System.out.print("확인하실 계좌 번호를 입력하세요(예: XX): ");
		String accnum = SearchAccount();
		if(ht.containsKey(accnum)){
			System.out.println("현재 잔액은 "+ht.get(accnum).balance+"(원) 입니다.");
		}else System.out.println("계좌 번호가 올바르지 않습니다.");	
	}
	
	public void ActiveBank(Bank_console bank) throws Exception{
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
		Bank_console bank = new Bank_console();
		bank.ActiveBank(bank);

	}
}
