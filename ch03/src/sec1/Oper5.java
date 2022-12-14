package sec1;

public class Oper5 {

	public static void main(String[] args) {
		//비트(2진)연산
		int a=10, b=20, c=30, d=40, e, f, g, h;
		e = c & d;
		f = c | d;
		g = ~(c & d);
		h = c ^ d;
		System.out.println("c & d => "+e);	//2진수 and
		System.out.println("c | d => "+f);	//2진수 or
		System.out.println("~(c & d) => "+g);	//2진수 보수
		System.out.println("c ^ d => "+h);	//배타적 or(exclusive or = XOR)
		
		//쉬프트 연산
		System.out.println("d >> 2 => "+(d >> 2));	//오른쪽 쉬프트
		System.out.println("d << 2 => "+(d << 2));	//왼쪽 쉬프트
		System.out.println("d >>> 2 => "+(d >>> 2));	//오른쪽 이중 쉬프트
		System.out.println("d <<< 2는 존재하지 않음 ");	//왼쪽 이중 쉬프트는 연산자가 없다.
		
		//연산 시 부정과 불능 그리고 예외처리
		//System.out.println(a / 0);	//Not a Number (/ by zero) =>NaN(부정)
		//System.out.println("k" / 4);	//Not a Number (/ by)
		//System.out.println('k' / 4);	//문자코드(ascii코드로 인식되어 나누기 가능)
		//System.out.println(a % 0);	//Infinity(불능)
		
		try	{	//예외처리
			int k = 20;
			System.out.println(k / 0);	//실행해야할 구문
		} catch(ArithmeticException e1){
			System.out.println("산술연산에 오류가 발생함");	//실행해야할 구문이 오류발생 시 처리해야할 내용
			//e1.printStackTrace();
		}
	}

}
