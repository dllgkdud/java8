package sec1;

public class OuterClassEx {

	public static void main(String[] args) {
		//외부 클래스로부터 유도된 인스턴스 = 외부객체
		OuterClass out1 = new OuterClass();
		out1.method1();
		
		//내부 클래스로부터 유도된 인스턴스 = 내부객체
		OuterClass.Inner in1 = out1.new Inner();
		in1.method1();
		
		//내부 정적(static) 클래스는 인스턴스 생성 시 해당 외부 클래스명 적용
		OuterClass.Inner2 in2 = new OuterClass.Inner2();
		in2.method1();		
		
		//내부 정적 클래스로부터 유도된 인스턴스는 반드시 만들 필요는 없다.
		OuterClass.Inner2.method2();
	}

}
