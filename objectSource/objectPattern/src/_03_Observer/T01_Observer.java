package _03_Observer;

/*
 Observer Pattern : 감시자 패턴
 - 어떤 객체의 상태가 변할 때 그와 연관된 객체들에게 알림을 보내는 디자인 패턴
 - 객체 생성시 여러 단계를 순차적으로 거칠 때 그 단계의 순서를 결정해 두고 각 단계를 다양하게 구현할 수 있도록 하는 패턴
 */

public class T01_Observer {

	public static void main(String[] args) {
		Subjet subjet = new ConcreatSubject();
		
		ObserverA oa = new ObserverA();
		ObserverB ob = new ObserverB();
		
		// 구독자(감시자)
		subjet.registerObserver(oa);
		subjet.registerObserver(ob);
		
		subjet.notifyObserver();
		System.out.println("------------------------------");
		subjet.notifyObserver();
		
		subjet.removeObserver(oa);
		System.out.println("------------------------------");
		subjet.notifyObserver();

	}

}
