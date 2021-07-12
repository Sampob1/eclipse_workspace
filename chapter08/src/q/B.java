package q;

import p.A;

public class B extends A{

	void set() {
		
		pub = 1;   // public : 모든 다른 패키지에서 접근 가능.
		pro = 2;   // protected : 같은 패키지일 때 접근 가능, 상속관계일 때 다른 패키지에서 접근 가능. 
		//def = 3;   // default : 같은 패키지일 때 접근 가능.
		//pri = 4;   // private : 다른 클래스에서 접근 차단.
	}
	
}
