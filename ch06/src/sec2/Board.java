package sec2;

import java.util.Date;

public class Board {
	private int num;
	private String sub;
	private String con;
	private String aut;
	private Date res;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getCon() {
		return con;
	}
	public void setCon(String con) {
		this.con = con;
	}
	public String getAut() {
		return aut;
	}
	public void setAut(String aut) {
		this.aut = aut;
	}
	public Date getRes() {
		return res;
	}
	public void setRes(Date res) {
		this.res = res;
	}
	//사용자 정의 메서드에서 객체 생성과 똑같은 작업을 하면 따로 생성할 필요없다.
	public void boardWrite(int num, String sub, String con, String aut, Date res){
		this.num = num; this.sub = sub; this.con = con; this.aut = aut; this.res = res;
	}
	public void boardUpdate(int num, String sub, String con){	//매개변수 = 입력받는 변수
		if(num==this.num){
			this.sub = sub;
			this.con = con;
		}
	}
	public void boardDelete(int num){
		if(num==this.num){
			this.sub = "";	//this = null; 도 사용 가능
			this.con = "";
			this.aut = "";

	/*	if(num==this.num){
			try{
				this.finalize();
			} catch(Throwable e){
				e.printStackTrace();
			}
		}
	 */
		}
	}
	public void boardSearch(int num){
		if(num==this.num){
			System.out.println(this.num+"\t"+this.sub+"\t"+this.con+"\t"+this.aut+"\t"+this.res);
		}
	}
}
