package bank;

public class BankException extends Exception {
	public BankException(String msg) {
		super("잔액이 부족합니다.");	
	}
}
