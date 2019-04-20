package com.rahul.examplel.newpapertui;

/**
 * 观察者，也就是订阅报纸的用户
* @ClassName: Reader
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年9月5日
*
 */
public class Reader implements Observer{
	
	private String name;
	
	public Reader(String name) {
		this.name = name;
	}

	/**
	 * 推模型模式，传的是需要的值
	 */
	@Override
	public void update(String content) {
		System.out.println(name+"正在读报纸,报纸内容是"+content);
	}
	
}
