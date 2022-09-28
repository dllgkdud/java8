package sec2;

	class A {}
	class B extends A{}
	class C extends A{}
	class D extends B{}
	class E extends C{}

public class PromotionEx{
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//부모-자식관계 상에서만 객체를 생성하거나 형변환이 가능하다.
		//자식-부모관계 상에서는 자동 캐스팅이 불가하다.
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = b;
		//B b2 = c;	//형제관계에서는 자동 캐스팅이나 강제 캐스팅이 불가하다.
		B b3 = d;
		//B b4 = e;
	}

}
