package sec1;
//ClassNotFoundException: 지정한 클래스가 없거나 로딩이 되지 못한 경우에 발생하므로 반드시 예외처리
public class Excaption5 {
	public static void main(String[] args) {
		try {
			Class cla = Class.forName("oracle.jdbc.driver");	//밑줄이 생성되며 surround try/catch로 한번에 적용가능
		} catch (ClassNotFoundException e) {
			System.out.println("알 수 없는 클래스 또는 연결되지 않은 클래스");
			e.printStackTrace();
		} catch (Exception e){
			System.out.println("원인불명");
		} finally{
			System.out.println("종료");
		}
	}

}
