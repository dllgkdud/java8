package sec4;

public abstract class Student {
	String schoolname;
	String num;
	String name;
	
	int jum1;
	int jum2;
	int jum3;
	
	//추상화된 메서드
	abstract int compareTot(int jum1, int jum2, int jum3);
	abstract double compareAvg(int jum1, int jum2, int jum3);
	
	//일반멤버 메서드
	
}
