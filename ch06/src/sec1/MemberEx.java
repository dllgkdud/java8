package sec1;

public class MemberEx {

	public static void main(String[] args) {

		Member mem1=new Member();
		mem1.setId("lhy");
		mem1.setPassword("a1234");
		System.out.println("아이디: "+mem1.getId());
		System.out.println("비밀번호: "+mem1.getPassword());
		System.out.println("이름: "+mem1.getName());
		
		Member mem2=new Member("cea","b1111");
		System.out.println("아이디: "+mem2.getId());
		System.out.println("비밀번호: "+mem2.getPassword());
		
		Member mem3=new Member("lje","b0918","이지은");
		System.out.println("아이디: "+mem3.getId());
		System.out.println("비밀번호: "+mem3.getPassword());
		System.out.println("이름: "+mem3.getName());
		
		MemberCollecter mc = new MemberCollecter();
		mc.join("lhy","a1234","이하영");
		mc.info();
		mc.login("lhy", "a1234");
		mc.info();
	}

}
