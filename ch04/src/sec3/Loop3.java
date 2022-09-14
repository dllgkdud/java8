package sec3;

public class Loop3 {

	public static void main(String[] args) {	//do-while 조건이 맞지 않지만 한 번 이상 실행이 필요한 경우에 사용
	/*	반복변수 = 초기값; ①
	 	do { 
	 		실행문장; ②
	 		증감식; ③
	 	} while(조건식); ④
	   ① -> ② -> ③ -> ④ -> ② -> ③ -> ④ ... -> ② -> ③ -> ④ -> stop
	   그러므로 실행부터 하고, 조건을 나중에 비교하므로 최소 1번 이상 실행한다.
	*/
		int a=10, tot=0;
		do {
			tot+=a;
			a++;
		} while(a<10);
		System.out.println("a= "+a+", tot= "+tot);
	}
	

}
