package com.rahul.flyweight.permission_cache;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TestDB {
	public static Collection<String> colDB = new ArrayList<String>();
	
	public static Map<String, String[]> map = new HashMap<>();
	static {
		colDB.add("����,��Ա�б�,�鿴,1");
		colDB.add("����,��Ա�б�,�鿴,1");
		colDB.add("����,����н������,�޸�,2");
		
		map.put("����н������", new String[]{"н������,�鿴","н������,�޸�"});
	}
}
