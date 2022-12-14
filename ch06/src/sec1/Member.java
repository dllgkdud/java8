package sec1;

//public으로 설정된 클래스는 project 내에서 자유롭게 적용할 수 있다.
//default는 접근 제한자를 생략했을 때 발생하며, package 내에서 적용할 수 있다.
//private는 현재 클래스 내부에서만 접근이 가능하다.(데이터 저장 시 필요)
public class Member {	//java에 class는 여러 개를 설정할 수 있지만 public class는 하나만 존재해야한다.
	private String id;			//클래스의 멤버 필드	(field)
	private String password;
	private String name;
	private String address;
	private String tel;
	private String reg_date;	//date라는 클래스는 없다.
	
	//기본생성자는(Constructor) 선언하지 않아도 자바가 생성자를 묵시적으로 선언함.(생략가능)
	public Member(){}
	
	//생성자(String,String)함수
	public Member(String id, String password){	//Member() - 괄호 내의 선언된 변수는 객체가 아닌 매개변수이다.
		this.id=id;
		this.password=password;
	}
	public Member(String id, String password, String name){
		this.id=id;
		this.password=password;
		this.name=name;
	}
	
	//접근제한자 반환타입 매서드명([매개변수타입 매개변수명,...]){ return 반환변수명 | 값; }
	//접근제한자 void 매서드명([매개변수타입 매개변수명,...]){ 실행문; }
	public String getId() {		//클래스의 멤버 매서드(method)
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	
	
}
