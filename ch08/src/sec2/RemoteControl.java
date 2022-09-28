package sec2;

public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상 메서드	-다른 클래스에서 접근 가능한 형태로 구현(선언만)
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//디폴트 메서드	(선언과 구현 내용 기술)
	default void setMute(boolean mute){
		if(mute){
			System.out.println("** 무음모드 **");
		} else {
			System.out.println("** 무음해제 **");
		}
	}
	
	//정적 메서드	(선언과 구현 내용 기술, 객체 생성없이 직접 공유데이터로 간주하며 활용)
	static void changeBattery(){
		System.out.println("-- 건전지 교체 요망 --");
	}
}
