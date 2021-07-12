package override3;

public class Cannon extends Weapon {

	@Override
	protected int fire() {
		
		return 10;  // 대포는 한번에 10명 살상
		//return super.fire();
	}

	
}
