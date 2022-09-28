package sec3;

public class Car {
	Tire frontLeftTire = new Tire(7, "왼쪽 앞");
	Tire frontRightTire = new Tire(7, "오른쪽 앞");
	Tire backLeftTire = new Tire(5, "왼쪽 뒤");
	Tire backRightTire = new Tire(6, "오른쪽 뒤");
	
	public Car(){}
	public int run(){
		System.out.println("자동차가 달립니다.");
		if(frontLeftTire.roll()==false){ stop(); return 1; }
		if(frontRightTire.roll()==false){ stop(); return 2; }
		if(backLeftTire.roll()==false){ stop(); return 3; }
		if(backRightTire.roll()==false){ stop(); return 4; }
		return 0;
	}
	
	/*
	if(frontLeftTire.roll()==false){ stop(); return this.frontLeftTire+" 펑크"; }
	if(frontRightTire.roll()==false){ stop(); return this.frontRightTire+" 펑크"; }
	if(backLeftTire.roll()==false){ stop(); return this.backLeftTire+" 펑크"; }
	if(backRightTire.roll()==false){ stop(); return this.backRightTire+" 펑크"; }
	else{ return "계속 달립니다." }
	*/
		
	public void stop(){
		System.out.println("자동차가 멈춥니다.");
	}
}
