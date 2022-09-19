package sec1;

public class MemberCollecter {
	Member mem = new Member();
	boolean log = false;
	
	public void join(String id, String password, String name){
		mem.setId(id);
		mem.setPassword(password);
		mem.setName(name);
		System.out.println("가입이 정상적으로 완료되었습니다.");
	}
	public void login(String id, String password){
		if(mem.getId().equals(id) && mem.getPassword().equals(password)){
			log=true;
			System.out.println(id+"님이 로그인 하였습니다.");
		} else{
			log=false;
			System.out.println("다시 로그인 해주십시오.");
		}
	}
	public void info(){
		if(log){
			System.out.println("아이디: "+mem.getId());
			System.out.println("비밀번호: "+mem.getPassword());
			System.out.println("이름: "+mem.getName());
		} else{
			System.out.println("로그인이 필요합니다.");
		}
	}
}
