/**
 * �����Ŀ�����, ������й�״̬���뵽��Ӧ�Ĺ۲��߶�����
 * @author aooled-laptop
 *
 */
public class ConcreteSubject extends Subject {
	// Ŀ������״̬
	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
		this.notifyObservers();
	}
	
}
