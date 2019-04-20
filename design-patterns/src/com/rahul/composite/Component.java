package com.rahul.composite;

/**
 * ������������Ϊ����еĶ��������ӿڣ�ʵ�ֽӿڵ�ȱʡ��Ϊ
* @ClassName: Component
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��9��13��
*
 */
public abstract class Component {

	/**
	 * ʾ�ⷽ�����������������еĹ��ܷ���
	 * @author rahul.rui
	 * @date 2018��9��13��
	 * @return void
	 *
	 */
	public abstract void somOperation();
	
	public void addChild(Component child) {
		//ȱʡʵ�֣��׳��쳣����ΪҶ�Ӷ���û��������ܣ����������û��ʵ��������ܡ�
		throw new UnsupportedOperationException("����֧���������");
	}
	
	public void removeChild(Component child) {
		//ȱʡʵ�֣��׳��쳣����ΪҶ�Ӷ���û��������ܣ����������û��ʵ��������ܡ�
		throw new UnsupportedOperationException("����֧���������");
	}
	
	public Component getChild(int index) {
		//ȱʡʵ�֣��׳��쳣����ΪҶ�Ӷ���û��������ܣ����������û��ʵ��������ܡ�
		throw new UnsupportedOperationException("����֧���������");
	}
}
