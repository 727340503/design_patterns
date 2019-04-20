package com.rahul.examplel;
/**
 * 观察者接口，定义一个更新的接口给那些在目标发生改变的时候被通知的对象
* @ClassName: Observer
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年9月4日
*
 */
public interface Observer {
	/**
	 * 更新的接口
	 * @author rahul.rui
	 * @date 2018年9月4日
	 * @param subject 传入目标对象，好获取相应的目标对象的状态
	 * @return void
	 *
	 */
	public void update(Subject subject);
}
