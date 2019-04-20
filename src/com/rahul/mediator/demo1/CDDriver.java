package com.rahul.mediator.demo1;
/**
 * ������
* @ClassName: CDDriver
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��8��7��
*
 */
public class CDDriver extends Colleague{

	public CDDriver(Mediator mediator) {
		super(mediator);
	}
	
	/**
	 * ������ȡ����������
	 */
	private String data = "";
	
	public String getData(){
		return this.data;
	}
	
	public void readCD() {
		this.data = "Hello,���ǹ���������";
		this.getMediator().changed(this);
	}
	
}
