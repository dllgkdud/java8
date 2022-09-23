package test3;

public class Account {
	private int balance = 0;
	final static int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance>=MIN_BALANCE && balance<=MAX_BALANCE){	//0<=balance<=1000000의 값만 가지세요. (저장범위를 설정하라.)
			this.balance = balance;
		}
	}
	
}
