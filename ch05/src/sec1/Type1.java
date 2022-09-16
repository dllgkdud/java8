package sec1;

public class Type1 {

	public static void main(String[] args) {
		//Primitive type(기본형) : 하나의 저장소(변수)에 하나의 데이터만 저장되는 타입(단일기억장소)
		//사용 시에 반드시 초기화 진행해야한다.
		//기본형 자료는 단일 기억만 하므로 스택과 같은 기억장소에 저장된다.
		//스택(stack)은 LIFO(Last In First Out)구조의 기억장소로 가장 마지막에 입력된 데이터가 가장 먼저 출력될 수 있다. (하나의 입출구를 가진다.)
		//문제 발생 시 경고창이 실행되는 인터럽트는 스택에 저장된다.
		//큐(quene)는 FIFO(First In First Out)구조의 기억장소는 순서대로 입출력된다.	(입구와 출구가 서로 다르다.)
		//프로세스 스케줄링은 FIFO 구조로 작동된다.
		//데크(deque)는 스택과 큐의 단점을 보완하여 사용되는 저장타입이다.
		//리스트(list)는 주로 배열함수를 적용하고 저장하는 데 사용된다.
		
		short d=150;
		int e=150;
		System.out.println(d==e);
		System.out.println(d!=e);	//primitive type의 변수는 타입이 달라도 값을 직접 비교한다.
	}

}
