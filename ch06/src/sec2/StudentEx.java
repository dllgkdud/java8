package sec2;

public class StudentEx {

	public static void main(String[] args) {
		Student stu1 = new Student("김기태",90,80,90);
		System.out.println("이름: "+stu1.name);
		System.out.println("총점: "+stu1.calcTot());
		System.out.println("평균: "+stu1.calcAvg());
		System.out.println("학점: "+stu1.calcHak());
		System.out.println("판정: "+stu1.calcRes());
	}

}
