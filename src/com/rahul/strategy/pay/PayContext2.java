package com.rahul.strategy.pay;

/**
 * 新的支付方法扩展新的ctx
* @ClassName: PayContext2
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2019年4月20日
*
 */
public class PayContext2 extends PayContext {

	private String account;

	public PayContext2(String account, String userName, double money, PayStrategy strategy) {
		super(userName, money, strategy);
		this.account = account;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

}
