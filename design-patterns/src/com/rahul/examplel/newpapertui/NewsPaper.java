package com.rahul.examplel.newpapertui;
/**
 * 目标对象，也就是报社
* @ClassName: NewsPaper
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年9月5日
*
 */
public class NewsPaper extends Subject {

	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		this.notifi(this.getContent());
	}

}
