package sec2;

public class Ref1 {

	public static void main(String[] args) {
		String[] names = {"kim", "lee", "park"};
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
		System.out.println("--------------------");
		System.out.println("----- 향상된 for문 -----");	//java 5 이상 적용가능
		for(String name : names){
			System.out.println(name);			
		}

	}

}