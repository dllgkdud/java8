package sec3;
/* singletone: 자바 디자인 패턴 중 오로지 하나의 객체만 생성할 수 있도록 하는 객체 지향 프로그래밍 패턴 */
public class Singletone {	//필요에 따라 하나의 객체만 적용하는 클래스(생성은 가능하나 하나만 출력)	- 정적 클래스로 고정
	private static Singletone single = new Singletone();
	private Singletone(){}
	//메소드명은 변경 가능하지만 보편적으로 getInstance를 적용 (static 고정	- 공유객체)
	static Singletone getInstance(){	//접근제한자는 default, public으로 해야 호출 가능
		return single;
	}	
}
