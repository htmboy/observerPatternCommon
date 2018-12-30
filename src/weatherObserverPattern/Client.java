package weatherObserverPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1, ����Ŀ��
		ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
		
		//2, �����۲���
		ConcreteObserver observerGirl = new ConcreteObserver();
		observerGirl.setObserverName("������Ů����");
		observerGirl.setRemindThing("�����ǵĵ�һ��Լ��, �ص���Ĺ�԰, ������ɢŶ");
		
		ConcreteObserver observerMum = new ConcreteObserver();
		observerMum.setObserverName("����");
		observerMum.setRemindThing("��һ������ĺ�����,����ȥ���ɨ��");
		
		// 3, ע��۲���
		weather.attach(observerGirl);
		weather.attach(observerMum);
		
		
		// 4, Ŀ�귢������
		weather.setWeatherContent("������������, �������, ����28��");
		
	}

}
