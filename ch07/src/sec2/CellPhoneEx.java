package sec2;

public class CellPhoneEx {

	public static void main(String[] args) {
		CellPhone p1 = new CellPhone();
		p1.powerOn();
		p1.bell();
		p1.hangIn();
		p1.sendVoice("여보세요.");
		p1.receiveVoice("이번에 신청하신 카드발급 안내전화입니다.");
		p1.hangOut();
		p1.powerOff();
	}
}
