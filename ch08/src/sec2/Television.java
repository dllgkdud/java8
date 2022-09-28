package sec2;

public class Television implements RemoteControl{
	private int volume;	//private으로 필드 설정시 접근 가능한 getter/setter 설정 필요

	@Override
	public void turnOn() {
		System.out.println("TV 전원을 켭니다."); 
	}
	@Override
	public void turnOff() {
		System.out.println("TV 전원을 끕니다.");
	}
	public int getVolume() { return volume; }
	public void setVolume(int volume){
		
		if(volume>RemoteControl.MAX_VOLUME){
			this.volume=RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME){
			this.volume=RemoteControl.MIN_VOLUME;
		} else{
			this.volume=volume;
		}
		System.out.println("현재 볼륨: "+this.volume);
	}
	
}
