package com.rahul.memento.calculator;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理者
 * @author RahulRui
 *
 */
public class Calculator {
	
	//命令操作的历史记录，在撤销时用
	private List<Command> undoComms = new ArrayList<Command>();
	//命令被撤销的历史记录，在恢复时用
	private List<Command> redoComms = new ArrayList<Command>();
	/**
	 * 命令操作对应的备忘录对象的历史记录，在撤销时候用
	 * 由于对于么哥命令对象，撤销和重做的状态是不一样的
	 * 撤销是回到命令操作前的状态，而重做是回到命令操作后的状态
	 * 因此对每一个命令，使用一个备忘录对象的数组来记录对应的状态
	 */
	private List<Memento[]> undoMementos = new ArrayList<>();

	/**
	 * 被撤销命令对应的备忘录对象的历史记录，在恢复时候用
	 * 数组有两个元素，第一个是命令执行前的状态，第二个是命令执行后的状态
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
		//获取操作前的备忘录对象
		Memento m1 = this.addComm.createMemento();
		
		//执行命令
		this.addComm.execute();
		
		//吧操作记录到历史记录里面
		undoComms.add(addComm);
		
		//获取操作后的备忘录对象
		Memento m2 = this.addComm.createMemento();
		
		this.undoMementos.add(new Memento[] {m1, m2});
	}

	public void substractPressed() {
		//获取操作前的备忘录对象
		Memento m1 = this.addComm.createMemento();
		
		this.subComm.execute();
		undoComms.add(subComm);
		
		//获取操作后的备忘录对象
		Memento m2 = this.addComm.createMemento();
		this.undoMementos.add(new Memento[] {m1, m2});
	}
	
	public void undoPressed() {
		if(undoComms.size() > 0) {
			//去除最后一个命令来撤销
			Command comn = undoComms.get(undoComms.size() - 1);
			//获取对应的备忘录对象
			Memento[] ms = undoMementos.get(undoMementos.size() - 1);
			
			//撤销
			comn.undo(ms[0]);
			
			//如果还有恢复的功能，那就吧这个命令记录到回复的历史记录里面
			redoComms.add(comn);
			//把相应的备忘录对象也添加过去
			redoMementos.add(ms);

			//然后把最后一个命令删除掉
			undoComms.remove(comn);
			//吧相应的备忘录对象也删除掉
			undoMementos.remove(ms);
		}else {
			System.out.println("对不起，没有可以撤销的命令");
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
			System.out.println("对不起，没有可以恢复的命令");
		}
	}
	
}
