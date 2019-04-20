package com.rahul.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合对象，通常需要存储子对象，定义有子部件的部件行为
* @ClassName: Composite
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年9月13日
*
 */
public class Composite extends Component{
	
	//用来存储组合对象中包含的子组件对象
	private List<Component> childCompoments;

	public Composite() {
		this.childCompoments = new ArrayList<Component>();
	}
	
	/**
	 * 示意方法
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
