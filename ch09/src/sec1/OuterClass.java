package sec1;
//중첩 클래스: 클래스 내부에 클래스가 있는 클래스로 외부 클래스와 내부 클래스로 구분한다.
//외부 클래스(메인 클래스)
public class OuterClass {
	int field1;	//멤버필드
	public OuterClass(){}	//생성자
	public void method1(){	//멤버 메소드
		System.out.println("외부 클래스");
	}
	
	//내부 클래스(멤버 클래스)
	class Inner{
		int field1;	//내부 클래스 멤버필드
		public Inner(){}	//내부 클래스 생성자
		public void method1(){	//내부 멤버 메소드
			System.out.println("내부 클래스");
		}
	}
	static class Inner2{
		int field1;	//내부 정적 클래스 멤버필드
		static int field2;
		public Inner2(){}	//내부 정적 클래스 생성자
		public void method1(){	//내부 정적 클래스 멤버 메소드
			System.out.println("내부 정적 클래스");
		}
		static public void method2(){
			System.out.println("내부 정적 클래스2");
		}
	}
}
