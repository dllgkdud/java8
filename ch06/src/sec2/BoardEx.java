package sec2;

import java.util.Date;	//오늘 날짜로 설정
import java.util.Scanner;

public class BoardEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board[] b1 = new Board[100];	//임의의 배열함수를 설정 후 미리 항목 갯수를 선언
		for(int i=0;i<b1.length;i++){	//객체의 배열은 선언 및 초기화 필요
			b1[i] = new Board();
		}
		
		boolean run = true;	//작업의 계속여부
		int cnt = 0;	//배열의 개수 카운트
		
		while(run){
			System.out.println("---------------------------------------");
			System.out.println("1.[글쓰기] | 2.[글수정] | 3.[글삭제] | 4.[글검색]");
			System.out.println("---------------------------------------");
			System.out.print("작업 번호> ");
			int job = sc.nextInt();
			int num; String sub; String con; String aut;
			switch(job){
				case 1:
					System.out.println("\n[입 력 창]");
					System.out.print("제목: ");
					sub=sc.next();
					System.out.print("내용: ");
					con=sc.next();
					System.out.print("작성자: ");
					aut=sc.next();
					Date res = new Date();
					b1[cnt].boardWrite(cnt, sub, con, aut, res);
					cnt++;
					break;
				case 2:
					System.out.println("\n[수 정 창]");
					System.out.print("번호: ");
					num=sc.nextInt();
					System.out.print("제목: ");
					sub=sc.next();
					System.out.print("내용: ");
					con=sc.next();
					for(int a=0;a<cnt;a++){
						b1[a].boardUpdate(num, sub, con);
					}
					break;
				case 3:
					System.out.println("\n[삭 제]");
					System.out.print("번호: ");
					num=sc.nextInt();
					for(int a=0;a<cnt;a++){
						b1[a].boardDelete(num);
					}
					break;
				default:
					System.out.println("프로그램 종료");
					run=false;
			}
		}			
	}
}
