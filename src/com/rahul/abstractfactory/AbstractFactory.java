package com.rahul.abstractfactory;

/**
 * 抽象工厂的接口，声明创建抽象产品对象的操作
* @ClassName: AbstractFactory
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年7月30日
*
 */
public interface AbstractFactory {
	
	AbstractProductA createProductA();
	
	AbstractProductB createProductB();
}	
