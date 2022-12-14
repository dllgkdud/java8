package sec2;

public class DmbPhoneEx {

	public static void main(String[] args) {
		CellPhone p1 = new CellPhone();
		DmbPhone p2 = new DmbPhone();
		//DmbPhone p3 = new CellPhone();
		DmbPhone p4 = new DmbPhone();
		
		System.out.println(p1.COMPANY);
		System.out.println(p2.COMPANY);
		System.out.println(p4.COMPANY);
		p1.powerOn();
		p2.powerOn();
		p4.powerOn();
		
		//부모 클래스로부터 유도된 객체는 자식 클래스로부터 유도된 객체의 내용으로 변환될 수 있다.
		p1 = p4;	//자동 형변환
		//자식 클래스로부터 유도된 객체는 부모 클래스로부터 유도된 객체의 내용으로 자동 변환되지 않으므로 강제 형변환 필요.
		DmbPhone p6;
		p6 = (DmbPhone) p2;	//강제 형변환
	}

}
