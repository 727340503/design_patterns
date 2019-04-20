package com.rahul.builder;

public class ConcreteBuilder implements Builder{
	
	/**
	 * 构建起最终构建的产品对象
	 */
	private Product resultProduct;
	
	/**
	 * 获取构建器最终构建的产品对象。
	 * @author rahul.rui
	 * @date 2018年7月31日
	 * @return Product
	 *
	 */
	public Product getResult() {
		return resultProduct;
	}

	@Override
	public void buildPart() {
		//构建某个部件的功能处理
		
	}

}
