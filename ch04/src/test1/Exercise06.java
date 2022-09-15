package test1;

public class Exercise06 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n");
		
		for(int a=0;a<5;a++){
			for(int b=5;b>a;b--){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n<-----else----->");
		
		for(int a=0;a<5;a++){
			for(int b=0;b<5-a;b++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
