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
		System.out.println(texiNumber + "�� �°��� " + passengerCount + "���̰�, ������ " + money + "�� �Դϴ�.");
	}

}
