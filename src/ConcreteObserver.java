/**
 * ����Ĺ۲��߶���, ʵ�ָ��µķ���, ʹ�����״̬��Ŀ���״̬����һ��
 * @author aooled-laptop
 *
 */
public class ConcreteObserver implements Observer {

	private String observerState;
	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		observerState = ((ConcreteSubject)subject).getSubjectState();
	}

}
