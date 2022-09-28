package sec1;
//인터페이스로부터 상속받는 클래스는 extends 대신 implements를 사용
public class Class1 implements Interface1{
	//인터페이스로부터 상속받는 클래스는 일반 메서드가 추상화되어있으므로 반드시 오버라이딩하여 실체 구현 내용을 기술헤야한다.(// TODO Auto-generated method stub 대신 구현 내용 채우기)
	//반드시 메서드명, 반환타입, 매개변수 등이 같아야 함.
	@Override
	public void method1() {
		System.out.println("메서드1 호출");
	}
	//interface에서 class로 호출할 때 접근제한을 넓혀야 하므로 보통 인터페이스에서 private, public을 많이 사용한다.
	@Override
	public int method(int pa1, String pa2) {
		System.out.println("pa1= "+pa1+", pa2= "+pa2);
		return 0;
	}
	
}
