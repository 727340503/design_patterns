package com.rahul.examplel;
/**
 * �۲��߽ӿڣ�����һ�����µĽӿڸ���Щ��Ŀ�귢���ı��ʱ��֪ͨ�Ķ���
* @ClassName: Observer
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��9��4��
*
 */
public interface Observer {
	/**
	 * ���µĽӿ�
	 * @author rahul.rui
	 * @date 2018��9��4��
	 * @param subject ����Ŀ����󣬺û�ȡ��Ӧ��Ŀ������״̬
	 * @return void
	 *
	 */
	public void update(Subject subject);
}
