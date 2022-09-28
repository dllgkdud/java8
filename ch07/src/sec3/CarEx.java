package sec3;

public class CarEx {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		for(int i=0;i<=10;i++){
			int errorLocation = car1.run();
			
			switch(errorLocation){
				case 1:
					System.out.println("왼쪽 앞 바퀴를 'MichelinTire'로 교체합니다.");
					car1.frontLeftTire = new MichelinTire("왼쪽 앞", 12);
					break;
				case 2:
					System.out.println("오른쪽 앞 바퀴를 'HankookTire'로 교체합니다.");
					car1.frontRightTire = new HankookTire("오른쪽 앞", 5);
					break;
				case 3:
					System.out.println("왼쪽 뒷 바퀴를 'KumhoTire'로 교체합니다.");
					car1.backLeftTire = new KumhoTire("왼쪽 뒤", 2);
					break;
				case 4:
					System.out.println("오른쪽 뒷 바퀴를 'HankookTire'로 교체합니다.");
					car1.backRightTire = new HankookTire("오른쪽 뒤", 10);
					break;
			}
			System.out.println();
			System.out.println("**********"+i+"바퀴 종료 **********");
		}
	}

}
