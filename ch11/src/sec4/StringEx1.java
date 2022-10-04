package sec4;
//String 클래스에 속하는 메서드
public class StringEx1 {
	public static void main(String[] args) {
		String str1 = new String("LeeHaYoung");
		
		System.out.println("str1= "+str1);
		System.out.println("forth char: "+str1.charAt(3));	//※
		System.out.println("str compare: "+str1.equals("leehayoung"));
		
		byte[] char1 = str1.getBytes();	//문자열을 한 글자씩 바이트 단위로 분리
		System.out.println("char1은 String을 1글자씩 분리: "+char1);	//char1의 주소 출력
		charPrint(char1);
		int a = (char) str1.indexOf("H");	//※해당 문자를 찾기
		System.out.println("문자의 "+a+"번째 문자");	//중복될 경우 가장 먼저 찾은 문자의 위치
		String data = str1.substring(3, 5);	//※
		System.out.println("index between 3 t0 5: "+data);
		System.out.println("lower: "+str1.toLowerCase());
		System.out.println("upper: "+str1.toUpperCase());
		String name = "My name is Hayoung, Lee  ";
		System.out.println("length(): "+name.length());
		System.out.println("before remove blank: "+name.trim().length());
		System.out.println("after remove blank: "+name.trim()+", string: "+name.trim().length());
		
		int b = 2022;
		System.out.println(String.valueOf(2022)+2022);	//문자열로 형변환
		System.out.println();
		System.out.println("to binary: "+Integer.toBinaryString(b));
		System.out.println("to oxcagon: "+Integer.toOctalString(b));
		System.out.println("to hexagon: "+Integer.toHexString(b));
		
		String c1 = "11111100110";
		String c2 = "3746";
		String c3 = "7e6";
		System.out.println("10진수로 변환: "+Integer.valueOf(c1, 2));
		System.out.println("10진수로 변환: "+Integer.valueOf(c2, 8));
		System.out.println("10진수로 변환: "+Integer.valueOf(c3, 16));
		
		String str2 = str1.replace("L", "R");
		System.out.println("name: "+str2);
		
		String str3 = str1.replace("Lee", "Ree");
		System.out.println("name: "+str3);
		
	}
	static void charPrint(byte[] data){
		for(int i=0;i<data.length;i++){
			char a = (char) data[i];
			System.out.println(data[i]);
		}
		System.out.println();
	}
}
