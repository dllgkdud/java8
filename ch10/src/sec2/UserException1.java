package sec2;
//UserException을 메소드를 활용하여 자동 예외 발생
public class UserException1 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (RunException e) {
			e.getMessage();	//브라우저가 있어야 지정 메세지가 나온다.(웹에서만 확인 가능)
			//e.printStackTrace();
		}
	}
	public static void method1() throws RunException {
		throw new RunException("사용자 예외");	//throw: 예외발생 객체 생성 = 자동예외발생
	}
}
