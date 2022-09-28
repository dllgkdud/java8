package sec3;

public class MotorCycle {
	Tire front = new Tire(10, "앞");
	Tire back = new Tire(8, "뒤");
	
	public MotorCycle(){}
	public int run(){
		System.out.println("오토바이가 달립니다.");
		if(front.roll()==false){ stop(); return 1; }
		if(back.roll()==false){ stop(); return 2; }
		return 0;
	}
	public void stop(){
		System.out.println("오토바이가 멈춥니다.");
	}
	
}
