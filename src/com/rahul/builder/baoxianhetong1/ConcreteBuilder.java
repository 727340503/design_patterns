package com.rahul.builder.baoxianhetong1;

public class ConcreteBuilder {
	// 合同编号
	private String contractId;
	// 被保险人名称
	private String personName;
	// 被保险公司名称
	private String companyName;
	// 保险失效日期
	private long endDate;
	// 其他数据
	private String otherData;
	
	/**
	 * 必须要填的参数
	* 创建一个新的实例 ConcreteBuilder.
	*
	* @param contractId
	* @param endDate
	 */
	public ConcreteBuilder(String contractId,long endDate){
		this.contractId = contractId;
		this.endDate = endDate;
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

	/**
	 * 选填数据，被保险人员的名称
	 * @author rahul.rui
	 * @date 2018年8月3日
	 * @param personName
	 * @return
	 * @return ConcreteBuilder
	 *
	 */
	public ConcreteBuilder setPersonName(String personName) {
		this.personName = personName;
		return this;
	}

	public String getCompanyName() {
		return companyName;
	}

	/**
	 * 选填对象，被保险公司名称
	 * @author rahul.rui
	 * @date 2018年8月3日
	 * @param companyName
	 * @return void
	 *
	 */
	public ConcreteBuilder setCompanyName(String companyName) {
		this.companyName = companyName;
		return this;
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

	/**
	 * 选填数据
	 * @author rahul.rui
	 * @date 2018年8月3日
	 * @param otherData
	 * @return void
	 *
	 */
	public ConcreteBuilder setOtherData(String otherData) {
		this.otherData = otherData;
		return this;
	}
	/**
	 * 构建真正的对象并返回，
	 * 也可以添加相关的约束，比如：company和persion不能同时存在等。
	 * @author rahul.rui
	 * @date 2018年8月3日
	 * @return
	 * @return InsuranceContract
	 *
	 */
	public InsuranceContract build() {
		return new InsuranceContract(this);
	}

}
