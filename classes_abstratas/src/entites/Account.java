package entites;

public abstract class  Account {
	protected Integer number;
	protected String holder;
	protected Double balance;
	
	public Account(Integer number, String holder, Double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public void withdraw(Double amount) {
		this.balance -= amount + 5.0;
	}
	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
}
