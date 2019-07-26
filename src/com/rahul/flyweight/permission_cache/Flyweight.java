package com.rahul.flyweight.permission_cache;

public interface Flyweight {
	boolean match(String securityEntity, String permit);
	
	void add(Flyweight f);
}	
