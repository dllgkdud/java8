package sec2;

public class Cast2 {

	public static void main(String[] args) {
		int a=100, b=23, c;	//정수
		float d, e, f;	//실수
		c = a / b;	//4 -> 자동 형 변환
		System.out.println("c="+c);
		d = (float) a / b;	//4.0 -> 강제 형 변환
		System.out.println("d="+d);
		e = 500 / 3.0f;	//정수로 연산되는 경우 f를 붙여 실수로 만들어준다. 3 -> 3.0f - 형 변환 연산 
		System.out.println("e="+e);
		System.out.println("byte : "+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		System.out.println("short : "+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		
	}

}
