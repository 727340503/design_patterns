package com.rahul.builder.baoxianhetong2;

public class InsuranceContract {
	//合同编号
	private String contractId;
	//被保险人名称
	private String personName;
	//被保险公司名称
	private String companyName;
	//保险失效日期
	private long endDate;
	//其他数据
	private String otherData;
	
	/**
	 * 不希望外部直接new对象，只希望同包能访问
	* 创建一个新的实例 InsuranceContract.
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
