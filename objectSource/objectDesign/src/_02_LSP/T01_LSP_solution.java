package _02_LSP;

/*
 리스코프 치환 원칙 (LSP, Liskov Substitution Principle)
  - 자식 클래스는 최소한 부모 클래스의 기능은 수행할 수 있어야 한다
 */

class Dog {
	void speak () {
		System.out.println("멍멍");
	}
}

class WhiteDog extends Dog {
	String color = "white";
	@Override
	void speak() {
		System.out.println("멍멍멍");
	}
}

class BlackDog extends Dog {
	String color = "black";
	@Override
	void speak() {
		System.out.println("멍멍멍멍");
	}
}

public class T01_LSP_solution {

	public static void main(String[] args) {
		
		Dog dog = new WhiteDog();
		WhiteDog wDog = (WhiteDog)dog;
		System.out.print(((WhiteDog)dog).color +"색 강아지의 소리 : ");
		dog.speak();
		
		dog = new BlackDog();
		System.out.print(((BlackDog)dog).color +"색 강아지의 소리 : ");
		dog.speak();

	}

}
