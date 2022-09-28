package test4;

public class Child extends Parent{
	private String name;
	
	public Child(){
		this("홍길등");
		System.out.println("Child() call");
	}
	public Child(String name){
		this.name=name;
		System.out.println("Child(String name) call");
	}
}
