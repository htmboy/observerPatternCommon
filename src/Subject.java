import java.util.ArrayList;
import java.util.List;

/**
 * �������Ŀ�����, ��֪�����Ĺ۲���, ���ṩע��(���)��ɾ���۲��ߵĽӿ�
 * @author aooled-laptop
 *
 */
public class Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	// attach detach notifyObservers
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	protected void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(this);
		}
	}

}
