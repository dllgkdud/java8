package sec3;

public class Loop6 {

	public static void main(String[] args) {
		// 간격 실행 반복문
		int tot=0;
		for(int i=0;i<=100;i++){	//101번 실행
			if(i%2==1) continue;	//제어문
			tot+=i;	//50번 연산
		}
		System.out.println("0~100까지 짝수의 합계: "+tot);
		
		tot=0;
		for(int i=0;i<=100;i+=2){
			tot+=i;
		}
		System.out.println("0~100까지 짝수의 합계2: "+tot);
		
		tot=0;
		for(int i=1;i<=100;i+=2){
			tot+=i;
		}
		System.out.println("0~100까지 홀수의 합계: "+tot);
		
		tot=0;
		int n=1;
		for(;;){
			if(n>100) break;	//제어문
			tot+=n;
			n+=2;
		}
		System.out.println("0~100까지 홀수의 합계2: "+tot);
	}

}
