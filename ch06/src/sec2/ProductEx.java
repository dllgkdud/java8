package sec2;

import java.util.Scanner;

public class ProductEx {

	public static void main(String[] args) {
	/*	Product pr1 = new Product("a01","냉장고",3,80000);
		pr1.printProduct();
		pr1.printImg("icetank01.jpg");
	*/
	  Scanner sc = new Scanner(System.in);
	  Product p1 = new Product();
	  System.out.print("제품코드: ");
	  p1.setPid(sc.next());
	  System.out.print("제품명: ");
	  p1.setPname(sc.next());
	  System.out.print("제품수량: ");
	  p1.setAmount(sc.nextInt());
	  System.out.print("제품가격: ");
	  p1.setPrice(sc.nextInt());
	  System.out.print("제품이미지: ");
	  p1.setImg(sc.next());

	  System.out.println("---------------------");
	  System.out.println("제품아이디: "+p1.getPid()+"\n제품명: "+p1.getPname()+"\n제품수량: "+p1.getAmount()+"\n제품가격: "+p1.getPrice()+"\n제품이미지: "+p1.getImg());
	  sc.close();
	  System.out.println();
	  System.out.println("※총 가격: "+p1.calcMoney());
	  System.out.println("---------------------");
	}
}
