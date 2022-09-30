package sec2;

import java.util.Objects;

public class UtilObjectsEx2 {
	public static void main(String[] args) {
		Student s1 = new Student(1, "김기태");
		Student s2 = new Student(2, "강병수");
		Student s3 = new Student(3, "고유진");
		Student s4 = s1;	//얕은 복제 - 하나의 객체(메모리)를 공유하여 실제로는 복제가 된 것은 아니다.	table을 복사해 만든 view에 추가하면 table에도 같은 값이 추가된다.
		System.out.println(s1);	//16진수 주소
		System.out.println(s4);
		System.out.println(s1.hashCode());	//10진수 주소
		System.out.println(Objects.hashCode(s1));	//static으로 적용되어있어 s1.hashCode와 같은 결과값을 낸다.
		System.out.println(s1.sname);
		System.out.println(s4.sname);
		s1.sname="김도연";	//s1과 s4가 함께 변경됨
		System.out.println(s4.sname);
		
		Student s5 = new Student(s1.sno, s1.sname);	//깊은 목제 - 서로 다른 객체(메모리)	table 자체를 복사해 만든 table2에 데이터를 추가해도 table은 바뀌지 않는다.
		System.out.println(s1);
		System.out.println(s5);
	}

}
