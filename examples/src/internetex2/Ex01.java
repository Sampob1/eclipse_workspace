package internetex2;

	class TV{ 
		private String brand;
		private int year;
		private int inch;
		public TV(String brand, int year, int inch){
			this.brand = brand;
			this.year = year;
			this.inch = inch;
	}
		public void show() {
			System.out.println(brand + "���� ���� " + year + "���� " + inch + "��ġ TV");
	   }
	}

public class Ex01 {
	// �ڹ� Ŭ������ �ۼ��ϴ� ������ �غ���. ���� main()�޼ҵ带 �����Ͽ��� �� ���ÿ� ���� ��µǵ��� TV Ŭ������ �ۼ��϶�.
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32); 
		myTV.show();;
		// �������)
		// LG���� ���� 2017���� 32��ġ TV
	}
	
}
