package weatherObserverPattern;
/**
 * �����Ŀ�����, ������й�״̬���뵽��Ӧ�Ĺ۲��߶�����
 * @author aooled-laptop
 *
 */
public class ConcreteWeatherSubject extends WeatherSubject {
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
