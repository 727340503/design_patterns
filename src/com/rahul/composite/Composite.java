package com.rahul.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * ��϶���ͨ����Ҫ�洢�Ӷ��󣬶������Ӳ����Ĳ�����Ϊ
* @ClassName: Composite
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��9��13��
*
 */
public class Composite extends Component{
	
	//�����洢��϶����а��������������
	private List<Component> childCompoments;

	public Composite() {
		this.childCompoments = new ArrayList<Component>();
	}
	
	/**
	 * ʾ�ⷽ��
	 */
	@Override
	public void somOperation() {
		if(null != childCompoments) {
			for(Component com : childCompoments) {
				com.somOperation();
			}
		}
	}

	@Override
	public void addChild(Component child) {
		childCompoments.add(child);
	}
	
	@Override
	public void removeChild(Component child) {
		childCompoments.remove(child);
	}
	
	@Override
	public Component getChild(int index) {
		if(index >= 0 && index < childCompoments.size()) {
			return childCompoments.get(index);
		}
		return null;
	}
}
