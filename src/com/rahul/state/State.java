package com.rahul.state;

/**
 * 状态模式
 * @author RahulRui
 *
 */
public interface State {
	/**
	 * 状态对应的处理方法
	 * @param sampleParam 具体传入多少个参数由具体的业务来定
	 * 
	 */
	public void handle(String sampleParam);
	
}
