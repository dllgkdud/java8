package sec1;

public class Type2 {
		//이것이 자바다 p.138~p.144
	public static void main(String[] args) {
		//reference type(참조형)은 여러 개(다수)의 데이터를 저장하기 위한 기억장치로써 null값이 허용된다.
		//참조형의 종류: array(배열형), enum(열거형), class, interface, map, list, set, ...
		int[] arr1 = {10,20,30};
		int[] arr2 = {10,20,30};
		//int[] arr3 = null;	reference type는 null값을 허용하나  pointer(heap영역의 주소)가 null이 되어 참조할 수 없는 예외가 발생된다.
		int[] arr3 = {20,40,60};
		//int a = null; primitive type은 null값일 수 없다.
		//arr3[0] = 20;
		// -> Exception in thread "main" java.lang.NullPointerException at sec1.Type2.main(Type2.java:11)
		//System.out.println(arr3[0]);
		//System.out.println(arr3[1]);
		System.out.println(arr1);	
		System.out.println(arr2);	//[I@를 제외한 나머지 숫자가 주소명이다.
		System.out.println(arr1==arr2);
		System.out.println(arr1!=arr2);
		//참조명은 직접비교하게 되면, 포인터주소룰 비교하게 되므로 서로 다르게 인식된다.(간접비교형)
		System.out.println(arr3[0]);
	}

}
