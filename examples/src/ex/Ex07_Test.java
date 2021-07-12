package ex;

public class Ex07_Test {
	public static void main(String[] args) {
		Ex07 personLee = new Ex07();
		personLee.name = "이말년";
		personLee.weight = 177.6F;
		personLee.height = 80.9F;
		
		Ex07 personKim = new Ex07("김근식", 175.8F, 70.2F);
	}
}
