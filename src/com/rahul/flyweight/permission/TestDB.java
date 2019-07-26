package com.rahul.flyweight.permission;

import java.util.ArrayList;
import java.util.Collection;

public class TestDB {
	public static Collection<String> colDB = new ArrayList<String>();
	
	static {
		colDB.add("张三,人员列表,查看");
		colDB.add("李四,人员列表,查看");
		colDB.add("李四,薪资数据,查看");
		colDB.add("李四,薪资数据,修改");
	}
}
