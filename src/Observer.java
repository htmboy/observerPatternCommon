/**
 * 这是和一个观察者接口, 定义一个更新的接口给那些在目标发生改变的时候被通知的对象
 * @author aooled-laptop
 *
 */
public interface Observer {
	/**
	 * 更新的接口
	 * @param subject 传入目标的对象, 方便获取相应的目标对象的状态
	 */
	public void update(Subject subject);
}
