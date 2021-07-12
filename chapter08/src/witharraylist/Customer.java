package witharraylist;

public class Customer {

	protected int customerID;                // 고객 아이디
	protected String customerName;           // 고객 이름
	protected String customerGrade;          // 고객 등급(VIP, Gold, Silver .....)
	int bonusPoint;                        // 포인트 적립
	double bonusRatio;                     // 포인트 적립 비율, 할인 비율
	
	public Customer() {                    // 기본생성자
		initCustomer();                    // 초기화
	}
	public Customer(int customerID, String customerName) {  // 오버로딩 사용해 만든 기본생성자
		this.customerID = customerID; 
		this.customerName = customerName;
		
		initCustomer();
	}
	
	public void initCustomer() {           // 첫 고객 등급 초기화설정 값을 나타내는 메소드(처음 회원가입을 했을 때, 기본 등급 설정)
		customerGrade = "SILVER";          // 기본 등급
		bonusRatio = 0.01;                 // 보너스 포인트 기본 적립 비율(1%)
	}
	
	public int calcPrice(int price) {      // 포인트 적립, 가격 할인(VIP(10%), Gold(10%))
		bonusPoint += price * bonusRatio;  // 포인트 적립.
		return price;
	}
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + " 입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
}
