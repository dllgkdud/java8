package sec2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sec1.Student;

public class ListEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> sList = new ArrayList<Student>();
		//학생리스트 선언
		boolean ck = true;
		while(ck){
			//작업번호: 1.학생추가, 2.학생검색, 3.학생수정, 4.학생삭제, 5.종료
			System.out.println("리스트 번호: ");
			int i = 0;
			switch(ck){
				i++;
				case 1:
					Student s = new Student();
					s.setNum(i);
					System.out.println("\n학생 이름: ");
					s.setName(sc.next());
					System.out.println("\n학생 점수: ");
					s.setScore(sc.nextInt());
					insert(s);
					break;
				case 2:
					System.out.println("검색할 학생 번호: ");
					s.setName(sc.next());
					s = sc.select(bun);
					System.out.println("학생 번호: "+s.getNum());
					System.out.println("학생 이름: "+s.getName());
					System.out.println("학생 점수: "+s.getScore());
					break;
				case 3:
					System.out.println("수정할 학생 번호: ");
					int no = sc.nextInt();
					s.setNum(no);
					System.out.println("\n학생 이름: ");
					s.setName(sc.next());
					System.out.println("\n학생 점수: ");
					s.setScore(sc.nextInt());
					update(s);
					break;
				case 4:
					System.out.println("삭제할 학생 번호: ");
					int no2 = sc.nextInt();
					s.setNum(no2);
					delete(s);
					break;
				case 5:
					System.out.println("학생명단\n번호\n이름\n점수");
					for(int j=0;j<sList.size();i++){
						Student r = new Student();	//한 건씩 출력하려면 객체를 새로 정의해야함
						r=sList.get(a);
						int col1 = r.getNum();
						String col2 = r.getName();
						int col3 = r.getScore();
						System.out.println(col1+"\t"+col2+"\t"+col3);
					}
					break;
				default:
					ck=true;
			}
			i++;
		}
	}

	static void insert(Student s){	//학생추가
		sList.add(s);	//리스트에 요소 추가
	}
	static Student select(int i){	//학생검색	
		Student s = new Student();
		s = sList.get(i);
		return s;
	}
	static void update(Student s){	//학생수정
		Student t = new Student();
		t.setNum(s.getNum());
		t.setName(s.getName());
		t.setScore(t.getScore());
		sList.set(s.getNum(),t);	//리스트의 요소 값 변경
	}
	static void delete(Student s){	//학생삭제
		sList.remove(s.getNum());	//리스트의 요소 삭제
	}
}
