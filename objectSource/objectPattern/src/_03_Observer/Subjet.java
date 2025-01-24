package _03_Observer;

public interface Subjet {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObserver();
	
	
}
