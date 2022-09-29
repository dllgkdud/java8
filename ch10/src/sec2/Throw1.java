package sec2;
//throws는 예외 떠넘기기	- 메소드 실행 시 생기는 오류는 throws exception하여 결과를 확인한다.
public class Throw1 {
	public static void main(String[] args) {
		String name = null;
		nullPassing(name);
		
		int arr[] = new int[3];
		arrayPassing(arr);
	}
	static void arrayPassing(int[]arr) throws
		ArrayIndexOutOfBoundsException, NullPointerException {
		for(int i=0;i<5;i++){
			arr[i] = i*10;
		}
	}
	static void nullPassing(name) throws NullPointerException {
		System.out.println("널 값은 문자열로 변경하여 출력하지 못함");
	}
}

