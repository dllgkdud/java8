package sec2;

public class LangObjectEx1 {
	public static void main(String[] args){
		Object obj1 = new Object();
		Object obj2 = new Object();
		if(obj1==obj2 || obj1.equals(obj2)){
			System.out.println("동일");
		}
		String str1 = new String("kim");
		String str2 = new String("lee");

		Integer num1;
		if(str1.equals(str2)){
			System.out.println("동일");
		}
		//if(str3==null){}	//객체는 null값이 허용되지 않지만 class값을 가져와서 사용한 경우에는 null값이 허용된다.
		
		Member mem = new Member();	
		//나중에 데이터를 가져오는 과정이 필요
		System.out.println(mem.name);	//객체명(mem)만 출력하면 해쉬코드(주소)가 그대로 출력한다.
		if(mem==null){	 
			System.out.println("mem 값이 비어 있습니다.");
			//return false;
		}
	}
}

class Member{	//최상위 조상 -> Object
	String name;
	int age;
}