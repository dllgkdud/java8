package test10;

import test10.Util.Container;

public class ContainerExample {
	public static void main(String[] args) {
		Container container1 = new Container();
		container1.set("홍길동");
		String str = container1.get();
		
		Container container2 = new Container<Integer>();
		container2.set(6);
		int value = container2.get();
	}
}
class Util{
	public class Container<T>{
		private T t;
		public T get() {
			return t;
		}
		public void set(T t) {
			this.t = t;
		}
	}
}