package com.rahul.flyweight.permission_composite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecurityMgr {
	private static SecurityMgr mgr = new SecurityMgr();
	
	private SecurityMgr() {
		
	}
	
	public static SecurityMgr getInstance() {
		return mgr;
	}
	
	Map<String, Collection<Flyweight>> map = new HashMap<String, Collection<Flyweight>>();
	
	public void login(String user) {
		Collection<Flyweight> col = queryByUser(user);
		map.put(user, col);
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
						fw.add(FlywegithFactory.getInstance().getFlyweight(fLeaf));//添加组合对象的子对象
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
	 * 判断某个用户是否对某个实体有访问权限
	 * @param user
	 * @param securityEntity
	 * @param permit
	 * @return
	 */
	public boolean hasPermit(String user, String securityEntity, String permit) {
		Collection<Flyweight> coll = map.get(user);
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
