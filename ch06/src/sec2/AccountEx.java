package sec2;

public class AccountEx {

	public static void main(String[] args) {
		Account acc1 = new Account();
		System.out.println("-----------------------");
		acc1.setAccount("920102-01-123456");
		acc1.setOwner("이하영");
		acc1.runDeposit(570000);
		acc1.runWithdraw(200000);
		System.out.println("잔액조회: "+acc1.runBalance());
		System.out.println("-----------------------");
		acc1.printAccount();
	}
}
