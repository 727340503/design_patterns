package com.rahul.memento.calculator;

import java.util.ArrayList;
import java.util.List;

/**
 * ������
 * @author RahulRui
 *
 */
public class Calculator {
	
	//�����������ʷ��¼���ڳ���ʱ��
	private List<Command> undoComms = new ArrayList<Command>();
	//�����������ʷ��¼���ڻָ�ʱ��
	private List<Command> redoComms = new ArrayList<Command>();
	/**
	 * ���������Ӧ�ı���¼�������ʷ��¼���ڳ���ʱ����
	 * ���ڶ���ô��������󣬳�����������״̬�ǲ�һ����
	 * �����ǻص��������ǰ��״̬���������ǻص�����������״̬
	 * ��˶�ÿһ�����ʹ��һ������¼�������������¼��Ӧ��״̬
	 */
	private List<Memento[]> undoMementos = new ArrayList<>();

	/**
	 * �����������Ӧ�ı���¼�������ʷ��¼���ڻָ�ʱ����
	 * ����������Ԫ�أ���һ��������ִ��ǰ��״̬���ڶ���������ִ�к��״̬
	 */
	private List<Memento[]> redoMementos = new ArrayList<>();
	
	private Command addComm;
	
	private Command subComm;

	public void setAddComm(Command addComm) {
		this.addComm = addComm;
		
	}

	public void setSubComm(Command subComm) {
		this.subComm = subComm;
	}
	
	public void addPressed() {
		//��ȡ����ǰ�ı���¼����
		Memento m1 = this.addComm.createMemento();
		
		//ִ������
		this.addComm.execute();
		
		//�ɲ�����¼����ʷ��¼����
		undoComms.add(addComm);
		
		//��ȡ������ı���¼����
		Memento m2 = this.addComm.createMemento();
		
		this.undoMementos.add(new Memento[] {m1, m2});
	}

	public void substractPressed() {
		//��ȡ����ǰ�ı���¼����
		Memento m1 = this.addComm.createMemento();
		
		this.subComm.execute();
		undoComms.add(subComm);
		
		//��ȡ������ı���¼����
		Memento m2 = this.addComm.createMemento();
		this.undoMementos.add(new Memento[] {m1, m2});
	}
	
	public void undoPressed() {
		if(undoComms.size() > 0) {
			//ȥ�����һ������������
			Command comn = undoComms.get(undoComms.size() - 1);
			//��ȡ��Ӧ�ı���¼����
			Memento[] ms = undoMementos.get(undoMementos.size() - 1);
			
			//����
			comn.undo(ms[0]);
			
			//������лָ��Ĺ��ܣ��ǾͰ���������¼���ظ�����ʷ��¼����
			redoComms.add(comn);
			//����Ӧ�ı���¼����Ҳ��ӹ�ȥ
			redoMementos.add(ms);

			//Ȼ������һ������ɾ����
			undoComms.remove(comn);
			//����Ӧ�ı���¼����Ҳɾ����
			undoMementos.remove(ms);
		}else {
			System.out.println("�Բ���û�п��Գ���������");
		}
	}
	
	public void redoPressd() {
		if(redoComms.size() > 0) {
			Command comm = redoComms.get(redoComms.size() - 1);
			Memento[] ms = redoMementos.get(redoMementos.size() - 1);
			
			comm.redo(ms[1]);
			
			undoComms.add(comm);
			undoMementos.add(ms);
			
			redoComms.remove(comm);
			redoMementos.remove(ms);
		}else {
			System.out.println("�Բ���û�п��Իָ�������");
		}
	}
	
}
