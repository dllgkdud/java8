package sec3;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		int jum[] = new int[5];	//참조형은 초기화하지 않아도 자동으로 초기화를 진행하지만 기본형은 반드시 초기화를 진행해야한다.
		Scanner sc = new Scanner(System.in);
		for(int n=0;n<jum.length;n++){	//지역변수형태의 반복문
			System.out.print((n+1)+"번째 사람 점수 : ");
			jum[n] = sc.nextInt();
		}
	/*	반복변수=초기값 ①
		while(조건식){ ②
			반복실행문; ③
			증감식; ④
		}
		① -> ② -> ③ -> ④ -> ② -> ③ -> ④ ... -> ②  -> stop
	*/	
		int n=0;
		int tot=0;
		while(n<jum.length){	//전역변수형태의 반복문
			System.out.println("점수 "+(n+1)+" : "+jum[n]);
			tot+=jum[n];
			n++;
		}
		System.out.println("전체 총점 : "+tot);
		sc.close();
	}

}
