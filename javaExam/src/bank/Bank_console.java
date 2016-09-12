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
		System.out.println("<���� ����>");
		System.out.print("�̸��� �Է��ϼ���: ");
		ac.name = sc.nextLine();
		System.out.print("���� ��ȣ�� �Է��ϼ���(��: XX): ");
		ac.accnum = sc.nextLine();

		ht.put(ac.accnum, ac);
		System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
		
//		Enumeration<String> key = ht.keys();
//		Enumeration<Account> value = ht.elements();
//		while(key.hasMoreElements()){
//			System.out.println("�̸�: "+value.nextElement().name+"\t\t���� ��ȣ: "+key.nextElement());
//		}
		
	}
	
	public String SearchAccount(){
		String accnum = sc.next();
		if(ht.containsKey(accnum)){
			return accnum;
		}
		else return "���� ��ȣ�� �ùٸ��� �ʽ��ϴ�.";	
	}
	
	public void Deposit(){
		System.out.print("�Ա��Ͻ� ���� ��ȣ�� �Է��ϼ���(��: XX): ");
		String accnum = SearchAccount();
		if(ht.containsKey(accnum)){
			System.out.print("�Ա��Ͻ� �ݾ��� �Է��ϼ���: ");
			money = sc.nextInt();
			ht.get(accnum).balance +=money;
			System.out.println(money+"(��)�� �Ա� �Ǿ����ϴ�.");
		}else System.out.println("���� ��ȣ�� �ùٸ��� �ʽ��ϴ�.");
	}
	
	public void Withdraw() throws Exception{
		System.out.print("����Ͻ� ���� ��ȣ�� �Է��ϼ���(��: XX): ");
		String accnum = SearchAccount();
		if(ht.containsKey(accnum)){
			System.out.print("����Ͻ� �ݾ��� �Է��ϼ���: ");
			money = sc.nextInt();
			if(money<=ht.get(accnum).balance){
				ht.get(accnum).balance -=money;
				System.out.println(money+"(��)�� ��� �Ǿ����ϴ�.");
			}
			else{
				throw new BankException("�ܾ��� �����մϴ�.");
			}
		}else System.out.println("���� ��ȣ�� �ùٸ��� �ʽ��ϴ�.");
	}
	
	public void CheckBalance(){
		System.out.print("Ȯ���Ͻ� ���� ��ȣ�� �Է��ϼ���(��: XX): ");
		String accnum = SearchAccount();
		if(ht.containsKey(accnum)){
			System.out.println("���� �ܾ��� "+ht.get(accnum).balance+"(��) �Դϴ�.");
		}else System.out.println("���� ��ȣ�� �ùٸ��� �ʽ��ϴ�.");	
	}
	
	public void ActiveBank(Bank_console bank) throws Exception{
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
		Bank_console bank = new Bank_console();
		bank.ActiveBank(bank);

	}
}
