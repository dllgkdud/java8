package sec3;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRocation){
		super(maxRocation, location);	//상위 클래스에서 가져오는 필드는 순서상관없이 기입 가능
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation){
			System.out.println(location+" 'HankookTire' 수명: "+(maxRotation-accumulatedRotation));
			return true;
		} else{
			System.out.println("경고: "+location+" 'HankookTire'에 펑크가 발생했습니다.");
			return false;
		}
	
	}
}