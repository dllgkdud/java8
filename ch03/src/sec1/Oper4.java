package sec1;

public class Oper4 {

	public static void main(String[] args) {
		int a=200, b=100, c=20, d=10;
		//비교 연산자(==, !=, >, >=, <, <=) true or false로 산출  - (법정용어) 파악★
		//== 같다 (이다)
		//!= 같지 않다(다르다)
		//> 크다(초과==후)
		//>= 크거나 같다(이상==이후)
		//< 작다(미만=전)
		//<= 작거나 같다(이하==이전)
		System.out.println("a==b => "+(a==b));	//false
		System.out.println("a!==b => "+(a!=b));	//true
		System.out.println("a>b => "+(a>b));	//true
		System.out.println("a>=b => "+(a>=b));	//true
		System.out.println("a<b => "+(a<b));	//false
		System.out.println("a<=b => "+(a<=b));	//false
		System.out.println("a가 문자열이 맞습니까? => "+a instanceof String);	//true	밑줄이 생기면 ctrl+shift+o
		int pencils = 534, student = 30;
		int pencilsPerStudent = (pencils / student);
		System.out.println(pencilsPerStudent);
		int pencilsLeft = (pencils % student);
		System.out.println(pencilsLeft);
		
		int value = 356;
		System.out.println(value - (value % 300));
		
		int lengthTop = 5, lengBottom = 10, height = 7;
		double area = (height * (double)(lengthTop + lengBottom) / 2);
		System.out.println(area);
		
		
		//논리 연산자(입력1 && 입력2, 입력1 || 입력2	- 이항연산	 !(입력)	- 단항연산)
		System.out.println("a>b && c<d => "+(a>b && c<d));	//false
		System.out.println("a<b || c<d => "+(a<b || c<d));	//false
		System.out.println("!(a<b) => "+(!(a<b)));	//true
		
		//삼항 => 조건 ? 참일때식 : 거짓일때식
		System.out.println(a>=b ? "크거나 같다" : "작다");	//"크거나 같다"
		int score = 85;
		String result = (!(score>90))? "가" : "나";
		System.out.println(result);
	}

}
