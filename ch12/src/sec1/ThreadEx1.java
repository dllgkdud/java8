package sec1;
//thread: 현재 실행 중인 프로그램 또는 데이터나 프로세스를 의미하며, 실제 컴퓨터에서는 두 개 이상의 thread가 실행중인데 이를 멀티 thread라고 함.
//스레드를 시작하려면 Thread 클래스 또는 ThreadRunnable 인터페이스로부터 상속받아 run 메소드를 기술하고, run 메소드 안에 작업 내용을 작성하여 main() 함수에서 해당 객체를 생성 후 객체 .run()하면 스레드를 시작할 수 있다.
//스레드는 다중 스레드라고 하더라도 순차적으로 처리되어 하나의 스레드가 실행이 완료되면, 다음 스레드를 자동으로 실행한다. -> 비선점형
//다중 스레드에서 우선 순위나 주어진 실행시간이 다 되가니 sleep이 발생하는 동안 다른 스레드가 먼저 처리될 수 있다. -> 선점형
public class ThreadEx1 {
	public static void main(String[] args) {
		//ThreadRunable(인터페이스)로 부터 상속받아 오버라이딩
		Thread th1 = new Thread(new ThreadWithRunnable());
		th1.run();	//thread start
		
		//Thread(클래스)로 부터 상속 받아 run 메소드 선언
		ThreadWithClass th2 = new ThreadWithClass();
		//반드시, Thread(클래스)로 부터 상속 받아 ThreadWithClass(클래스)에 run메소드로 기술해야함
		th2.run();	//thread start
		
		Thread th3 = new ThreadWithClass();	//비선점형
		th3.start();	//thread start
		
		Thread th4 = new Thread(new ThreadWithRunnable());	//선점형
		th4.start();	//thread start
	}
}

class ThreadWithClass extends Thread {
	public void run(){	//run메소드 생성
		for(int i=0;i<10;i++){
			System.out.println(this.getName());
			try {
				Thread.sleep(10);	//1000 ms = 1초 이므로 0.01초(빠른 속도를 지연 - 실행주기 생성)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadWithRunnable implements Runnable {
	// Runnable은 인터페이스이므로 반드시 오버라이딩하여 해당 메소드를 구현체로 기술
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			//현재 실행 중인 thread의 이름 출력
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}