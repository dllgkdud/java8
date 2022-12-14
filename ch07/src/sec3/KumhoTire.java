package sec3;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRocation){
		super(maxRocation, location);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation){
			System.out.println(location+" 'KumhoTire' 수명: "+(maxRotation-accumulatedRotation));
			return true;
		} else{
			System.out.println("경고: "+location+" 'KumhoTire'에 펑크가 발생했습니다.");
			return false;
		}
	}
}
