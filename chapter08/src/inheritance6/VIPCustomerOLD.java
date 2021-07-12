package inheritance6;

public class VIPCustomerOLD {
	
	private int customerID;        // 고객 아이디
	private String customerName;   // 고객 이름
	private String customerGrade;  // 고객 등급(VIP, Gold, Silver....)
	int bonusPoint;                // 포인트 적립
	double bonusRatio;             // 포인트 적립 비율, 할인 비율
	
	private int agentID;           // VIP 고객 상담원 ID
	double saleRatio;              // VIP 할인율
	
	public VIPCustomerOLD() {
		customerGrade = "VIP";     // 기본 등급
		bonusRatio = 0.05;         // 보너스 포인트 기본 적립 비율(5%)
		saleRatio = 0.1;           // 할인율 10%
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;         // 포인트 적립
		return price - (int)(price * saleRatio);  // 10%가 할인된 가격
	}
	
	public int getAgentID() {                     // VIP 고객을 위한 AgentID
		return agentID;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
}
