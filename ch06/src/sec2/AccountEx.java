package sec2;

public class AccountEx {

	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.setAcc("910102-01-123456");
		acc1.setAccUser("이하영");
		acc1.runDeposit(150000);
		acc1.runWithdraw(90000);
		System.out.println("잔액: "+acc1.runBalance());
		acc1.printAccount();
	}

}
