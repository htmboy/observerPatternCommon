package weatherObserverPattern2;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的目标对象, 负责把有关状态存入到相应的观察者对象中
 * @author aooled-laptop
 *
 */
public class ConcreteWeatherSubject {
	private List<ConcreteObserver> observers = new ArrayList<ConcreteObserver>();
	
	// attach detach notifyObservers
	// 把订阅天气的人添加到订阅者列表中
	public void attach(ConcreteObserver observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	// 通知所有已经订阅天气的人
	protected void notifyObservers() {
		for(ConcreteObserver observer : observers) {
			observer.update(this);
		}
	}
	// 获取天气的内容信息
	private String weatherContent;

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		this.notifyObservers();
	}

	

	
}
