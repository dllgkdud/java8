package sec1;

public class Car {
	String company;
	String model;
	private String color;
	private int maxSpeed;
	int speed=100;	//초기값 설정
	int rpm;
	Body body;
	Engine engine;
	Tire tire;
	
	//[접근제한자] 반환타입 메서드명([매개변수타입] [매개변수명], ...){ 실행내용; return 반환변수 또는 값; }
	//반환변수가 가지는 값이나 반환되는 값의 종류가 반환타입과 일치
	
	//[접근제한자] 클래스명 ([매개변수타입] [매개변수명], ...){ this.필드명 = 매개변수명; this([매개변수명 | 값]);
	
	//final static 데이터타입 상수명 = 값;	- 멤버상수(바뀌지 않는 값): 값 입력 시 이후에 수정이 불가(null 설정가능)
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getRpm() {
		return rpm;
	}
	public void setRpm(int rpm) {
		this.rpm = rpm;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Tire getTire() {
		return tire;
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
}
