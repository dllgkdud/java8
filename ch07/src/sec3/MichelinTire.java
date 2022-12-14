package sec3;

public class MichelinTire extends Tire{
	public MichelinTire(String location, int maxRocation){
		super(maxRocation, location);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation){
			System.out.println(location+" 'MichelinTire' 수명: "+(maxRotation-accumulatedRotation));
			return true;
		} else{
			System.out.println("경고: "+location+" 'MichelinTire'에 펑크가 발생했습니다.");
			return false;
		}
	}
}
