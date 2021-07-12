package gamelevel;

public class Player {
	
	private PlayerLevel level;     // PlayerLevel = ��ü���ڷ��� , level = �ν��Ͻ���
	                               // level �ν��Ͻ� ������ ��ü�� ��� ��� ����ȯ�� �ڵ����� �̷������ ��ĳ������ �ȴ�.

	public Player() {                // Player �⺻ ������
		level = new BeginnerLevel(); // �⺻�����ڰ� ȣ��ʰ� ���ÿ� PlayerLevel �ڷ������� ��ĳ����
									 // PlayerLevel level = new BeginnerLevel();
		level.showLevelMessage();
	}
	public PlayerLevel getLevel() {
		return level;
	}
	public void upgradeLevel(PlayerLevel level) {   // ��ü�� ��ǲ������ �ް�, ����ȯ(��ĳ����)
		this.level = level;
		level.showLevelMessage();
	}
	public void play(int count) {
		level.go(count);
	}
	
}
// ��ü �޾Ƽ� ��ĳ���� �κ� ����