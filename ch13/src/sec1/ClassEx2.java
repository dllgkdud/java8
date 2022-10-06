package sec1;
//키와 값을 공통으로 갖거나 두 개의 클래스로 일반화 클래스를 만드는 경우 MAP 구조를 상속 받아서도 가능
public class ClassEx2 {
	public static void main(String[] args) {
		Moving<String, Integer> m1 = new Moving<>();
		m1.key = "age";
		m1.value = 40;
		Moving<Car, Tire> m2 = new Moving<>();
	}

}
//<대문자>로 쓰는 게 관례
class Moving<K, V> {	//key, value를 타입에서 활용 가능(=Dictionary)
	public K key;
	public V value;
}
class Car {}
class Tire {}
