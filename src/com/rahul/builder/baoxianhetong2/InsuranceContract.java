package com.rahul.builder.baoxianhetong2;

public class InsuranceContract {
	//��ͬ���
	private String contractId;
	//������������
	private String personName;
	//�����չ�˾����
	private String companyName;
	//����ʧЧ����
	private long endDate;
	//��������
	private String otherData;
	
	/**
	 * ��ϣ���ⲿֱ��new����ֻϣ��ͬ���ܷ���
	* ����һ���µ�ʵ�� InsuranceContract.
	*
	 */
	InsuranceContract(ConcreteBuilder builder){
		this.contractId = builder.getContractId();
		this.personName = builder.getPersonName();
		this.companyName = builder.getCompanyName();
		this.endDate = builder.getEndDate();
		this.otherData = builder.getOtherData();
	}
	
	public String getContractId() {
		return contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public long getEndDate() {
		return endDate;
	}
	public void setEndDate(long endDate) {
		this.endDate = endDate;
	}
	public String getOtherData() {
		return otherData;
	}
	public void setOtherData(String otherData) {
		this.otherData = otherData;
	}
	
	public void test() {
		System.out.println("test"+contractId);
	}
}
