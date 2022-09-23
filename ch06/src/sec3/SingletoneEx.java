package sec3;

public class SingletoneEx {

	public static void main(String[] args) {
		//Singletone single1 = new Singletone();
		Singletone single1 = Singletone.getInstance();
		Singletone single2 = Singletone.getInstance();
		Singletone single3 = Singletone.getInstance();
		System.out.println(single1);
		System.out.println(single2);
		System.out.println(single3);	//오로지 하나만 만들어지기에 객체 주소가 동일하다.(한 사람에게 이름을 여러개 부여)
		
		if(single1==single2){
			System.out.println("single1==single2");
		} else{
			System.out.println("single1!=single2");
		}
	}

}
