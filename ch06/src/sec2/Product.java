package sec2;

public class Product { //특정 개체에 속성 값을 저장하는 기능(멤버필드)
	private String pid;
	private String pname;
	private int amount;
	private int price;
	private String img;
	
	//constructor: 생성자(객체를 생성하여 미리 저장할 매개변수의 목록을 지정)
	//[접근제한자] = 생략 시 default로 적용
	//[매개변수] = 타입에 따라 여러 값을 넣을 수 있음(오버로딩)
	public Product(){ };
	public Product(String pid, String pname) {this.pid = pid; this.pname = pname;}
		public Product(String pid, String pname, int amount, int price) {
		this.pid = pid; this.pname = pname; this.amount = amount; this.price = price;
	}
	
	//메서드에 각각의 필드를 지정(setter)하고 불러(getter)온다.
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	//호출할 값이 있다면 매개변수에 객체를 지정한다.[this.]
	public int calcMoney(){
		return amount*price;
	}
	public String calcRank(){
		String rank="";
		if(price>=100000){
			rank="고가";
		} else if(price>=50000){
			rank="중저가";
		} else {
			rank="저가";
		}
		return rank;
	}
	/* public String calcRank{
		if(price>=100000) return "고가";
		else if(price>=50000) return "중저가";
		else return "저가"
	   }	- 실행목록이 두 줄 이상이면 {} 처리 필요
	 */
	public void printImg(String img){ 
		System.out.println(img);
	}
	public void printProduct(){
		System.out.println("제품아이디: "+pid+"\n제품명: "+pname+"\n제품수량: "+amount+"\n제품가격: "+price+"\n제품이미지: "+img);
	}
}
