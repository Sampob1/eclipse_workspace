package inheritance6;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10020);                        // ����Ŭ������ �޼ҵ�
		customerKim.setCustomerName("������");                     // ����Ŭ������ �޼ҵ�
		customerKim.bonusPoint = 10000;                          // ����Ŭ������ ����
		System.out.println(customerKim.showCustomerInfo());      
		
	}
	
}