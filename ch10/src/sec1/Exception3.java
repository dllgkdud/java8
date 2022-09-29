package sec1;
//① SyntaxError, ② RuntimeError
//실행 시 불거져 나오는 에러들 중 예외 사항들은 미리 사전에 알아서 예외 처리를 해야함
public class Exception3 {
	public static void main(String[] args) {
		String data1 = "1004";
		String data2 = "kim1004";
		
		try{
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			
			System.out.println(val1);
			System.out.println(val2);
			System.out.println(val1+20);
		} catch(NumberFormatException e){
			System.out.println("숫자 형식 데이터가 아니므로 처리되지 못함");
			e.printStackTrace();
		} catch(Exception e){	//모든 exception의 조상 정도로 인식해라
			System.out.println("원인불명의 예외발생");
			e.printStackTrace();
		} finally{
			System.out.println("종료");
		}
	}

}
