package _04_DIP;

/*
 의존 역전 원칙 (DIP, Dependency Inversion Principle)
	× 고수준 모듈은 저수준 모듈의 구현에 의존해서는 안 된다
	⬩ 즉, interface(or 추상클래스)에 의존 해야지 구현 클래스(변경이 빈번하게 이루어짐)에 의존해서는 안된다
		⬩ 고수준 모듈 : 추상화된 모듈 (interface, 추상 클래스)
		⬩ 저수준 모듈 : interface(추상클래스)의 기능을 구현한 모듈
 */

public class T01_DIP {
	public static void main(String[] args) {
		Pet pet = new Pet();
		pet.setCat(new Cat());
		System.out.println(pet.getCat());
		
		pet.setDog(new Dog());
		System.out.println(pet.getDog());
		
		
		
	}

}
