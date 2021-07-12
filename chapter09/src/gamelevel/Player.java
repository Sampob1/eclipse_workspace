package gamelevel;

public class Player {
	
	private PlayerLevel level;     // PlayerLevel = 객체형자료형 , level = 인스턴스명
	                               // level 인스턴스 변수에 객체가 담길 경우 형변환이 자동으로 이루어지며 업캐스팅이 된다.

	public Player() {                // Player 기본 생성자
		level = new BeginnerLevel(); // 기본생성자가 호출됨과 동시에 PlayerLevel 자료형으로 업캐스팅
									 // PlayerLevel level = new BeginnerLevel();
		level.showLevelMessage();
	}
	public PlayerLevel getLevel() {
		return level;
	}
	public void upgradeLevel(PlayerLevel level) {   // 객체를 인풋값으로 받고, 형변환(업캐스팅)
		this.level = level;
		level.showLevelMessage();
	}
	public void play(int count) {
		level.go(count);
	}
	
}
// 객체 받아서 업캐스팅 부분 유의