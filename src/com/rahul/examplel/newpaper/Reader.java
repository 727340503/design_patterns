package com.rahul.examplel.newpaper;

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
	 * 拉模型模式，传的是目标对象自身
	 */
	@Override
	public void update(Subject subject) {
		System.out.println(name+"正在读报纸,报纸内容是"+((NewsPaper) subject).getContent());
	}
	
}
