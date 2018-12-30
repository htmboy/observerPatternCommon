package weatherObserverPattern2;
import java.util.ArrayList;
import java.util.List;

/**
 * �������Ŀ�����, ��֪�����Ĺ۲���, ���ṩע��(���)��ɾ���۲��ߵĽӿ�
 * @author aooled-laptop
 *
 */
public class WeatherSubject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	// attach detach notifyObservers
	// �Ѷ�������������ӵ��������б���
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	// ֪ͨ�����Ѿ�������������
	protected void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(this);
		}
	}

}
