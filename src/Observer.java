/**
 * ���Ǻ�һ���۲��߽ӿ�, ����һ�����µĽӿڸ���Щ��Ŀ�귢���ı��ʱ��֪ͨ�Ķ���
 * @author aooled-laptop
 *
 */
public interface Observer {
	/**
	 * ���µĽӿ�
	 * @param subject ����Ŀ��Ķ���, �����ȡ��Ӧ��Ŀ������״̬
	 */
	public void update(Subject subject);
}
