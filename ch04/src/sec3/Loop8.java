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
		int pro=2;
		for(int a=1;a<10;a++){
			pro*=a;
		}
		System.out.println(pro);
	}

}