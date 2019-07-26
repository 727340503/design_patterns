package com.rahul.flyweight.permission_cache;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TestDB {
	public static Collection<String> colDB = new ArrayList<String>();
	
	public static Map<String, String[]> map = new HashMap<>();
	static {
		colDB.add("张三,人员列表,查看,1");
		colDB.add("李四,人员列表,查看,1");
		colDB.add("李四,操作薪资数据,修改,2");
		
		map.put("操作薪资数据", new String[]{"薪资数据,查看","薪资数据,修改"});
	}
}
