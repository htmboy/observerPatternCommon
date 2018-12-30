package weatherObserverPattern2;

import javax.security.auth.Subject;

/**
 * ����Ĺ۲��߶���, ʵ�ָ��µķ���, ʹ�����״̬��Ŀ���״̬����һ��
 * @author aooled-laptop
 *
 */
public class ConcreteObserver {

	// �۲��ߵ�״̬, ��˭�ܵ������ѶϢ, ������Ů���ѻ���������
	private String observerName;
	
	// �������ݵ����, �����Ϣ��Ŀ�괦��ȡ
	private String weatherContent;
	
	// ���ѵ�����: Ů��������Լ��, �������������ѹ���
	private String remindThing;
	
	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
	}

	public String getRemindThing() {
		return remindThing;
	}

	public void setRemindThing(String remindThing) {
		this.remindThing = remindThing;
	}

	// ��ȡĿ�����״̬ͬ����
	// ��ȡĿ�����״̬ͬ�����۲��ߵ�״̬��
	public void update(ConcreteWeatherSubject subject) {
		// TODO Auto-generated method stub
		weatherContent = ((ConcreteWeatherSubject)subject).getWeatherContent();
		System.out.println(observerName + "�յ���" + weatherContent + "," + remindThing);
	}

}
