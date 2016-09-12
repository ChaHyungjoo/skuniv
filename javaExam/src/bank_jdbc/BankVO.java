package bank_jdbc;

public class BankVO {
	private String name;
	private String accnum;
	private int balance;
	private String opendate;
	private int money;
	private String iomoney;

	@Override
	public String toString() {
		return "BankVO [name=" + name + ", accnum=" + accnum + ", balance=" + balance + ", opendate=" + opendate
				+ ", money=" + money + ", iomoney=" + iomoney + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccnum() {
		return accnum;
	}

	public void setAccnum(String accnum) {
		this.accnum = accnum;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getOpendate() {
		return opendate;
	}

	public void setOpendate(String opendate) {
		this.opendate = opendate;
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	public String getIomoney() {
		return iomoney;
	}

	public void setIomoney(String iomoney) {
		this.iomoney = iomoney;
	}

	
}
