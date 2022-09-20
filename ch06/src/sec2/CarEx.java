package sec2;

public class CarEx {

	public static void main(String[] args) {
		Car car1=new Car("롤스로이스","가솔린",4000);
		car1.bootUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		System.out.println("현재 속도: "+car1.speedInfo());
		car1.speedDown();
		for(int i=0;i<100;i++){
			car1.speedDown();
		}
		System.out.println("현재 속도: "+car1.speedInfo());
		car1.bootOff();
		System.out.println("최고 속도: "+Car.MAX_SPEED);		//상수로 고정된 항목은 인스턴스를 부여하지 않고 해당 클래스를 덧붙인다.
		System.out.println("최저 속도: "+Car.MIN_SPEED);
	}

}
