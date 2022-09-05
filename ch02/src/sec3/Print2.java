package sec3;

public class Print2 {

	public static void main(String[] args) {
		int a=100;
		float b=3.14f;
		String c="kim";
		System.out.printf("반지름이 %d인 원은 원주율 %f를 반영해 원의 넓이가 %f이다. %s의 규칙", a, b, b, c);	//데이터 형식에 맞는 출력방식 printf("%(커맷문자)d %f %s", (%각 수에 해당하는 명령)의 값을 나열)
		System.out.printf("%n10진수의 %d는 8진수로 %o이다.", a, a);
		System.out.printf("%n10진수의 %d는 16진수로 %x이다.", a, a);
		
		//java p.62 8번문제
		byte byteValue = 10;
		float floatValue = 2.5f;
		double doubleValue = 2.5;
		
		//byte result= byteValue + byteValue;
		//int result = 5 + byteValue;
		//float result = 5 + floatValue;
		//double result = 5 + doubleValue;
		
	}

}
