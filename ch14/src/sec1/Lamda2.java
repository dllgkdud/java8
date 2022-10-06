package sec1;
//함수적 인터페이스 - 하나의 인터페이스에 하나의 메소드만 추상체로 정의할 수 있다.
@FunctionalInterface
interface Calc {	//매개x 리턴x
	public void method1();
}
@FunctionalInterface
interface Calc2 {	//매개o 리턴x - Consumer
	public void method2(int x, int y);
}
@FunctionalInterface
interface Calc3 {	//매개x 리턴o - Supplier
	public int method3();
}
@FunctionalInterface
interface Calc4 {	//매개o 리턴o - Operator( 매개/리턴의 데이터 타입이 일치하는 경우 ) <> Function( 매개/리턴의 데이터 타입이 서로 다른 경우 )
	public int method4(int x, int y);
}
public class Lamda2 {
	public static void main(String[] args) {
		//인터페이스명 객체명 = (매개변수) -> 리턴값
		Calc4 max = (x, y) -> x>y ? x:y;	//구현체 등록
		int data = max.method4(20, 18);
		System.out.println("최대값: "+data);
	}

}
