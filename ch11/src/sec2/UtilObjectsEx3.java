package sec2;

import java.util.Objects;

public class UtilObjectsEx3 {
	public static void main(String[] args){ 
		Student s1 = null;	//이전 s1에서 저장된 값이 존재하여 확실하게 null값을 도출하려면 덧붇인다.
		Student s2 = new Student(4, "정진석");
		Student s3 = new Student(5, "지각생");
	
		if(Objects.isNull(s1)){
			System.out.println("s1은 null입니다.");
		} else{
			System.out.println("s1은 null이 아닙니다.");
		}
		
		if(Objects.nonNull(s1)){
			System.out.println("s1은 null이 아닙니다.");
		} else{
			System.out.println("s1은 null입니다.");
		}
		
		if(s1==null){
			System.out.println("s1은 null입니다.");
		} else{
			System.out.println("s1은 null이 아닙니다.");	//노란 밑줄은 나중에 에러가 날 수 있기에 다른 명령들을 기억하는게 좋음
		}
	}
}
