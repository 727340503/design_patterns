package com.rahul.examplel;

import java.util.ArrayList;
import java.util.List;

/**
 * �۲���ģʽ
 * Ŀ�������֪���۲����Ĺ۲��ߣ����ṩ������ע����޳��۲��ߵĽӿڣ��Լ�֪ͨ�ӿ�
* @ClassName: Subject
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��9��4��
*
 */
public class Subject {

	/**
	 * ��������ע��Ĺ۲��߶���
	 */
	private List<Observer> obs = new ArrayList<Observer>();
	
	/**
	 * ע��۲��߶���
	 * @author rahul.rui
	 * @date 2018��9��4��
	 * @param ob
	 * @return void
	 *
	 */
	public void attach(Observer ob){
		obs.add(ob);
	}
	
	/**
	 * �޳��۲��߶���
	 * @author rahul.rui
	 * @date 2018��9��4��
	 * @param ob
	 * @return void
	 *
	 */
	public void detach(Observer ob) {
		obs.remove(ob);
	}
	
	/**
	 * ֪ͨ�۲��߶���
	 * @author rahul.rui
	 * @date 2018��9��4��
	 * @return void
	 *
	 */
	public void notifiObserver() {
		for(Observer ob : obs){
			ob.update(this);
		}
	}
}
