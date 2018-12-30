/**
 * 具体的观察者对象, 实现更新的方法, 使自身的状态和目标的状态保持一致
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
