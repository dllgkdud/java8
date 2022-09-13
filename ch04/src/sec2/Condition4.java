package sec2;

import java.util.Scanner;

public class Condition4 {

	public static void main(String[] args) {
		//점수를 입력받아 등급을 구하되, 90점 이상이면 "A", 80점 이상이면 "B", 70점 이상이면 "C", 60점 이상이면 "D", 그 외에는 "F" 등급으로 지정한다.
		//상품은 등급이 "A"이면 "100년 묵은 산삼", "B"이면 "한우갈비세트", "C"이면 "백화점 상품권", "D"이면 "문화상품권", "F"는 "공책"으로 한다.
		/*
		switch (기준변수) {
			case "값1":
				실행문1;
				break;
			case "값2":
				실행문2;
				break;
			......
			default:
				실행문n;
		}
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("점수: ");
		int jum = sc.nextInt();
		String rank = "";
		if(jum>=90){
			rank = "A";
		} else if(jum>=80){
			rank = "B";
		} else if(jum>=70){
			rank = "C";
		} else if(jum>=60){
			rank = "D";
		} else {
			rank ="F";
		}
		String goods = "";
		switch(rank){
			case "A":
				goods="100년 묵은 산삼";
				break;
			case "B":
				goods="한우갈비세트";
				break;
			case "C":
				goods="백화점 상품권";
				break;
			case "D":
				goods="문화상품권";
				break;
			default:
				goods="공책";
		}
		System.out.println("당신은 "+jum+"점이며, \n"+rank+"등급이고, \n"+goods+"을(를) 받아갈 수 있다.");
		sc.close();
	}

}
