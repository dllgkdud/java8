package sec3;

public class Loop7 {

	public static void main(String[] args) {
		//교차 출력문
		int[][] a = {{60,90,70},{80,70,60},{80,90,80},{100,90,70}};
		for(int i=0;i<a.length;i++){	//i는 첨자이며, 무조건 0부터 시작하는 문자이다.
			System.out.println(a[i][0]+"\t"+a[i][1]+"\t"+a[i][2]);
		}
		System.out.println("-------------------");
		//이중 for문
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}	

}
