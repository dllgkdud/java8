package sec2;

public class Account {
	private String acc;
	private String accOwn;
	private int balance;
	private int money;
	final static int MIN_BAL=0;
	
	public Account(){ }
	public Account(String acc, String accOwn){
		this.acc=acc; this.accOwn=accOwn;
	}
	
	public String getAcc() {
		return acc;
	}
	public void setAcc(String acc) {
		this.acc = acc;
	}
	public String getAccUser() {
		return accOwn;
	}
	public void setAccUser(String accOwn) {
		this.accOwn = accOwn;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void runDeposit(int money){
		this.balance=this.balance+money;
	}
	public void runWithdraw(int money){
		if(this.balance-money>MIN_BAL){
			this.balance=this.balance-money;
		}
	}
	public int runBalance(){
		return balance;
	}
	public void printAccount(){
		System.out.println("계좌번호: "+acc+", 계좌주: "+accOwn+", 잔액: "+balance);
	}
	
}

