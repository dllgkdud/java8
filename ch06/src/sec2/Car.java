package sec2;

public class Car {
	String name;	//멤버 필드: 객체(instance)가 가지는 특성을 저장
	String fuel;
	int cc=1000;
	int speed;
	final static int MAX_SPEED=500;	//멤버 상수: 값이 한 곳(static)에 저장되어 더 이상 바뀌지 않는다(final).(대문자 작성)
	final static int MIN_SPEED=0;	//멤버 상수는 반드시 초기화가 되어야 하며, 그 값은 바뀌지 않는다.
	//[접근제한자] [수정자] 데이터타입 필드명;
	
	public Car(){ }	//기본생성자 - 선언 또는 기술하지 않아도 자바에서 자동으로 생성(생략가능)
	public Car(String name) {this.name=name;}
	public Car(String name, String fuel) {
		this(name,fuel,1000);	//현재 클래스의 생성자 함수 -> this()
	}
	public Car(String name, String fuel, int cc) {
		this(name,fuel,cc,0);
	}
	public Car(String name, String fuel, int cc, int speed) {
		this.name=name; this.fuel=fuel; this.cc=cc; this.speed=speed;	//this.필드명 -> 현재 객체 자신의 필드
	}
	//생성자(Constructor): 객체를 생성하는 함수로서 클래스명과 동일해야 함
	//[접근제한자] 클래스명(데이터타입 매개변수1,2,...){ }
	//this = 현재 객체, this() = 생성자 함수
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	//메서드(Method): 객체의 활동, 객체의 행위(동사), 객체가 가진 기능 등을 기술하는 항목
	//[접근제한자] 반환타입 메서드명([데이터타입 매개변수]){활동/행위/기능}
	//getter Method: 현재 객체의 속성(멤버 필드)에 저장된 데이터 값을 가져온다.
	//setter Method: 현재 객체의 속성(멤버 필드)에 값을 저장한다.
	
	public void bootUp() {	//return(반환타입)이 없다면 void로 표시
		System.out.println("시동을 켭니다.");	//객체의 행위,활동
	}
	public void bootOff() {
		System.out.println("시동을 끕니다.");
	}
	public int speedUp() {	//반환타입(int)이 존재하면 반드시 return 후 타입에 맞는 값 적용
		System.out.println("엑셀레이터를 밟습니다.");
		if(this.speed<this.MAX_SPEED) {	//속도의 증가는 최고 속도까지 제한
			this.speed=this.speed+10;
		}
		return this.speed;	//따로 속도를 제한하는 if문이 없다면 return 뒤에 전위/후위 연산을 구분해서 속도를 증감시킨다.
	}
	public int speedDown() {
		System.out.println("브레이크를 밟습니다.");
		if(this.speed>this.MIN_SPEED){
			this.speed=this.speed-10;
		}
		return this.speed;
	}
	public int speedInfo() {
		return speed;		
	}
	public void speedPrint(){
		System.out.println("현재속도: "+this.speed);	//현재속도를 출력하는 두 가지 방식
	}
	public String fuelInfo() {
		return fuel;
	}
}
