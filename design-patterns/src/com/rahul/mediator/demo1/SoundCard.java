package com.rahul.mediator.demo1;
/**
 * 声卡类
* @ClassName: SoundCard
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年8月7日
*
 */
public class SoundCard extends Colleague{

	public SoundCard(Mediator mediator) {
		super(mediator);
	}
	/**
	 * 显卡播放声音
	 * @author rahul.rui
	 * @date 2018年8月7日
	 * @param data
	 * @return void
	 *
	 */
	public void soundData(String data){
		System.out.println("画外音："+data);
	}
	
	
}
