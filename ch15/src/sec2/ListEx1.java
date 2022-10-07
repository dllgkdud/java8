package sec2;

import java.util.ArrayList;
import java.util.List;

//게시판, 회원 목록 작성 시 사용
public class ListEx1 {
	public static void main(String[] args) {
		List<String> lst1 = new ArrayList<String>();
		lst1.add("김태엽");	//.append()와 같은 기능 - 요소 추가
		lst1.add("유광현");
		lst1.add("한태헌");
		System.out.println(lst1);
		lst1.remove(1);		//요소 제거
		System.out.println(lst1);
		lst1.add("정진석");
		lst1.add("박정우");
		lst1.add("조민재");
		lst1.add("김지훈");
		System.out.println("요소 개수: "+lst1.size()+(lst1));
		for(int i=0;i<lst1.size();i++){
			System.out.println(i+"번째 이름"+lst1.get(i));	//요소를 하나씩 출력(특정 인덱스 번째에 접근)할 때 사용하는 명령어
		}
		
		if(lst1.contains("유기태")){	//데이터의 존재 유무 파악
			System.out.println("해당 데이터가 존재합니다.");
		}
		
		List<String> lst2 = new ArrayList<String>();
		if(lst2.isEmpty()){			//리스트 내의 요소 유무 검증
			System.out.println("리스트가 비어있습니다.");
			lst2.add("안효준");
		} else{
			lst2.clear();			//리스트 비우기
		}
	}

}
