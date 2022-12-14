package sec1;
//https://docs.oracle.com/javase/8/docs/api/	- [java.io], java.lang, java.util : 자주 사용하던 class, interface 모음
//java.lang = import하지 않아도 자동 적용(자바에 내장된 패키지)
//java.util = 기본 설치는 되어있으나 사용을 위해서 import 필요
public class Api1 {
	public static void main(String[] args) {
		/*
		java.lang (단수)
			Object : 자바 내 최상위 클래스
			System : 기본 입출력(키보드 입력, 모니터 출력), JVM 동작 제어
			Class : 클래스 개념과 클래스 구성요소를 메모리로 전달
			String : 문자역을 출력하고, 다루기 위한 클래스 (간단한 띄어쓰기나 기호로 구분)
			StringBuffer/StringBuilder : 문자열 조작(분리/합체)
			Math : 수학/삼각을 위한 처리 클래스
			Wrapper : 하나의 같은 객체로 감싸는 클래스(손상 방지)	- Character, Byte, Short, Integer, Long, Float, Float, Double, Boolean	: primitive type은 메서드를 가질 수 없으므로 wrapper type의 메서드를 활용
				int a=1004;	//Primitive type
				Integer b = new Integer(1004);	//Wrapper type - 대문자 시작
				int a1=b; //Wrapper type -> Primitive (언박싱)
				Integer b1=a;	//Primitive -> Wrapper type	(박싱)
				
				String abc = "1004";	int data = Integer.parseInt(abc);	System.out.println();
				
				byte c=66;
				Byte d =  66;	//new로 묶으면 1byte라 에러발생
				
				short e=1000;
				short f=1000;	
				
				char <=> Character
				float <=> Float
				double <=> Double
				long <=> Long 
				boolean <=> Boolean
		*/
	}
}
