package gamelevel;

public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {           // ���ø� �޼ҵ�(�۾��� ������ ����)
		run();                                  // 1. run()
		for(int i = 0; i < count; i++) {        // 2. jump() �� �� �� �������.
			jump();
		}
		turn();                                 // 3. turn()
	}
	
	final public void gotest() {
		System.out.println("fival �� �޼ҵ忡 �Ҵ� �� ���, �������̵� �Ұ���.");
	}
	public void gotest2() {
		System.out.println("�޼ҵ忡 final �� ���� ��� �������̵� ����");
	}

}