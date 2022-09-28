package sec1;
//다중 상속: implements로 여러 인터페이스를 상속받을 수 있다.
public class Clazz implements Interface1, Interface2{

	@Override
	public void method1() {	}

	@Override
	public int method(int pa1, String pa2) {return 0;}

	@Override
	public void method5() { }

	@Override
	public int method6(String a) { return 0; }
}
