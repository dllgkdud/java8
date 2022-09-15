package sec3;

public class Loop8 {

	public static void main(String[] args) {
		// 이중 for문을 활용하여 아래와 같은 형태의 구구단을 출력	교재  ~ p.134(과제)
/*
	2*1=2	3*1=3	...	9*1=9
 	2*2=4
  	...
  	2*9=18	3*9=27	... 9*9=81
 */
		for(int a=1;a<=9;a++){
			for(int b=2;b<=9;b++){
				System.out.print(b+"*"+a+"="+(a*b)+"\t");
				
			} System.out.println("\n");
		}
		System.out.println("\n");
		System.out.println("수열 : 팩토리얼의 합계 출력");
		//결과: 1!+2!+3!+4!+5!+6!+7!+8!+9!+10!
		int pac=1;
		long res=0;
		for (int x=1;x<=10;x++){
			pac*=x;	//1!~10!까지 각각의 값
			res+=pac;	//총 합계
		}
		System.out.println("1!+2!+...+10! = "+res);
	}

}
