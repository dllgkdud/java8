package sec1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class CollectionEx4 {
	public static void main(String[] args) {
		Map map1 = new HashMap();	//인터페이스 선언은 가능하지만 생성은 불가능하다.
		map1 = new Hashtable();
		map1 = new TreeMap();
		map1 = new Properties();	//특정 개체의 클래스를 저장할 수 있는 인터페이스
		
		HashMap map2 = new HashMap();
		
		method1(map1);
		method1(map2);
	  //method2(map1);
		method2(map2);
	}
	static void method1(Map m){ }
	static void method2(HashMap m){ }
}
