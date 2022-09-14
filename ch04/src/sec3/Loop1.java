package sec3;

public class Loop1 {

	public static void main(String[] args) {
		//int a = 8;	단일기억장소(직접저장타입)					//배열기억장소	: [] 내 인덱스를 가지고 여러 장소를 기억한다.
		int[] data = {90,80,70,65,75,95,85,60,90,95};	//data[0]~data[9] - 여러 기억장소(간접저장타입)
		int tot = 0;
	/*		①			  ②	  ③
	  	for(반복변수 선언 및 초기화;조건식;증감식){
			④ 반복할 실행문;
		}
		반복변수가 부여된 초기값으로 시작하여 증감식에 따라 증감하다가 조건식이 만족하지 않으면 더 이상 실행하지 않음
		① -> ② -> ④ -> ③ -> ② -> ④ -> ③ -> ② -> ④ ...-> ③ -> ②  -> stop
	*/
		for(int a=0;a<data.length;a++){	//조건을 만족하면 계속 실행하며, 만족하지 않을 때 멈춘다. a가 0부터 1씩 증가하며 10전에 멈춘다.
			System.out.println(a+"번째 사람의 점수 : "+data[a]);
			tot+=data[a];	//누산 : data[0]+tot=tot 0번째 위치한 데이터와 초기화한 tot의 합계 =90부터 계속해서 data값을 더해준다.
		}
		double avg = (float) tot / data.length;	//.length : 배열의 갯수
		System.out.println("전체 총점: "+tot+", 전체 평균: "+avg);
	}

}
