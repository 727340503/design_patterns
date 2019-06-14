package com.rahul.memento.flow;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ���ߴ洢ģʽ
 * ���ٽ�memento������뵽�ڴ���
 * @author RahulRui
 *
 */
public class FlowAMementoFileCareTaker {
	
	public void saveMemento(Memento memento){
		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream("FlowAMemento")))){
			out.writeObject(memento);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Memento retiveMemento() {
		Memento memento = null;
		try (ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("FlowAMemento")))){
			memento = (Memento) in.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return memento;
	}

}
