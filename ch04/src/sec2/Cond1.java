package sec2;

import java.util.Scanner;

public class Cond1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("환영합니다. 재학생 사이트입니다.\n");
		System.out.print("학부 : ");
		String maj = sc.next();
		
			String log = "";
			switch(maj){
				case "교육학부":
					log = "교육학부로 로그인합니다.";
					break;
				case "사회과학부":
					log = "사회과학부로 로그인합니다.";
					break;
				case "인문학부":
					log = "인문학부로 로그인합니다.";
					break;
				case "생명과학부":
					log = "생명과학부로 로그인합니다.";
					break;
				case "공과학부":
					log = "공과학부로 로그인합니다.";
					break;
				case "자연과학부":
					log = "자연과학부로 로그인합니다.";
					break;
				case "간호학부":
					log = "간호학부로 로그인합니다.";
					break;
				default:
					log = "자유전공학부로 로그인합니다.";
			}
		System.out.println(log);
		
		System.out.print("학번 앞 4자리 : ");
		int id = sc.nextInt();
		
			String pan = "";
			if(id>=2020){
				pan = "8/29부터 수강신청이 가능합니다.";
			} else if(id>=2017){
				pan = "8/27부터 수강신청이 가능합니다.";
			} else if(id>=2014){
				pan = "8/24부터 수강신청이 가능합니다.";
			} else{
				pan = "졸업생으로 로그인해주십시오.";
			}
		sc.close();
		System.out.println("공지: "+pan);
	}

}
