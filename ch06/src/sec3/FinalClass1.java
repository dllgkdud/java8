package sec3;

public class FinalClass1 {
	final static double PI = 3.14;	//멤버상수: 누구나 알 수 있는 상식의 정보는 상수로 선언할 수 있다. (상수의 이름은 대문자)
	final static String PITAG = "(a^2)+(b^2)==c^2";
	static final byte MIN_VALUE = 0;
	static final byte MAX_VALUE = 100;	//값을 고정하면 굳이 int로 변수설정하지 않아도 호출된다.
	final static double CIRCLE_LENGTH(){	//항상 같은 결과를 얻는 메서드
		return PI*100;
	}
}
