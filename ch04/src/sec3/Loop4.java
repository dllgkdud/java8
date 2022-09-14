package sec3;

public class Loop4 {

	public static void main(String[] args) {
		//무한 루프 : 조건이 항상 만족하는 경우 수행되는 반복문
		int a=0, tot=0;
		for(;;){
			a++;
			tot+=a;
			System.out.println("합계: "+tot);
		}
	/*	int n=0, hap=0;
		while(true){
			System.out.println("합계");
			hap+=n;
			n++;
		}
	*/
	}	//for(n=10;n>9;n++) : 항상 만족하는 조건

}
