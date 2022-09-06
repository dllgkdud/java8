package sec1;
//프로그램의 모든 명령은 Op-code와 Operand로 이루어짐
//a의 기억장소 내 데이터와 b의 기억장소 내 데이터를 합쳐라
//a, b : 주소(Operand_피연산자)
//+ : 연산(명령) -> Op-code(연산자)
//a = a + b;	제 2주소 명령(기억)방식
// 주소(기억장소의 개수)에 따라 0주소 ~ 3주소 명령어 형식
//입력항에 따라 단항 연산(unary)과 이항 연산(binary)으로 분류됨	boolean a=true, b=!a (단항 연산)
public class Oper1 {
	public static void main(String[] args) {
		int a=20, b=30, c;
		System.out.println(a);	//제 1주소 명령형식
		c = a + b;
		//운용방식1 : +ab	- pre(fix) order (전위)
		//운용방식2 : ab+	- post(fix) order (후위)
		//운용방식3 : a+b	- in(fix) order (중위)
		int x = 10, y = 20;
		System.out.println(++x);
	}

}
