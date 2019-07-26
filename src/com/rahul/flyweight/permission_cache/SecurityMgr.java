package com.rahul.flyweight.permission_cache;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SecurityMgr {
	private static SecurityMgr mgr = new SecurityMgr();
	
	private SecurityMgr() {
		
	}
	
	public static SecurityMgr getInstance() {
		return mgr;
	}
	
	private Collection<Flyweight> queryByUser(String user) {
		List<Flyweight> col = new ArrayList<Flyweight>();
		
		for(String s : TestDB.colDB) {
			String[] ss = s.split(",");
			if(ss[0].equals(user)) {
				Flyweight fw = null;
				if(ss[3].equals("2")) {
					fw = new UnshatedConcreteFlyWeight();
					String[] fLeafs = TestDB.map.get(ss[1]);
					for(String fLeaf : fLeafs) {
						fw.add(FlywegithFactory.getInstance().getFlyweight(fLeaf));//�����϶�����Ӷ���
					}
				}else {
					fw = FlywegithFactory.getInstance().getFlyweight(ss[1] + "," + ss[2]);
				}
				col.add(fw);
			}
		}
		
		return col;
	}
	
	/**
	 * �ж�ĳ���û��Ƿ��ĳ��ʵ���з���Ȩ��
	 * @param user
	 * @param securityEntity
	 * @param permit
	 * @return
	 */
	public boolean hasPermit(String user, String securityEntity, String permit) {
		Collection<Flyweight> coll = this.queryByUser(user);
		if(coll.size() <= 0) {
			return false;
		}
		
		for(Flyweight f : coll) {
			if(f.match(securityEntity, permit)) {
				return true;
			}
		}
		
		return false;
	}
	
}
