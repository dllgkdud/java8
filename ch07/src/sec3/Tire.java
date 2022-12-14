package sec3;

public class Tire {
	//멤버 필드
	public int maxRotation;	//최대 회전수(타이어 수명)
	public int accumulatedRotation;	//누적 회전수
	public String location;
	
	//생성자
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	//public Tire(){ super(); }	- 자바에는 object라는 가장 큰 조상 클래스가 존재(자동 생성)
	
	//멤버 메소드
	public boolean roll(){
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation){
			System.out.println(location+" Tire 수명: "+(maxRotation-accumulatedRotation));
			return true;
		} else{
			System.out.println("경고: "+location+" Tire에 펑크가 발생했습니다.");
			return false;
		}
	}
}
