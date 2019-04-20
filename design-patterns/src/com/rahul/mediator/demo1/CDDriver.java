package com.rahul.mediator.demo1;
/**
 * 光驱类
* @ClassName: CDDriver
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年8月7日
*
 */
public class CDDriver extends Colleague{

	public CDDriver(Mediator mediator) {
		super(mediator);
	}
	
	/**
	 * 光驱读取出来的数据
	 */
	private String data = "";
	
	public String getData(){
		return this.data;
	}
	
	public void readCD() {
		this.data = "Hello,这是光驱的数据";
		this.getMediator().changed(this);
	}
	
}
