package weatherObserverPattern;
/**
 * 具体的目标对象, 负责把有关状态存入到相应的观察者对象中
 * @author aooled-laptop
 *
 */
public class ConcreteWeatherSubject extends WeatherSubject {
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
