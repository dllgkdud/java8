package sec1;
//메소드의 매개변수나 리턴 타입을 일반화(범용화)하는 generic method class
//<T,R> R method(T,t)
public class ClassEx3 {
	public static void main(String[] args) {
		//첫 번째 방법
		Box<Integer> box1 = Util.<Integer>boxing(100);
		Box<String> box0 = Util.<String>boxing("김기태");
		int intValue = box1.get();
		System.out.println(intValue);
		String strValue = box0.get();
		System.out.println(strValue);
		//두 번째 방법
		Box<String> box2 = Util.boxing("김기태");
		//String strValue = box2.get();
	}
}
class Util{
	public static <T> Box<T> boxing(T t){	//return(generic) class() method(매개변수타입-generic)
		Box<T> box = new Box<T>();
		box.set(t);;
		return box;
	}
}
class Box<T>{
	private T t;
	public T get() { return t; }
	public void set(T t) { this.t = t; }
	
}
