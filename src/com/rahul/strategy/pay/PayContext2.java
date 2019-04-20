package com.rahul.strategy.pay;

/**
 * �µ�֧��������չ�µ�ctx
* @ClassName: PayContext2
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2019��4��20��
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
