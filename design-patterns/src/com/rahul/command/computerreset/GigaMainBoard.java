package com.rahul.command.computerreset;

/**
 * ���������࣬������������ʵ����
* @ClassName: GigaMainBoard
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��9��6��
*
 */
public class GigaMainBoard implements MainBoardApi{

	@Override
	public void open() {
		System.out.println("�����������ڿ���.......");
		System.out.println("��ͨ��Դ.......");
	}

	@Override
	public void reset() {
		System.out.println("������������������.......");
		System.out.println("��ͨ��Դ.......");
		
	}

}
