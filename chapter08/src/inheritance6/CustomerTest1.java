package inheritance6;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10020);                        // 슈퍼클래스의 메소드
		customerKim.setCustomerName("김유신");                     // 슈퍼클래스의 메소드
		customerKim.bonusPoint = 10000;                          // 슈퍼클래스의 변수
		System.out.println(customerKim.showCustomerInfo());      
		
	}
	
}
