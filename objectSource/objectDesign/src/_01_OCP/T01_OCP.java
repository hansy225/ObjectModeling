package _01_OCP;

/*
 단일 책임의 원칙(SRP, Single Responsibility Principle)
  - 객체는 단 하나의 책임만을 가져야 한다
  
 장점 
  ⬩ 변경이 필요할 때 수정할 대상이 명확
  ⬩ 시스템이 커지면서 서로 많은 의존성을 갖게 되는 상황에서 서로 영향을 주지 않도록 해 줄 수 있다
 */

class Player {
	void play() {
		System.out.println();
	}
	
	void mp3Player () {
		System.out.println();
	}
}

public class T01_OCP {
	
	public static void main(String[] args) {
	
		
	}


}
