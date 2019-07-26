package com.rahul.flyweight.permission_composite;

/**
 * ���ģʽ�е�Ҷ�Ӷ���
 * @author RahulRui
 *
 */
public class AuthorizationFlyweight implements Flyweight {
	// �ڲ�״̬����ȫʵ��
	private String securityEntity;
	// �ڲ�״̬��Ȩ��
	private String permit;

	/**
	 * ���緽��������״̬����
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

	@Override
	public void add(Flyweight f) {
		throw new UnsupportedOperationException("��ʱ��֧�ָù���");
	}

}
