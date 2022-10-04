package sec5;

import java.util.Arrays;

public class ArraysEx1 {
	public static void main(String[] args) {
		char[] arr = {'j','a','v','a',' ','o','b','j','e','c','t'};
		System.out.println(arr);	//System.out.println(arr.toString());은 저장 주소 호출
		
		char[] arr2 = Arrays.copyOf(arr, arr.length);	//문자 배열 전체 복사
		System.out.println(arr2);
		
		char[] arr3 = Arrays.copyOfRange(arr, 0, 4);	//end에 적용되는 숫자는 미만의 범위로 적용
		System.out.println(arr3);
		
		System.out.println("같은 지 비교1: "+(arr==arr2));	//주소 비교
		System.out.println("같은 지 비교2: "+Arrays.equals(arr, arr2));	//값 비교(얕은 복제 비교)
		//System.out.println("같은 지 비교3: "+Arrays.deepEquals(arr, arr2));	//주소+값 비교(단, 같은 기억장소를 의미하는 주소가 다를 경우 서로 베교될 수 없다. - 깊은 복제 비교)
		
		int[] jum = {95, 100, 85, 90, 80};
		Arrays.sort(jum);	//오름차순 정렬
		for(int pt : jum){
			System.out.println("점수: "+pt);
		}
		
		String[] names = {"박정우", "한태헌", "조민재", "김연정"};
		System.out.println("정렬 전");
		for(String name : names){
			System.out.println("이름: "+name);
		}
		Arrays.sort(names);
		System.out.println("정렬 후");
		for(String name : names){
			System.out.println("이름: "+name);
		}
		
		int idx = Arrays.binarySearch(names, "박정우");
		System.out.println("박정우는 "+(idx+1)+"번 입니다.");
	}
}
