package test1;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		while(run){
			System.out.println("------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------");
			System.out.print("선택> ");
			
			int job = scanner.nextInt();
			int money = 0;
			switch(job){
				case 1:
					System.out.print("예금액> ");
					money = scanner.nextInt();
					balance += money;
					break;
				case 2:
					System.out.print("출금액> ");
					money = scanner.nextInt();
					balance -= money;
					break;
				case 3:
					System.out.println("잔고> "+balance);
					break;
				case 4:
					System.out.println("\n프로그램 종료");
					run = false;
					break;
				default:
					System.out.println("\n잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
		
		scanner.close();

	}

}
