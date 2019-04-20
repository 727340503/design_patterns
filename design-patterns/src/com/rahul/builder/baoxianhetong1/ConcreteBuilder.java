package com.rahul.builder.baoxianhetong1;

public class ConcreteBuilder {
	// ��ͬ���
	private String contractId;
	// ������������
	private String personName;
	// �����չ�˾����
	private String companyName;
	// ����ʧЧ����
	private long endDate;
	// ��������
	private String otherData;
	
	/**
	 * ����Ҫ��Ĳ���
	* ����һ���µ�ʵ�� ConcreteBuilder.
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
	 * ѡ�����ݣ���������Ա������
	 * @author rahul.rui
	 * @date 2018��8��3��
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
	 * ѡ����󣬱����չ�˾����
	 * @author rahul.rui
	 * @date 2018��8��3��
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
	 * ѡ������
	 * @author rahul.rui
	 * @date 2018��8��3��
	 * @param otherData
	 * @return void
	 *
	 */
	public ConcreteBuilder setOtherData(String otherData) {
		this.otherData = otherData;
		return this;
	}
	/**
	 * ���������Ķ��󲢷��أ�
	 * Ҳ���������ص�Լ�������磺company��persion����ͬʱ���ڵȡ�
	 * @author rahul.rui
	 * @date 2018��8��3��
	 * @return
	 * @return InsuranceContract
	 *
	 */
	public InsuranceContract build() {
		return new InsuranceContract(this);
	}

}
