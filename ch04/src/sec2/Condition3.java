package sec2;

import java.util.Scanner;

public class Condition3 { //이것이 자바다  p.108 ~ p.115

	public static void main(String[] args) {
		/* 성명과 세 과목(전산, PG, DB)의 점수를 입력 후 세 과목 점수의 합계로 70점 이상이 판정되면, "합격" 아니면 "탈락" 처리한다.
		평균은 세 과목 점수의 합계에서 3으로 나눈 값으로 하되, 소수점 이하까지 표시되도록 실수로 구하며,
		비고는 세 과목 중 어느 하나라도 90점 이상이 있으면 "과목우수"로 하고, 아니면 공백으로 구한다.
		*입력값 예시
		성명: 김기태
		전산점수: 90
		PG점수: 95
	 	DB점수: 75
	 	*출력 예시
	 	김기태님의 총점은 250점이며, 평균은 83.33333이고, 합격하셨으며, 비고는 과목우수입니다.
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("성명: ");
		String name = sc.next();
		System.out.println("전산점수: ");
		int ep = sc.nextInt();
		System.out.println("PG점수: ");
		int pg = sc.nextInt();
		System.out.println("DB점수: ");
		int db = sc.nextInt();
		int tot = ep+pg+db;				//총점
		double avg = (float) tot / 3;	//평균
		String pan = "탈락";
		if(ep>=70 && pg>=70 && db>=70) pan = "합격";		//판정
		String des = "";
		if(ep>=90 || pg>=90 || db>=90) des = "과목우수";	//비고
		
		System.out.println(name+"의 총점은 "+tot+"이며, 평균은 "+avg+"이고, "+pan+"하셨으며, 비고는 "+des+"입니다.");
		sc.close();
	}

}
