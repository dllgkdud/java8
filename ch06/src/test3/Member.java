package test3;

public class Member {
	String name;	//멤버필드(Field = Attribute = Property)
	String id;
	String password;
	int age;
	
	public Member(String name){}	//생성자(Constructor)
	public Member(String name, String id){
		this.name=name; this.id=id;
	}
	public void setName(String name){ this.name = name; }	//메소드(Method)
	
}
