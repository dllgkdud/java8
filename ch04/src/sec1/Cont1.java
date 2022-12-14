package sec1;
//제어문: 프로그램 상 작업의 흐름을 제어하기 위한 명령문	- 대부분의 명령문은 제어문에 해당한다.
//제어문은 조건분기문과 반복문으로 구성
public class Cont1 {
	public static void main(String[] args) {
		int a=90;
		if(a>=60) {	//조건 분기문 - 일의 흐름이 조건에 따라 달리 적용해야할 때 사용
			pass();
		} else {
			fail();
		}
		int[] jum = {90,80,60,70,65,85,90};
		int hap=0;
		//반복문: 100명의 점수로 총점을 계산하는 경우와 같이 반복적으로 조건을 수행하는 경우에 사용
		for(int i=0;i<7;i++){
			hap+=jum[i];	//hap=hap+jum[i];
		}
		System.out.println("총점: "+hap);
		
		int b=100;
		if(!(b>=20)){
			commit();
		}	else{
			rollback();
		}
	}
	public static void pass(){		//ppt자료(순서도/흐름도 - flow chart = algorithm)
		System.out.println("합격");
	}
	public static void fail(){
		System.out.println("불합격");
	}
	public static void commit(){
		System.out.println("commit");
	}
	public static void rollback(){
		System.out.println("rollback");
	}
}

	