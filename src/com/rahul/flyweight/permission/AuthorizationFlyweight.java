package com.rahul.flyweight.permission;

public class AuthorizationFlyweight implements Flyweight {
	// 内部状态，安全实体
	private String securityEntity;
	// 内部状态，权限
	private String permit;

	/**
	 * 够早方法，传入状态数据
	 * 
	 * @param key
	 */
	public AuthorizationFlyweight(String key) {
		String[] ss = key.split(",");
		this.securityEntity = ss[0];
		this.permit = ss[1];
	}

	public String getSecurityEntity() {
		return securityEntity;
	}

	public String getPermit() {
		return permit;
	}

	@Override
	public boolean match(String securityEntity, String permit) {

		if (this.securityEntity.equals(securityEntity) && this.permit.equals(permit)) {
			return true;
		}

		// TODO Auto-generated method stub
		return false;
	}

}
