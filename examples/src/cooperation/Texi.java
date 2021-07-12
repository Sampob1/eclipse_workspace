package cooperation;

public class Texi {
	String texiNumber;
	int passengerCount;
	int money;
	
	public Texi(String texiNumber) {
		this.texiNumber = texiNumber;
	}
		
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(texiNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}

}
