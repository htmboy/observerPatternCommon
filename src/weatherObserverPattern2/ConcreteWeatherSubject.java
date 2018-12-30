package weatherObserverPattern2;

import java.util.ArrayList;
import java.util.List;

/**
 * �����Ŀ�����, ������й�״̬���뵽��Ӧ�Ĺ۲��߶�����
 * @author aooled-laptop
 *
 */
public class ConcreteWeatherSubject {
	private List<ConcreteObserver> observers = new ArrayList<ConcreteObserver>();
	
	// attach detach notifyObservers
	// �Ѷ�������������ӵ��������б���
	public void attach(ConcreteObserver observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	// ֪ͨ�����Ѿ�������������
	protected void notifyObservers() {
		for(ConcreteObserver observer : observers) {
			observer.update(this);
		}
	}
	// ��ȡ������������Ϣ
	private String weatherContent;

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		this.notifyObservers();
	}

	

	
}
