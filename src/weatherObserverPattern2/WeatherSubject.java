package weatherObserverPattern2;
import java.util.ArrayList;
import java.util.List;

/**
 * 这个类是目标对象, 它知道它的观察者, 并提供注册(添加)和删除观察者的接口
 * @author aooled-laptop
 *
 */
public class WeatherSubject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	// attach detach notifyObservers
	// 把订阅天气的人添加到订阅者列表中
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	// 通知所有已经订阅天气的人
	protected void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(this);
		}
	}

}
