package com.rahul.prototype.management;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManagement {
	
	private final static Map<String, Prototype> map = new HashMap<String, Prototype>();
	
	private PrototypeManagement() {
		
	}
	
	public synchronized static void setPrototype(String prototypeId,Prototype p) {
		map.put(prototypeId, p);
	}
	
	public synchronized static void removePrototypr(String prototypeId) {
		map.remove(prototypeId);
	}
	
	public synchronized static Prototype getPrototype(String prototypeId) throws Exception {
		Prototype p = map.get(prototypeId);
		if(null == p) {
			throw new Exception("��ϣ����ȡ��ԭ�ͻ�û��ע����ѱ�ע��");
		}
		return p;
	}
}
