package sec2;

import java.util.Scanner;

public class Condition1 {

	public static void main(String[] args) {
		System.out.println("점수 입력: ");	//console창에서 직접 입력하는 명령	print : 한 줄 내에 출력, println : 다음 줄에 출력
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		/*if(조건식) {
			참일 때 실행문;
		} else {
			거짓일 때 실행문;
		}
		*/
		if(num>=80) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		//	명령문이 한 줄이면, {} 생략 가능
		if(num<60) {
			System.out.println("재평가");
		} else {
			System.out.println("과목이수");
		}
		//	else없이 진행하는 경우 
		String str = "탈락";
		if(num>=80) str="합격";
		System.out.println(str);
		
		//삼항 연산자
		String str2 = (num>=80) ? "합격" : "탈락";
		System.out.println(str2);
		
		sc.close();
	}

}
