package sec1;
/*
비선점형: 스레드객체.run()
선점형: 스레드객체.start()
스레드 주기설정: Thread.sleep()
스레드 우선순위 설정: 스레드객체.setPriority()
스레드 우선순위 값 가져오기: 스레드객체.getPrioirty()
스레드의 상태
① 생성(New Thread): Create -> ② 실행대기(new Runnable): Wait -> ③ 실행(start(), run()) -> ④ 선점(blocking=preemption) 
-> ⑤ 대기(sleep()): Wait -> ⑥ 재실행(run()): Wake Up -> ⑦ 정상종료(Interrupt): Terminated
 */

public class ThreadEx2 {
	public static void main(String[] args) {
		Thread th0 = new Thread(new ThreadWithRunnable());
		Thread th1 = new Thread(new ThreadWithRunnable());
		
		//스레드의 우선순위 변경: 먼저 처리되기 위해서	//0101010101	기존 설정한 테이블에서 저장된 우선순위는 변경되어도 출력이 바뀌지 않아 수동으로 설정이 필요하다
		th1.setPriority(10);		//0101101001
		
		th0.start();
		th1.start();
		
		System.out.println("th0의 우선순위: "+th0.getPriority());
		System.out.println("th1의 우선순위: "+th1.getPriority());
	}
}
