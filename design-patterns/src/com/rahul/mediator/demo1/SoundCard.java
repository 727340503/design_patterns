package com.rahul.mediator.demo1;
/**
 * ������
* @ClassName: SoundCard
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��8��7��
*
 */
public class SoundCard extends Colleague{

	public SoundCard(Mediator mediator) {
		super(mediator);
	}
	/**
	 * �Կ���������
	 * @author rahul.rui
	 * @date 2018��8��7��
	 * @param data
	 * @return void
	 *
	 */
	public void soundData(String data){
		System.out.println("��������"+data);
	}
	
	
}
