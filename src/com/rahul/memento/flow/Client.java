package com.rahul.memento.flow;

public class Client {
	public static void main(String[] args) {
		//����ģ���������̶���
//		FlowAMock mock = new FlowAMock("Flow");
		FlowAMockPrototype mock = new FlowAMockPrototype("Flow");
		//�������̵ĵ�һ���׶�
		mock.runPhaseOne();
		
		
		//����һ��������
//		FlowAMementoCareTaker taker = new FlowAMementoCareTaker();
		FlowAMementoFileCareTaker taker = new FlowAMementoFileCareTaker();
		//������ʱ����ı���¼���󣬲����浽�����߶����������Ҫ��
		taker.saveMemento(mock.createMemento());
		
		//���շ���1��������
		mock.schema1();
		
		//�ӹ����߻�ȡ����¼�������û�ȥ
		mock.setMemento(taker.retiveMemento());
		
		//���շ���2��������
		mock.schema2();
	}
}
